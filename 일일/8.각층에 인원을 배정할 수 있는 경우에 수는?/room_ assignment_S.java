import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {{0}, {1,0}, {1,2,0}};

        Solution solution = new Solution();
        solution.solution(arr, 6);

    }
}

class Solution {
    public int[] solution (int[][] rooms, int k) {
        int[] answer = new int[rooms.length];
        int even = k/2;
        int odd = k-even;
        int odd_rooms = 0;
        int even_rooms = 0;

        for (int i = 0; i < rooms.length; i++) {
            int floor = i + 1;
            for (int j = 0; j < rooms[i].length; j++) {
                if (floor % 2 == 0) {
                    even -= rooms[i][j];
                }
                else if (floor % 2 == 1) {
                    odd -= rooms[i][j];
                }
            }
        }

        for (int i = 0; i < rooms.length; i++) {
            int remaining_seat = 0;
            int cases = 1;
            int floor = i + 1;
            int student;
            if (floor % 2 == 1) {
                student = odd - (odd_rooms*4);
            }
            else {
                student = even - (even_rooms*4);
            }

            if (student <= 0) {
                answer[i] = 0;
            }

            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] < 4){
                    remaining_seat += 4 - rooms[i][j];
                }
                if (floor % 2 == 0) even_rooms++;
                else odd_rooms++;
            }

            if (remaining_seat < student) {
                answer[i] = 1;
            }
            else {
                while (student > 0) {   ///여기 변경해야함   현재 0, 42, 0  출력
                    cases = cases * remaining_seat;
                    remaining_seat--;
                    student--;
                }
                answer[i] = cases;
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }



}
