import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Play p = new Play("galag", 1000, 1000);
        Start s = new Start();
    }
}

class Start extends JFrame{

    Image start_screen = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/start_screen.png").getImage();
    Image size_small = start_screen.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
    Image resized = new ImageIcon(size_small).getImage();
    Clip clip;


    Start() {
        super("galag");
        JPanel jPanel = new JPanel();
        play_music("C:/Users/82104/ideaProjects/galag/res/start_screen_bgm.wav");
        clip.loop(0);
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel("Press SpaceBar For Start");
        jPanel.add(label);
        add(jPanel);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    setVisible(false);
                    clip.stop();
                    Play p = new Play("galag", 1000, 1000);
                }
            }
        });
    }

    public void paint(Graphics g) {
        g.drawImage(resized, 0, 0, null);

    }
    public void play_music(String fileName) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(fileName));
            clip = AudioSystem.getClip();
            clip.stop();
            clip.open(ais);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

class End extends JFrame implements KeyListener {

    ArrayList<Integer> score_list = new ArrayList<>();

    End() {
        super("점수판");
        JPanel jPanel = new JPanel();
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel("현 점수 : "+ );
        jPanel.add(label);
        add(jPanel);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    setVisible(false);
                    //clip.stop();
                    Play p = new Play("galag", 1000, 1000);
                }
            }
        });
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

class Play extends JFrame implements KeyListener, Runnable {

    Play.Character pilot;

    Image missile_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/missile.png").getImage();
    Image life_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/life.png").getImage();
    Image boom_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/enemy_death.png").getImage();
    Image untouchable_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/pilot2.png").getImage();
    Image Bomb_img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/boss_death.png").getImage();
    Image size_up = Bomb_img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    Image resized = new ImageIcon(size_up).getImage();
    Image zero = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/zero.png").getImage();
    Image one = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/one.png").getImage();
    Image two = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/two.png").getImage();
    Image three = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/three.png").getImage();
    Image four = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/four.png").getImage();
    Image five = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/five.png").getImage();
    Image six = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/six.png").getImage();
    Image seven = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/seven.png").getImage();
    Image eight = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/eight.png").getImage();
    Image nine = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/nine.png").getImage();

    private final String title;
    private final int width;
    private final int height;

    int pilot_x;
    int pilot_y;
    int stage = 0;
    int count_time = 0;
    int current_time = 0;
    int bomb = 3;
    int score = 0;
    int tmp_time;
    int bomb_time;

    Image[] numbers = {zero, one, two, three, four, five, six, seven, eight, nine};

    ArrayList<int[]> stage_list = new ArrayList<>();
    int[] first_stage = {0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0};
    int[] second_stage = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
    int[] third_stage = {0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0};
    int[] forth_stage = {2,2,1,2,2,1,2,2,1,2,2,1,2,2,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int[] fifth_stage = {3};
    int[] six_stage = {1,0,1,2,0,2,0,0,0,0,0,3,0,0,2,0};
    int[] seven_stage = {1,0,1,2,3,2,0,3,0,0,0,3,0,0,2,0};

    Thread Main_thread;

    Clip main_bgm_clip;
    Clip shooting_clip;
    Clip death_clip;
    Clip bomb_clip;


    boolean Left;
    boolean Right;
    boolean Shoot;
    boolean left;
    boolean untouchable;
    boolean UseBomb;
    boolean bomb_cool;
    boolean get_score;
    boolean death;

    Image pilotImg;
    Image bufferImg;
    Graphics bufferG;

    ArrayList<Missile> missile_list = new ArrayList();
    ArrayList<Character> enemy_list = new ArrayList();
    ArrayList<explosion> Boom_list = new ArrayList<>();

    public Play (String title, int width, int height) {
        this.title = title;
        this.height = height;
        this.width = width;
        this.pilot = new Character(width, height, 4);
        this.pilot_x = pilot.x;
        this.pilot_y = pilot.y;
        this.pilotImg = pilot.img;
        stage_list.add(first_stage);
        stage_list.add(second_stage);
        stage_list.add(third_stage);
        stage_list.add(forth_stage);
        stage_list.add(fifth_stage);
        stage_list.add(six_stage);
        stage_list.add(seven_stage);
        createScreen();
    }

    private void createScreen() {
        init();
        start();
        setTitle(title);
        setSize(width, height);
        setVisible(true);
        if (death) setVisible(false);
        setBackground(Color.BLACK);
    }

    public Clip play_music(String fileName) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(fileName));
            Clip clip = AudioSystem.getClip();
            clip.stop();
            clip.open(ais);
            clip.start();
            return clip;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void init() {
        main_bgm_clip = play_music("C:/Users/82104/ideaProjects/galag/res/neonon.wav");
        main_bgm_clip.loop(0);
        pilot.x = pilot_x;
        pilot.y = pilot_y;
        stage = 0;
        pilot.life = 3;
        score = 0;
        bomb = 3;
        int[] enemies = stage_list.get(0);
        for (int i = 0; i < stage_list.get(0).length; i++) {
            int j = i / 16;
            enemy_list.add(new Character((i * 60 - 960 * j + 1), 60 + 60 * j , enemies[i]));

        }
    }



    private  void start() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        Main_thread = new Thread(this);
        Main_thread.start();

    }

    public void paint(Graphics g) {
        bufferImg = createImage(width, height);
        bufferG = bufferImg.getGraphics();
        Draw();
        Draw_score();
        Draw_missile();
        Draw_enemies();
        Draw_life();
        Draw_boom();
        Draw_UseB();
        g.drawImage(bufferImg, 0, 0, this);
    }

    public void Draw() {
        bufferG.clearRect(0, 0, width, height);
        if (!untouchable) bufferG.drawImage(pilotImg, pilot.x, pilot.y, this);
        else bufferG.drawImage(untouchable_img, pilot.x, pilot.y, this);

    }

    ArrayList<Integer> score_list = new ArrayList<>();

    public void set_score() {
        score_list.clear();
        System.out.println(score);
        int tens = 1;
        while (score >= tens) {
            tens *= 10;
        }
        tens = tens / 10;
        int score_tmp = score;
        while (tens > 0) {
            int num = score_tmp /tens;
            score_tmp -= num * tens;
            tens = tens / 10;
            score_list.add(num);
        }
    }

    public void Draw_score() {


        //System.out.println("asdf = "+list.get(0));

        for (int i = score_list.size()-1; i >= 0; i--) {
            bufferG.drawImage(numbers[score_list.get(i)], 960 - ((score_list.size() - i) * 30), 100, this);
        }

        get_score = false;

    }

    public void Draw_life() {
        for (int i = 0; i < pilot.life; i++) {
            int x =  10 + i * 50;
            if (i != 0) x += 10 * i;
            bufferG.drawImage(life_img, x, 900, this);
        }
    }
    public void Draw_enemies() {
        Character enemy;
        if (enemy_list.size() != 0) {
            for (int i = 0; i < enemy_list.size(); i++) {
                enemy = enemy_list.get(i);
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

    public void Draw_boom() {
        for (int i = 0; i < Boom_list.size(); i++) {
            explosion explosion = Boom_list.get(0);
            bufferG.drawImage(boom_img, explosion.x, explosion.y, this);
            if (count_time - explosion.start > 1) Boom_list.remove(0);
        }
    }
    public void Draw_UseB () {
        int width = resized.getWidth(null);
        int height = resized.getHeight(null);

        if (bomb_time != 0 && count_time - bomb_time < 20) {
            bufferG.drawImage(resized, 500-width/2, 500-height/2, this);
        }
        if (UseBomb) {
            bufferG.drawImage(resized, 500-width/2, 500-height/2, this);
            bomb_time = count_time;
            UseBomb = false;
        }
    }

    @Override
    public void run() {
        //System.out.println("실행");
        try{

                while(!death) {
                    keyActive();
                    System.out.println("옆으로");
                    Enemy_side();
                    System.out.println("폭탄");
                    UseB();
                    System.out.println("슛");
                    Shooting();
                    System.out.println("적 슛");
                    enemy_shooting();
                    System.out.println("피격");
                    hit();
                    System.out.println("무적");
                    count_untouchable();
                    System.out.println("다시 페인트");
                    repaint();
                    System.out.println("sleep");
                    Thread.sleep(30);
                    count_time++;
                }
                main_bgm_clip.stop();

                End e = new End();
                setVisible(false);
                //repaint();
                //Thread.sleep(30);
                //System.out.println("count = " + count_time);


        } catch (Exception e) {}



    }

    public void Enemy_side () {
        Character enemy = new Character(0, 0, 0);
        int move = 1;
        int end = 0;
        int index = 0;

        if (enemy_list.size() != 0) enemy = enemy_list.get(0);
        else Enemy_set();

        if (left) {
            move = -1;
        } else {
            end = 1000 - enemy.width;
            index = enemy_list.size()-1;
        }
        if (enemy_list.get(index).x != end) {
            for (int i = 0; i < enemy_list.size(); i++) {
                enemy = enemy_list.get(i);
                enemy.x += move;
            }
        } else {
            left = !left;
            Enemy_set();
        }
    }

    public void Enemy_set () {
        Character enemy;
        //System.out.println("1실행");
        if (enemy_list.size() != 0) { //아래로
            for (int i = 0; i < enemy_list.size(); i++) {
                enemy = enemy_list.get(i);
                if (enemy.y < height) {
                    enemy.y += 30;
                } else {
                    enemy.y = 0;
                }
            }
        } else { //클리어
            //System.out.println("클리어");
            stage += 1;
            int[] enemies;
            if (stage > 7) {
                int[] arr = new int[14];
                for (int i = 0; i < 14; i++) {
                    arr[i] = (int) (Math.random() * 3);
                }
                stage_list.add(arr);
            }
            enemies = stage_list.get(stage);

            for (int i = 0; i < enemies.length; i++) {
                int j = i / 16;
                enemy_list.add(new Character((i * 60 - 960 * j + 1), 60 + 60 * j , enemies[i]));
            }
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) Left = true;
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) Right = true;
        if (e.getKeyCode() == KeyEvent.VK_SPACE) Shoot = true;
        if (e.getKeyCode() == KeyEvent.VK_B && bomb > 0 && !bomb_cool) {
            play_music("C:/Users/82104/ideaProjects/galag/res/Grenade.wav");
            UseBomb = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) Left = false;
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) Right = false;
        if (e.getKeyCode() == KeyEvent.VK_SPACE) Shoot = false;
        if (e.getKeyCode() == KeyEvent.VK_B) UseBomb = false;
    }

    public void keyActive () {
        if (Right && pilot.x < width - pilot.width) pilot.x += pilot.move_speed;
        if (Left && pilot.x > 0) pilot.x -= pilot.move_speed;
    }

    public void enemy_shooting () {
        for (int i = 0; i < enemy_list.size(); i++) {
            Character enemy = enemy_list.get(i);
            if (enemy.shootable) {

                if (count_time % enemy.fire_speed == 0) missile_list.add(new Missile(enemy.x + enemy.width/2, enemy.y + enemy.height+10, -10));
            }
        }
    }
    public void Shooting () {
        if (count_time % pilot.fire_speed == 0) pilot.cool_time = false;
        if (Shoot && !pilot.cool_time) {
            play_music("C:/Users/82104/ideaProjects/galag/res/laser.wav");
             //System.out.println("발사");
            current_time = count_time;
            missile_list.add(new Missile(pilot.x + 30, pilot_y - 5, 10));
            Shoot = false;
            pilot.cool_time = true;
        }
        Missile ms;
        int missile_size = missile_list.size();
        int enemy_size = enemy_list.size();
        for ( int i = 0 ; i < missile_size ; ++i){
            ms = missile_list.get(i);
            ms.move();
            if (ms.x < 0){
                missile_list.remove(i);
                i--;
                missile_size = missile_list.size();
            }
            for (int j = 0 ; j < enemy_size+1; ++ j){

                Character character;
                if (j == enemy_size && !untouchable) character = pilot;
                else if (j == enemy_size) break;
                else if (ms.move_speed > 0) character = enemy_list.get(j);
                else continue;

                if (Shot(ms.x, ms.y, character.x, character.y, ms.width, ms.height, character.width, character.height)){
                    character.life -= 1;
                    play_music("C:/Users/82104/ideaProjects/galag/res/death.wav");
                    if (character.type == 4) {
                        tmp_time = count_time;
                        untouchable = true;
                        //System.out.println("무적 활성화 = "+tmp_time);
                    }
                    Boom_list.add(new explosion(count_time, character.x, character.y));
                    if (character.life <= 0 ) {
                        if (character.type != 4) {
                            score += character.score;
                            set_score();
                            enemy_list.remove(j);
                            enemy_size = enemy_list.size();
                            j--;
                        } else {
                            death = true;
                        }
                    }
                    else if (character.life == 1 && character.type == 1) {
                        enemy_list.get(j).type_2_img_set();
                    }

                    System.out.println("4번");
                    missile_list.remove(i);
                    missile_size = missile_list.size();

                    System.out.println("5번");
                }
            }
        }
    }

    public void hit () {
        int enemy_size = enemy_list.size();
        for (int i = 0; i < enemy_size; i++) {
            Character e = enemy_list.get(i);
            if (!untouchable && Shot(e.x, e.y, pilot.x, pilot_y, e.width, e.height, pilot.width, pilot.height)) {
                pilot.life -= 1;
                tmp_time = count_time;
                untouchable = true;
                //System.out.println("무적 활성화 : "+tmp_time);
                enemy_list.remove(i);
                enemy_size = enemy_list.size();
                i--;
                if (pilot.life == 0) death = true;
            }
        }
    }

    public boolean Shot(int x1, int y1, int x2, int y2, int w1, int h1, int w2, int h2){
        boolean check;

        if ( Math.abs( ( x1 + w1 / 2 )  - ( x2 + w2 / 2 ))  <  ( w2 / 2 + w1 / 2 )
                && Math.abs( ( y1 + h1 / 2 )  - ( y2 + h2 / 2 ))  <  ( h2 / 2 + h1/ 2 ) ){
            check = true;
        }else{ check = false;}

        return check;

    }

    public void UseB () {
        if (count_time % 100 == 0) bomb_cool = false;
        if (UseBomb && !bomb_cool && bomb != 0) {
            int enemy_size = enemy_list.size();
            for (int i = 0; i < enemy_size; i++) {
                enemy_list.get(i).life--;
                play_music("C:/Users/82104/ideaProjects/galag/res/death.wav");
                if (enemy_list.get(i).life <= 0) {
                    score += enemy_list.get(i).score;
                    set_score();
                    enemy_list.remove(i);
                    enemy_size = enemy_list.size();
                    i--;
                } else if (enemy_list.get(i).life == 1 && enemy_list.get(i).type == 1) {
                    enemy_list.get(i).type_2_img_set();
                }
            }
            missile_list.clear();
            bomb--;
            bomb_cool = true;
        }
    }

    public void count_untouchable() {
        //System.out.println("무적");
        if (count_time - tmp_time > 100) untouchable = false;
        //System.out.println("무적 = "+untouchable);
    }

    class Character {
        int type;
        int x;
        int y;
        int width;
        int height;
        int life;
        int score;
        boolean cool_time;
        boolean shootable;
        int fire_speed;
        int move_speed; // 5
        Image img;

        Character (int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
            character_set ();
            this.height = img.getHeight(null);
            this.width = img.getWidth(null);

        }

        private void character_set () {
            if (type == 0) {
                life = 1;
                score = 100;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/butterfly.png").getImage();
            } else if (type == 1) {
                life = 2;
                score = 150;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/fly1.png").getImage();
            } else if (type == 2) {
                life = 1;
                score = 200;
                fire_speed = 50;
                shootable = true;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/bee.png").getImage();
            } else if (type == 3) {
                life = 10;
                score = 500;
                fire_speed = 15;
                shootable = true;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/boss.png").getImage();
            } else if (type == 4) {
                x = 1000/2;
                y = 1000 - 200;
                life = 3;
                fire_speed = 15;
                move_speed = 5;
                shootable = true;
                img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/pilot1.png").getImage();
            }

        }



        public void type_2_img_set () {
            img = new ImageIcon("C:/Users/82104/ideaProjects/galag/res/fly2.png").getImage();
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

    class explosion {
        int start;
        int x;
        int y;
        explosion (int start, int x, int y) {
            this.start = start;
            this.x = x;
            this.y = y;
        }
    }


}

