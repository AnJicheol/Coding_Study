import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("한변에 길이를 입력하시오.");

        int j = 0;
        int len = input.nextInt();
        int bottom = ((len*8-1)-6*(len-1))/2;

        for(int i = 0; i < len*3-1; i++){
            if( i < len){
                System.out.println(" ".repeat((len*4-1)-i) + "*".repeat(1+(2*i)));
            }
            else if( i < len*2){
                System.out.println(" ".repeat((i-len)*3)+"*".repeat((len*8-1)-6*(i-len)));
            }
            else{
                System.out.println(" ".repeat(((i-len)*3)-(4+4*j))+"*".repeat(bottom-(2*j-j)) + " ".repeat(3+3*j+j) + "*".repeat(bottom-(2*j-j)) );
                j++;
            }
        }
    }
}
