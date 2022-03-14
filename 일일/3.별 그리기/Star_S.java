import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Start s = new Start();
        s.main();
    }
}

class Start{

    Scanner s = new Scanner(System.in);

    public void main() {
        String blank = " ";
        String color = "+";
        int length = s.nextInt();
        int height = length*3-2;

        System.out.println(blank.repeat(length*3-1)+color);

        for (int i = 0; i < height; i++) {
            if (i == length - 1) System.out.println(color.repeat(2*length*3));
            else if (i < length) System.out.println(blank.repeat(3*length-2-i) + color.repeat(i*2+3));
            else if (i < length * 2 - 1 && i > length - 1) System.out.println(blank.repeat(i-length+1)+color.repeat(6*length+2*(length-i)-2));
            else System.out.println(blank.repeat(3*length-i-2)+color.repeat((length*3-i)*2-2)+blank.repeat(3+6*(i-2*length+1))+color.repeat((length*3-i)*2-2));
        }

        System.out.println(color+blank.repeat(length*6-1)+color);
    }
}

//별같은 경우는 콘솔로 그리는데 한계가 있음 따라서 개개인이 어떻게 그리냐에 따라서 repeat내부 수식 등 조금씩 차이를 보임 하지만 전체적으로 if문을 통한 구간을 정하는 것은
//이번 과제에서 의도한 바와 같은 단 if문은 줄일 수 있었음 또 디테일에서 아쉬운 점이 존재함 이 부분은 학교에서 말해주겠음
//

