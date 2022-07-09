@@@@@@@@@@@@@@@@@@ 배열을 이용한 풀이 @@@@@@@@@@@@@@@@@@@@@@@

public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] basket = new int[board.length * board.length];
        int basket_index = 0;

        for (int i = 0; i < moves.length; i++) {

            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0) {
                    int last_number = basket[basket_index];
                    if (last_number == 0) {
                        basket[basket_index] = board[j][moves[i]-1];
                    }
                    else if (last_number != board[j][moves[i]-1]) {
                        basket_index++;
                        basket[basket_index] = board[j][moves[i]-1];
                    }
                    else {
                        basket[basket_index] = 0;
                        if(basket_index!=0) basket_index--;
                        answer+=2;
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

@@@@@@@@@@@@@@@@@@ 배열을 이용한 풀이 (피드백 후) @@@@@@@@@@@@@@@@@@@@@@@

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
            int[] basket = new int[moves.length + 1];
            int basket_index = 1;

            for (int move : moves) {
                for (int j = 0; j < board.length; j++) {
                    if (board[j][move - 1] != 0) {
                        basket[basket_index] = board[j][move - 1];
                        if (basket[basket_index] == basket[basket_index-1]) {
                            basket[basket_index] = 0;
                            basket[basket_index-1] = 0;
                            basket_index-=2;
                            answer += 2;
                        }
                        board[j][move - 1] = 0;
                        basket_index++;
                        break;
                    }
                }
            }

            return answer;
    }
}

@@@@@@@@@@@@@@@@@@ 스택을 이용한 풀이 @@@@@@@@@@@@@@@@@@@@@@@

public int solution2(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int line = moves[i] - 1;

            for (int j = 0; j < board[line].length; j++) {
                if (board[j][line] != 0) {
                    if (basket.isEmpty()) {
                        basket.push(board[j][line]);
                    }
                    else if (basket.peek() == board[j][line]) {
                        basket.pop();
                        answer += 2;
                    }
                    else basket.push(board[j][line]);

                    board[j][line] = 0;
                    break;
                }
            }
        }
        return answer;
    }

배열 시간
테스트 1 〉	통과 (0.02ms, 72.5MB)
테스트 2 〉	통과 (0.02ms, 75MB)
테스트 3 〉	통과 (0.02ms, 78.8MB)
테스트 4 〉	통과 (0.48ms, 78.7MB)
테스트 5 〉	통과 (0.04ms, 80.9MB)
테스트 6 〉	통과 (0.02ms, 77.7MB)
테스트 7 〉	통과 (0.03ms, 72.3MB)
테스트 8 〉	통과 (0.13ms, 75MB)
테스트 9 〉	통과 (0.14ms, 72.4MB)
테스트 10 〉통과 (0.17ms, 76.4MB)
테스트 11 〉통과 (0.32ms, 73.3MB)


스택 시간
테스트 1 〉	통과 (0.11ms, 73.2MB)
테스트 2 〉	통과 (0.13ms, 76.2MB)
테스트 3 〉	통과 (0.12ms, 75.4MB)
테스트 4 〉	통과 (0.91ms, 76.3MB)
테스트 5 〉	통과 (0.17ms, 91.3MB)
테스트 6 〉	통과 (0.12ms, 77.4MB)
테스트 7 〉	통과 (0.19ms, 85.3MB)
테스트 8 〉	통과 (0.42ms, 72.8MB)
테스트 9 〉	통과 (0.42ms, 73MB)
테스트 10 〉통과 (0.48ms, 73.6MB)
테스트 11 〉통과 (0.68ms, 75.6MB)
  
배열을 사용한 풀이가 더 빠르다.

        
피드백 후 시간

테스트 1 〉	통과 (0.02ms, 76.6MB)
테스트 2 〉	통과 (0.02ms, 78MB)
테스트 3 〉	통과 (0.03ms, 74.4MB)
테스트 4 〉	통과 (0.29ms, 74.3MB)
테스트 5 〉	통과 (0.02ms, 73.3MB)
테스트 6 〉	통과 (0.02ms, 73.8MB)
테스트 7 〉	통과 (0.03ms, 77.4MB)
테스트 8 〉	통과 (0.10ms, 71MB)
테스트 9 〉	통과 (0.07ms, 75.4MB)
테스트 10 〉통과 (0.09ms, 73.8MB)
테스트 11 〉통과 (0.18ms, 65.9MB)
     
@@@@@@@@@@@@@@@@@@@@@@@@  피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@
  
  
  
 안지철 ---------------------------------------------------------------
        
 12 번줄 코드 물론 자바는 자동으로 0으로 초기화 하지만 
 경우에 따라 값을 추적하기 어렵고 다른 사람이 코드를 봤을때 
 배열이 정상적으로 초기화를 한건지 안한건지 판단하기 어렵기 
 때문에 위험한 코드라고 생각한다
 
 12 int last_number = basket[basket_index];

또 11번째 줄부터 시작되는 if else 알고리즘은 비효율적인 것 같다

13 if (last_number == 0) {
       basket[basket_index] = board[j][moves[i]-1];
   }
   
없어도 충분히 알고리즘을 구현할 수 있다

----------------------------------------------------------------------------
        
        
