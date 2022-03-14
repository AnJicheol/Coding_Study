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
