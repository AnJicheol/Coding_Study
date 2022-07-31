import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        Game g = new Game();
    }

}

class Game extends JFrame {

    ArrayList<Obstacles> obstacle_list = new ArrayList<>();

    final int screen_width = 1200;
    final int screen_height = 600;
    final int ground_height = 200;
    final int dino_width = 50;
    final int dino_x = 100;
    int dino_height = 50;
    int dino_y = ground_height - dino_height;
    int timer = 0;
    int speed = 5;

    boolean stop = true;
    boolean death = false;
    boolean jump;
    boolean down;

    Image back_ground = new ImageIcon("res/back_ground.PNG").getImage().getScaledInstance(screen_width, screen_height, Image.SCALE_DEFAULT);
    Image ground_img = new ImageIcon("res/ground.PNG").getImage().getScaledInstance(screen_width, 20, Image.SCALE_DEFAULT);

    Image game_over_img = new ImageIcon("res/game_over.png").getImage();
    ImageIcon retry_btn_img = new ImageIcon("res/button.png");

    Image dino_death = new ImageIcon("res/dino_death.png").getImage().getScaledInstance(dino_width, dino_height, Image.SCALE_DEFAULT);
    Image dino_walk_1 = new ImageIcon("res/dino_walk_1.PNG").getImage().getScaledInstance(dino_width, dino_height, Image.SCALE_DEFAULT);
    Image dino_walk_2 = new ImageIcon("res/dino_walk_2.PNG").getImage().getScaledInstance(dino_width, dino_height, Image.SCALE_DEFAULT);
    Image dino_jump = new ImageIcon("res/dino_jump.PNG").getImage().getScaledInstance(dino_width, dino_height, Image.SCALE_DEFAULT);
    Image dino_down_1 = new ImageIcon("res/dino_down_1.png").getImage().getScaledInstance(dino_width + 10, 30, Image.SCALE_DEFAULT);
    Image dino_down_2 = new ImageIcon("res/dino_down_2.png").getImage().getScaledInstance(dino_width + 10, 30, Image.SCALE_DEFAULT);

    Image bufferImg;
    Graphics graphics;

    JPanel game_panel = new JPanel(){
        @Override
        public void paint(Graphics g) {
            bufferImg = createImage(screen_width, screen_height);
            graphics = bufferImg.getGraphics();
            Draw();
            g.drawImage(bufferImg, 0, 0, this);
        }

        private void Draw() {
            graphics.clearRect(0,0,screen_width,screen_height);
            graphics.drawImage(back_ground, 0, 0, this);
            graphics.drawImage(getDino_img(),dino_x, dino_y, this);
            graphics.drawImage(ground_img, 0, ground_height, this);
            for (int i= 0; i < obstacle_list.size(); i++) {
                graphics.drawImage(obstacle_list.get(i).get_Img(), obstacle_list.get(i).x, obstacle_list.get(i).y, this);
            }
            if (death) graphics.drawImage(game_over_img, screen_width/2 - game_over_img.getWidth(null)/2, 10, this);
        }
    };
    JPanel retry_panel = new JPanel();
    JButton retry_btn = new JButton(retry_btn_img);

    Game () {
        setTitle("Dino");
        setSize(screen_width, screen_height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        game_panel.setBounds(0,0,screen_width,screen_height);
        retry_panel.setBounds(0,0,500,200);
        game_panel.setLayout(null);
        retry_panel.setLayout(null);

        game_panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                //System.out.println("프레스 "+e);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_SPACE : {
                        if (!stop) {
                            //System.out.println("점프");
                            jump();
                        }
                        else {
                            //System.out.println("시작");
                            stop = false;
                            death = false;
                            setTimer();
                            painting();
                            move();
                            make_obstacles();
                        }
                        break;
                    }
                    case KeyEvent.VK_UP : {
                        if (!jump) {
                            jump();
                        }
                        break;
                    }
                    case KeyEvent.VK_DOWN: {
                        down();
                        break;
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    down = false;
                    int tmp = dino_height;
                    dino_height = 50;
                    if (dino_y == ground_height - tmp) {
                        dino_y = ground_height - dino_height;
                    }
                }
            }
        });

        game_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!death) jump();
            }
        });

        game_panel.setVisible(true);
        retry_panel.setBackground(new Color(255, 0,0,0));
        retry_btn.setBounds(screen_width/2 - retry_btn_img.getIconWidth()/2, 50, retry_btn_img.getIconWidth(),retry_btn_img.getIconHeight());
        retry_btn.setBorderPainted(false);
        retry_btn.setFocusPainted(false);
        retry_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
                retry_btn.setVisible(false);
            }
        });
        retry_btn.setVisible(false);
        game_panel.add(retry_btn);
        game_panel.setFocusable(true);
        add(game_panel);
        setVisible(true);
    }

    void init() {

    }

    void setTimer() {
        Thread timer_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!death) {
                    timer++;
                    //System.out.println("시간 "+timer);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        timer_thread.start();
    }

    void painting() {
        Thread paint_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //System.out.println("리페인트");
                while (!death) {
                    //System.out.println("리페인트");
                    game_panel.repaint();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                game_panel.repaint();
                retry_btn.setVisible(true);
                retry_btn.requestFocus();
            }
        });
        paint_thread.start();
    }



    void jump() {
        jump = true;
        Thread jump_thread = new Thread(new Runnable() {
            final long start = System.currentTimeMillis();
            int speed = 3;
            int jump_height = 1;
            @Override
            public void run() {
                while (!death && speed > 0 && !down) {
                    speed -= (System.currentTimeMillis() - start)/100;
                    jump_height += speed;
                    dino_y -= jump_height;
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                speed = 1;
                while (!death && dino_y != ground_height - dino_height) {
                    if (!down)speed = (int)(System.currentTimeMillis() - start)/100;
                    else speed = 3;
                    jump_height -= speed;
                    dino_y -= jump_height;
                    if (dino_y > ground_height - dino_height) dino_y = ground_height - dino_height;
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                jump = false;
            }
        });
        jump_thread.start();
    }

    void down() {
        down = true;
        dino_height = 30;
        jump();
    }

    void move() {
        Thread move_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int tmp_count = 1;
                int width;
                int height;
                int obs_x;
                int obs_y;
                while (!death) {
                    for (int i = 0; i < obstacle_list.size(); i++) {
                        obs_x = obstacle_list.get(i).x;
                        obs_y = obstacle_list.get(i).y;
                        width = obstacle_list.get(i).width;
                        height = obstacle_list.get(i).height;
                        if(obs_x > -50) {
                            obstacle_list.get(i).x -= speed;
                            if ((obs_x <= dino_x + 10 && obs_x + width >= dino_x + 10) || (obs_x <= dino_x + 40 && obs_x + width >= dino_x + 40)) {
                                if ((obs_y <= dino_y && obs_y + height >= dino_y) || (obs_y <= dino_y + 50 && obs_y + height >= dino_y + 50)) {
                                    death = true;
                                }
                            }
                        }
                        else {
                            obstacle_list.remove(i);
                            i--;
                        }
                    }
                    if (tmp_count + 100 == timer) {
                        tmp_count = timer;
                        speed +=1;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
       move_thread.start();
    }

    void make_obstacles() {
        Thread make_obs = new Thread(new Runnable() {
            @Override
            public void run() {
                int ran1;
                int ran2;
                int term;
                Random random = new Random();
                random.setSeed(System.currentTimeMillis());
                while (!death) {
                    term = 5000 - speed * 200;
                    if (term < 10) term = 10;
                    ran1 = random.nextInt(2);
                    ran2 = random.nextInt(3);

                    Obstacles obstacles;
                    if (ran1 == 0) {
                        switch (ran2) {
                            case 0: {
                                obstacles = new Obstacles("Cactus", screen_width, ground_height - 50);
                                obstacle_list.add(obstacles);
                                break;
                            }
                            case 1: {
                                obstacles = new Obstacles("Cactus", screen_width, ground_height - 50);
                                obstacle_list.add(obstacles);
                                obstacles = new Obstacles("Cactus", screen_width + 30, ground_height - 50);
                                obstacle_list.add(obstacles);
                                break;
                            }
                            default: {
                                obstacles = new Obstacles("Cactus", screen_width, ground_height - 50);
                                obstacle_list.add(obstacles);
                                obstacles = new Obstacles("Cactus", screen_width, ground_height - 50);
                                obstacle_list.add(obstacles);
                                obstacles = new Obstacles("Cactus", screen_width, ground_height - 50);
                                obstacle_list.add(obstacles);
                            }
                        }
                    } else {
                        switch (ran2) {
                            case 0: {
                                obstacles = new Obstacles("Teradon", screen_width, ground_height - 50);
                                break;
                            }
                            case 1: {
                                obstacles = new Obstacles("Teradon", screen_width, ground_height - 85);
                                break;
                            }
                            default: {
                                obstacles = new Obstacles("Teradon", screen_width, ground_height - 150);
                                break;
                            }
                        }
                        obstacle_list.add(obstacles);
                    }
                    try {
                        Thread.sleep(term);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        make_obs.start();
    }

    Image getDino_img() {
        if (death) return dino_death;
        else if (down && timer % 2 == 1) return dino_down_1;
        else if (down && timer % 2 == 0) return dino_down_2;
        else if (jump) return dino_jump;
        else if (timer % 2 == 1) return dino_walk_1;
        else return dino_walk_2;
    }

    class Obstacles {
        Image obstacle_1_img = new ImageIcon("res/obstacle_Cactus.PNG").getImage().getScaledInstance(30, 50, Image.SCALE_DEFAULT);
        Image teradon_1_img = new ImageIcon("res/teladon_1.PNG").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        Image teradon_2_img = new ImageIcon("res/teladon_2.PNG").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        String type;

        int x;
        int y;
        int width;
        int height;

        Obstacles(String type, int x, int y) {
            this.type = type;
            if (type.equals("Cactus")) {
                width = 30;
            } else {
                width = 50;
            }
            height = 50;
            this.x = x;
            this.y = y;
        }

        Image get_Img() {
            if (type.equals("Cactus")) return obstacle_1_img;
            else if (timer % 2 == 1) return teradon_1_img;
            else return teradon_2_img;
        }
    }

}
