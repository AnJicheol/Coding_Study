class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int num = 0;
        int count = 0;
        int[] result = new int[moves.length];
        
        
        for (int i = 0; i < moves.length; i ++) {
            num = moves[i] - 1;
            for (int j = 0; j < board.length; j ++) {
                if (board[j][num] != 0) {
                    result[i] = board[j][num];
                    board[j][num] = 0;
                    break;
                }
            }
        }
        
        for (int k=0; k<result.length; k++) {
            for (int i = 0; i < result.length; i ++) {
                if (result[i] != 0) {
                    for (int j = i + 1; j < result.length; j ++) {
                        if (result[j] != 0) {
                            if (result[i] == result[j]) {
                                count ++;
                                result[i] = 0;
                                result[j] = 0;
                            }
                            break;
                        }
                    }
                }
            }
        }
      
        answer = count * 2;
        return answer;
    }
}
