import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {   ////9시 시작
    static public void main(String[] args) {
        Start s = new Start();
        s.main();
    }
}

class Start{

    Scanner s = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();
    String[] split_array;
    String[] answer;
    String input = "1";
    int[] tester;
    int count;



    public void main() {
        System.out.println("리스트 입력 (끝내려면 0 입력)");

        while (!input.equals("0")) {
            input = s.nextLine();
            if (!input.equals("0")) list.add(input);
        }

        for (int i = 0; i < list.get(0).length(); i++) {  //10분
            char word = list.get(0).charAt(i);
            //System.out.println(word);
            if (word == '.') {
                count++;
                //System.out.println(i);
            }
        }

        //System.out.println(count);
        ///////////////////////////////// 2분


        System.out.println("답지를 입력하세요");

        input = s.nextLine();

        answer = input.split("\\.");

        System.out.println(Arrays.toString(answer));

        tester = new int[list.size()];

        ///////////////////////////////////

        for (int i = 0; i < list.size(); i++) {  //10분

            split_array = list.get(i).split("\\.");

            for (int j = 1; j < split_array.length - 1; j++) {
                split_array[j] = split_array[j].substring(0, split_array[j].length() - 1);
            }

            check(split_array, i);

        }

        int rank = 1;

        for (int i = 5; i > 0; i--) {  //설계 오류로 다시 제작 1번째 20분 2번째 10분

            int count_for_duplicate = 0;
            for (int j = 0; j < tester.length; j++) {
                if (i == tester[j]) {
                    System.out.println(rank+"등 "+(j+1)+"번 학생 총점 :"+tester[j]);
                    count_for_duplicate++;
                }
            }
            rank = rank + count_for_duplicate;

        }
    }

    void check(String[] check_list, int tester_num) { //5분

        //System.out.println(check_list.length + "  "+ answer.length+"  "+tester.length);

        for (int i = 0; i < answer.length; i++) {
            if (check_list[i+1].equals(answer[i])) tester[tester_num]++;
        }
        //System.out.println(Arrays.toString(tester));
    }

}
