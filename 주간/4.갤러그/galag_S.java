import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Play p = new Play("galag", 1000, 1000);

    }
}

class Play extends JFrame implements KeyListener, Runnable {

    Play.Pilot pilot;

    Image missile_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/missile.png").getImage();
    Image life_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/life.png").getImage();

    private final String title;
    private final int width;
    private final int height;

    int pilot_x;
    int pilot_y;
    int stage = 0;
    int count_time = 0;
    int current_time = 0;

    ArrayList<int[]> stage_list = new ArrayList<>();
    int[] first_stage = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int[] second_stage = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};

    Thread Main_thread;
    Thread Enemy_thread;

    boolean Left;
    boolean Right;
    boolean Shoot;
    boolean left;
    boolean death;

    Image pilotImg;
    Image bufferImg;
    Graphics bufferG;

    ArrayList<Missile> missile_list = new ArrayList();
    ArrayList<Enemy> enemy_list = new ArrayList();

    public Play (String title, int width, int height) {
        this.title = title;
        this.height = height;
        this.width = width;
        this.pilot = new Pilot(width, height, 5, 3);
        this.pilot_x = pilot.x;
        this.pilot_y = pilot.y;
        this.pilotImg = pilot.img;
        stage_list.add(first_stage);
        stage_list.add(second_stage);
        createScreen();
    }

    private void createScreen() {
        init();
        start();
        setTitle(title);
        setSize(width, height);
        setVisible(true);
        setBackground(Color.BLACK);
    }

    private void init() {
        pilot_x = pilot.x;
        pilot_y = pilot.y;
        stage = 1;
        pilot.life = 3;
        int[] enemies = stage_list.get(0);
        for (int i = 0; i < stage_list.get(0).length; i++) {
            enemy_list.add(new Enemy((i * 60), 60 , enemies[i]));
        }
    }

    private  void start() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        Main_thread = new Thread(this);
        Main_thread.start();
        Enemy_thread = new Thread(this);
        Enemy_thread.start();
    }

    public void paint(Graphics g) {
        bufferImg = createImage(width, height);
        bufferG = bufferImg.getGraphics();
        Draw();
        Draw_missile();
        Draw_enemies();
        Draw_life();
        g.drawImage(bufferImg, 0, 0, this);
    }

    public void Draw() {
        bufferG.clearRect(0, 0, width, height);
        bufferG.drawImage(pilotImg, pilot_x, pilot_y, this);
    }

    public void Draw_life() {
        for (int i = 0; i < pilot.life; i++) {
            bufferG.drawImage(life_img, i * 50, 900, this);
        }
    }

    public void Draw_enemies() {
        Enemy enemy;
        if (enemy_list.size() != 0) {
            for (int i = 0; i < enemy_list.size(); i++) {
                enemy = enemy_list.get(i);
                //enemy.move();
                bufferG.drawImage(enemy.img, enemy.x, enemy.y, this);
                if (enemy.y > height) enemy.y = 0;
            }
        }
    }

    public void Draw_missile() {
        Missile missile;
        if (missile_list.size() != 0) {
            for (int i = 0; i < missile_list.size(); i++) {
                missile = missile_list.get(i);
                bufferG.drawImage(missile_img, missile.x, missile.y, this);

            }
        }
    }

    @Override
    public void run() {
        //System.out.println("실행");
        try{
            while(!death) {
                //System.out.println("k실행");
                keyActive();
                //System.out.println("e실행");
                Enemy_side();
                //System.out.println("s실행");
                Shooting();
                hit();
                //System.out.println("n실행");
                To_Next_Stage();
                //System.out.println("p실행");
                repaint();
                Thread.sleep(30);
                count_time++;
            }
        } catch (Exception e) {}

    }

    public void Enemy_side () {
        Enemy enemy;
        if (left) {
            if (enemy_list.get(0).x != 0) {
                for (int i = 0; i < enemy_list.size(); i++) {
                    enemy = enemy_list.get(i);
                    if (enemy.x > 0) enemy.x -= 1;
                }
            } else {
                left = false;
                Enemy_set();
            }
        }
        else {
            if (enemy_list.get(enemy_list.size()-1).x + 60 < width) {
                for (int i = 0; i < enemy_list.size(); i++) {
                    enemy = enemy_list.get(i);
                    if (enemy.x + 60 < width) enemy.x += 1;
                }
            } else {
                //System.out.println("도달");
                left = true;
                Enemy_set();
            }
        }


    }

    public void Enemy_set () {
        Enemy enemy;
        //System.out.println("1실행");
        if (enemy_list.size() != 0) {

            for (int i = 0; i < enemy_list.size(); i++) {
                enemy = enemy_list.get(i);
                if (enemy.y < height) {
                    enemy.y += 30;
                } else {
                    enemy.y = 0;
                }
            }
        }
    }



    public void To_Next_Stage () {
        //System.out.println("실행");
        if (enemy_list.size() == 0) { //클리어
            int[] enemies = stage_list.get(stage);
            for (int i = 0; i < enemies.length; i++) {
                enemy_list.add(new Enemy((i * 60), 60, enemies[i]));
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> Left = true;
            case KeyEvent.VK_RIGHT -> Right = true;
            case KeyEvent.VK_SPACE -> Shoot = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> Left = false;
            case KeyEvent.VK_RIGHT -> Right = false;
            case KeyEvent.VK_SPACE -> Shoot = false;
        }
    }

    public void keyActive () {
        //System.out.println(pilot_x);
        if (Right && pilot_x < width - pilot.width) pilot_x += pilot.move_speed;
        if (Left && pilot_x > 0) pilot_x -= pilot.move_speed;

    }

    public void Shooting () {

        if (count_time % pilot.fire_speed == 0) pilot.cool_time = false;
        if (Shoot && !pilot.cool_time) {
            current_time = count_time;
            missile_list.add(new Missile(pilot_x + 30, pilot_y - 5, 10));
            Shoot = false;
            pilot.cool_time = true;
        }
        Missile ms;
        for ( int i = 0 ; i < missile_list.size() ; ++i){
            ms = (Missile) missile_list.get(i);
            ms.move();
            if ( ms.x < 0){
                missile_list.remove(i);
            }
            for (int j = 0 ; j < enemy_list.size(); ++ j){
                Enemy en = (Enemy) enemy_list.get(j);
                if (Shot(ms.x, ms.y, en.x, en.y, ms.width, ms.height, en.width, en.height)){
                    en.life-=1;
                    if (en.life == 0) enemy_list.remove(j);
                    else enemy_list.get(j).img_set();
                    missile_list.remove(i);
                }
            }
        }
    }

    public void hit () {
        for (int i = 0; i < enemy_list.size(); i++) {
            Enemy e = enemy_list.get(i);
            if (Shot(e.x, e.y, pilot_x, pilot_y, e.width, e.height, pilot.width, pilot.height)) {
                pilot.life -= 1;
                enemy_list.remove(i);
                if (pilot.life == 0) death = true;
            }
        }
    }

    public boolean Shot(int x1, int y1, int x2, int y2, int w1, int h1, int w2, int h2){
        boolean check = false;

        if ( Math.abs( ( x1 + w1 / 2 )  - ( x2 + w2 / 2 ))  <  ( w2 / 2 + w1 / 2 )
                && Math.abs( ( y1 + h1 / 2 )  - ( y2 + h2 / 2 ))  <  ( h2 / 2 + h1/ 2 ) ){
            check = true;
        }else{ check = false;}

        return check;

    }




    static class Pilot{
        int x;
        int y;
        boolean cool_time;
        int fire_speed = 15;
        int move_speed; // 5
        int life;// 3
        Image img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/pilot1.png").getImage();
        int height = img.getHeight(null);
        int width = img.getWidth(null);
        Pilot (int width, int height, int move_speed, int life) {
            this.x = width/2;
            this.y = height - 200;
            this.move_speed = move_speed;
            this.life = life;
        }
    }

    class Missile {
        int x;
        int y;
        int move_speed;// 10
        Image img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/missile.png").getImage();
        int height = img.getHeight(null);
        int width = img.getWidth(null);
        Missile(int x, int y, int move_speed) {
            this.x = x;
            this.y = y;
            this.move_speed = move_speed;
        }
        void move () {
            this.y -= move_speed;
        }
    }

    public class Enemy{
        int x;
        int y;
        int life;
        int type;
        Image img;
        int height;
        int width;
        Enemy (int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
            enemy_set();
        }

        private void enemy_set () {
            if (type == 0) {
                life = 1;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/butterfly.png").getImage();
            } else if (type == 1) {
                life = 2;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/fly1.png").getImage();
            } else if (type == 3) {
                life = 1;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/bee.png").getImage();
            }
            height = img.getHeight(null);
            width = img.getWidth(null);
        }

        public void img_set () {
            img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/fly2.png").getImage();
        }
    }
}




