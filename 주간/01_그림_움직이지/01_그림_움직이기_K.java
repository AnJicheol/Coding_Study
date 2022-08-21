import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
class Img extends JFrame {
  
    // 마리오 이미지 만들기 , 크기 조정
    ImageIcon mario_img = new ImageIcon("/Users/kimsm5664/IdeaProjects/study/src/main/mario.jpeg");
    Image image = mario_img .getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT); // 이미지 크기 조정
    ImageIcon mario_b = new ImageIcon(image);

    // 블럭 사진 만들기 , 크기 조정
    ImageIcon brick_img = new ImageIcon("/Users/kimsm5664/IdeaProjects/study/src/main/brick.png");
    Image image1 = brick_img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT); // 이미지 크기 조정
    ImageIcon brick_b = new ImageIcon(image1);
    JLabel mario = new JLabel();
    JLabel brick = new JLabel();

    Img() {
        // 윈도우창
        this.setTitle("10픽셀씩 이미지 이동"); // 이름 설정
        this.setSize(1200, 1200); // 크기 설정
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); // 크기 변경 x
        this.setLayout(null);
        this.setLocationRelativeTo(null); // 윈도우창 가운데로

        // JLabel 이미지
        brick.setIcon(brick_b); // brick에 brick_b 이미지 셋팅
        brick.setLocation(0, 0); // 위치
        brick.setSize(1200, 1200); // 라벨크기 조정

        mario.setIcon(mario_b);
        mario.setLocation(0, 0);
        mario.setSize(50, 50);

        this.add(mario);
        this.add(brick); // 이미지 추가

        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        mario.setLocation(mario.getX(), mario.getY() - 50);
                        break;

                    case KeyEvent.VK_DOWN:
                        mario.setLocation(mario.getX(), mario.getY() + 50);
                        break;
                    case KeyEvent.VK_LEFT:
                        mario.setLocation(mario.getX() - 50, mario.getY());
                        break;
                    case KeyEvent.VK_RIGHT:
                        mario.setLocation(mario.getX() + 50, mario.getY());
                        break;
                }
            }
        });

        this.setVisible(true); // 화면을 보여주겠다
    }
}

public class study {
    public static void main(String[] args) {
        new Img();
    }
}
