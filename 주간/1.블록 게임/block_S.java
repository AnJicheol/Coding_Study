import java.util.*;
class Solution{

    ArrayList<Integer> Erased_numbers;

    public int solution(int[][] board) {
        int answer = 0;
        Erased_numbers = new ArrayList<>(board[0].length);
        Erased_numbers.add(0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!Erased_numbers.contains(board[i][j])) {

                    int[] width = {j, j};

                    int tmp = board[i][j];
                    board[i][j] = 0;

                    boolean EraseAble = get_height_width(board, width, j, i, tmp);
                    board[i][j] = tmp;

                    if(EraseAble && width[1]-width[0] != 0){
                        if (check_blank(board, width, i, tmp)) {
                            Erased_numbers.add(tmp);
                            answer++;
                            j = -1;
                        }
                    }



                }
            }
        }

        return answer;
    }

private boolean get_height_width(int[][] board, int[] arr, int width, int height, int num) {

        boolean EraseAble;

        if (width+1 < board[height].length && board[height][width+1] == num) {

            board[height][width+1] = 0;
            if (arr[1] < width+1) arr[1] = width+1;
            EraseAble = get_height_width(board, arr, width + 1, height, num);
            board[height][width+1] = num;
            if (!EraseAble) return false;
        }
        if (width-1 >= 0 && board[height][width-1] == num) {

            board[height][width-1] = 0;
            if (arr[0] > width-1) arr[0] = width-1;
            EraseAble = get_height_width(board, arr, width-1, height, num);
            board[height][width-1] = num;
            if (!EraseAble) return false;
        }
        if (height + 1 < board.length && board[height+1][width] == num) {

            board[height+1][width] = 0;
            EraseAble = get_height_width(board, arr, width, height+1, num);
            board[height+1][width] = num;
            return EraseAble;
        }

        return true;
    }

    private boolean check_blank (int[][] board, int[] arr, int height, int num) {

        int min = arr[0];
        int max = arr[1];
        int height_Max = 2;
        if (max - min == 1) height_Max = 3;

        if (height+height_Max > board.length) return false;

        for (int i = 0; i < height_Max; i++) {
            for (int j = min; j <= max; j++) {
                if (Erased_numbers.contains(board[height+i][j])) {
                    for (int up = 1; height + i - up >= 0; up++) {
                        if (!Erased_numbers.contains(board[height + i - up][j])) return false;
                    }
                } else if (board[height + i][j] != num) {
                    return false;
                }
            }
        }

        return true;
    }

}
