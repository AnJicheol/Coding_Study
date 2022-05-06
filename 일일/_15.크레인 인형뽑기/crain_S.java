class Solution {
    public int solution(int[][] board, int[] moves) {
            int answer = 0;
            int[] basket = new int[board.length * board.length];
            int basket_index = 0;

            for (int i = 0; i < moves.length; i++) {
                int line = moves[i]-1;
                for (int j = 0; j < board.length; j++) {
                    if (board[j][line] != 0) {
                        int last_number = basket[basket_index];
                        if (last_number == 0) {
                            basket[basket_index] = board[j][line];
                        }
                        else if (last_number != board[j][line]) {
                            basket_index++;
                            basket[basket_index] = board[j][line];
                        }
                        else {
                            basket[basket_index] = 0;
                            if(basket_index!=0) basket_index--;
                            answer+=2;
                        }
                        board[j][line] = 0;   
                        break;
                    }

                }
                
            }
            return answer;
    }
}
