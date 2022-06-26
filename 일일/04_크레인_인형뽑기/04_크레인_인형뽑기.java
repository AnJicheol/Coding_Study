import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
  
        for(int i = 0; i < moves.length ; i++){
            for(int j = 0; j < board.length; j++){
                
                int O_D = moves[i] - 1;
                if(board[j][O_D] > 0){                  
                    
                    if(stack.peek() == board[j][O_D]){
                        
                        answer += 2;
                        stack.pop();
                        board[j][O_D] = 0;
                        break;
                    }
                    stack.push(board[j][O_D]);
                    board[j][O_D] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
