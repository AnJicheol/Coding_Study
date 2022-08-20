import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class MyFrame extends JFrame{
    private Image bufferImage;
    private Graphics screenGraphic;
    ImageIcon img = new ImageIcon("C:\\dino\\dino\\image\\dino.png");
    private Image dino = img.getImage();

    private int dinoX = 50;
    private int dinoY = 370;
    private int dinoWidth = 50;
    private int dinoHeight = 50;


    private boolean up,down,left,right;

    MyFrame(){
        setTitle("Dino game");
        setVisible(true);
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                switch (e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        up = true;
                        break;
                    case KeyEvent.VK_DOWN:
                        down = true;
                        break;
                    case KeyEvent.VK_RIGHT:
                        right = true;
                        break;
                    case KeyEvent.VK_LEFT:
                        left = true;
                        break;

                }
            }
            public void keyReleased(KeyEvent e){
                switch (e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        up = false;
                        break;
                    case KeyEvent.VK_DOWN:
                        down = false;
                        break;
                    case KeyEvent.VK_RIGHT:
                        right = false;
                        break;
                    case KeyEvent.VK_LEFT:
                        left = false;
                        break;

                }
            }
        });
        while(true){
            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            keyProcess();
        }
    }

    public void keyProcess(){
        if(up && dinoY - 3 > 30) {dinoY -=5;}
        if(down && dinoY + dinoHeight + 3 < 420) {dinoY +=5;}
        if(left && dinoX - 3 > 0) {dinoX -=5;}
        if(right && dinoX + dinoWidth + 3 < 1000) {dinoX +=5;}
    }

    public void paint(Graphics g){ //잔상을 지우기 위한 더블 버퍼링 기법
        bufferImage = createImage(1000,500);
        screenGraphic = bufferImage.getGraphics();
        screendraw(screenGraphic);
        g.drawImage(bufferImage,0,0,null);
    }

    public void screendraw(Graphics g){
        g.drawImage(dino, dinoX, dinoY, dinoWidth, dinoHeight, null); // 공룡
        g.drawLine(0,420,1000,420); // 지면
        this.repaint();
    }

    public static void main(String[] args){
        MyFrame mf = new MyFrame();
    }
}

