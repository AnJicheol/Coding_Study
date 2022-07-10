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
