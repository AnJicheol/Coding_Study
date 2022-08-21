import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        main_frame main = new main_frame();
    }
}


class main_frame extends JFrame {

    int screen_width = 1200;
    int screen_height = 1200;
    Image img;
    Graphics graphics;

    Image monkey_img = new ImageIcon("res/img.png").getImage();
    int monkey_x = 0;
    int monkey_y = 0;

    main_frame() {
        setSize(screen_width, screen_height);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP : {
                        monkey_y -= 3;
                        repaint();
                        break;
                    }
                    case KeyEvent.VK_DOWN : {
                        monkey_y += 3;
                        repaint();
                        break;
                    }
                    case KeyEvent.VK_LEFT: {
                        monkey_x -= 3;
                        repaint();
                        break;
                    }
                    case KeyEvent.VK_RIGHT:{
                        monkey_x += 3;
                        repaint();
                        break;
                    }
                }
            }

        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        img = createImage(screen_width, screen_height);
        graphics = img.getGraphics();
        graphics.drawImage(monkey_img, monkey_x, monkey_y, this);
        g.drawImage(img,0,0,this);
    }


}
