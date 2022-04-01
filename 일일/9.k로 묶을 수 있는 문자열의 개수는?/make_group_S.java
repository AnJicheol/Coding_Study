import java.util.Arrays;
import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {



        Solution solution = new Solution();
        solution.solution();

    }
}

class Solution {
    Scanner s = new Scanner(System.in);
    String[] answer;
    String word;
    int k;

    public void solution () {
        k = s.nextInt();
        word = s.next();

        int array_length = word.length();
        int len = array_length - 1;
        int count = 0;

        while (count < k-1) {
             array_length *= len;
             len--;
             count++;
        }

        answer =  new String[array_length];

        for (int i = 0; i < word.length(); i++) {
            String cases = "";
            String next = String.valueOf(word.charAt(i));
            //System.out.println(cases);
            add(cases, next, k);
        }

        System.out.println(Arrays.toString(answer));
        System.out.println("총 "+answer.length+"개");

    }


    public void add (String cases, String charAt, int limit) {
        cases += charAt;
        //System.out.println("넘어온 후 : "+ cases);
        if (cases.length() == limit) {
            //System.out.println("마지막 도달");
            int count = 0;
            while (answer[count] != null) {
                count++;
            }
            answer[count] = cases;
            return ;
        }


        for (int i = 0; i < word.length(); i++) {
            String tmp = String.valueOf(word.charAt(i));
            while (cases.contains(tmp)) {
                if (i == word.length()-1) return;
                i++;
                tmp = String.valueOf(word.charAt(i));

            }
            //System.out.println("tmp = "+tmp + " cases = " + cases);
            add(cases, tmp, limit);
        }


    }

}
