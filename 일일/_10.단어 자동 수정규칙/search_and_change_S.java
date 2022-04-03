import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution();
    }
}

class Solution {
    Scanner s = new Scanner(System.in);

    void solution() {
        String[] arr = s.nextLine().split(" ");
        String change = s.nextLine();
        int num = s.nextInt()-1;
        String target = arr[num];
        String answer = "";

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                arr[i] = change;
            }
            answer +=  arr[i] + " ";
        }
        System.out.println(answer);
    }
    
}
