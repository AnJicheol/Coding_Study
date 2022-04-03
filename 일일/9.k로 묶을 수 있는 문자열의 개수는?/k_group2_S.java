import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution();
    }
}

class Solution {
    Scanner s = new Scanner(System.in);
    String word;
    int k;
    int count = 0;

    public void solution () {
        k = s.nextInt();
        word = s.next();

        for (int i = 0; i < word.length(); i++) {
            String cases = "";
            String next = word.substring(i, i+1);
            add(cases, next);
        }

        System.out.println("\n총 "+ count +"개");
    }


    public void add (String cases, String subString) {
        cases += subString;
        //System.out.println("넘어온 후 : "+ cases);
        if (cases.length() == k) {
            //System.out.println("마지막 도달");
            System.out.print(cases + " ");
            count++;
            return ;
        }

        for (int i = 0; i < word.length(); i++) {
            String tmp = word.substring(i, i+1);
            while (cases.contains(tmp)) {
                if (i == word.length()-1) return;
                i++;
                tmp = word.substring(i, i+1);
            }
            //System.out.println("tmp = "+tmp + " cases = " + cases);
            add(cases, tmp);
        }
    }
    
}
