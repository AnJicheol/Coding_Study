class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int num = 0;
        int count = 1;
        int[] result = new int[moves.length+1];
        result[0] = 0;
        
        for (int i = 0; i < moves.length; i ++) { // moves 수만큼 반복 
            num = moves[i] - 1; // moves 값은 1부터 시작하기 때문에 -1을 해준다.
            for (int j = 0; j < board.length; j ++) { // board 만큼 반복
                if(board[j][num] != 0){ // 0이 아니면 인형을 뽑음
                    result[count] = board[j][num]; // 인형을  result 에 담고
                    board[j][num] = 0;  // 뽑은 인형을 비워 줌
                    if(result[count] == result[count-1]){
                        answer += 2;
                        count -= 2;
                    } 
                    count++;
                    break;
                }       
            }
             System.out.print(result[i]);
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.35ms, 73.9MB)
테스트 2 〉	통과 (0.59ms, 78.3MB)
테스트 3 〉	통과 (0.50ms, 75.6MB)
테스트 4 〉	통과 (7.92ms, 72.6MB)
테스트 5 〉	통과 (0.40ms, 75.7MB)
테스트 6 〉	통과 (0.37ms, 73.6MB)
테스트 7 〉	통과 (1.30ms, 73.2MB)
테스트 8 〉	통과 (3.52ms, 75.6MB)
테스트 9 〉	통과 (4.12ms, 78.4MB)
테스트 10 〉	통과 (3.36ms, 76.6MB)
테스트 11 〉	통과 (5.75ms, 76.8MB)
