import java.lang.StringBuilder;

class Solution {    
    public String solution(int[] numbers, String hand) {       
        StringBuilder sb = new StringBuilder();
        int[] hand_num = {10, 12};                                      // 왼손*   오른손#
       
        for(Integer num : numbers){
            if(num == 0) num = 11;

            switch(num % 3){
                case 1 : sb.append("L"); hand_num[0] = num; break;
                case 0 : sb.append("R"); hand_num[1] = num; break;
                default :

                    int L = (hand_num[0] % 3 == 1) ? 1 : 0;              // 가로 길이 계산
                    int R = (hand_num[1] % 3 == 0) ? 1 : 0;
                    int[] row_len = {L , R};                             // 가로 길이 저장
                    L = (hand_num[0] + L) / 3;
                    R = (hand_num[1] - R) / 3;
 
                    L = Math.abs(num / 3 - L) + row_len[0];              // 세로 길이 계산
                    R = Math.abs(num / 3 - R) + row_len[1];

                    if(L == R)L = (hand.equals("left")) ? (L - 1) : (L + 1);
                        
                    if(L < R){
                        hand_num[0] = num;
                        sb.append("L");
                    }
                    if(L > R){
                        hand_num[1] = num;
                        sb.append("R");
                    }
            }
        }       
        String answer = sb.toString();     
        return answer;
    }
}
