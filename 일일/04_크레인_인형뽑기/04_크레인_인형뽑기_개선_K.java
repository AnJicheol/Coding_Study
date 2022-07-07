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
                    if(result[count] == result[count-1]){ // 뽑은 인형과 전에 뽑은 인형이 같은지 비교
                        answer += 2; // 같으면 결과 값에 2를 더 해줌
                        count -= 2; //  전에 뽑은 인형 자리로 이동 시켜서 다시 채워줌
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

테스트 1 〉	통과 (0.02ms, 71MB)
테스트 2 〉	통과 (0.02ms, 76.4MB)
테스트 3 〉	통과 (0.03ms, 82.6MB)
테스트 4 〉	통과 (0.30ms, 76.5MB)
테스트 5 〉	통과 (0.02ms, 76MB)
테스트 6 〉	통과 (0.02ms, 75.2MB)
테스트 7 〉	통과 (0.03ms, 79.8MB)
테스트 8 〉	통과 (0.09ms, 77.3MB)
테스트 9 〉	통과 (0.12ms, 84.1MB)
테스트 10 〉	통과 (0.08ms, 75MB)
테스트 11 〉	통과 (0.18ms, 86.4MB)
