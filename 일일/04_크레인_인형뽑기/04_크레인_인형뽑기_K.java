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




@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
안지철
[20번 줄 부터 시작되는 코드는 수정이 필요해 보인다 
우선 22번 코드는 무의미한 코드이다 이미 12번줄 코드에서 
0이 아닌 값은 저장이 안되기 때문이다. 또 같은 이유로 24번 코드도 무의미하다
 
12 if (board[j][num] != 0) {
 
22 if (result[i] != 0) {

24 if (result[j] != 0) {

또 3차원 for문으로 보다는 

int sum = result[0]
for (int i=1; k<result.length; k++) {
    if(sum == result[i])count++;
    else sum = result[i];
}

이런 느낌으로 최대값을 저장 후 비교 하는 방식을 사용하면 1차원 for문으로도 충분하고 
가독성 또한 높아진다. 
]
