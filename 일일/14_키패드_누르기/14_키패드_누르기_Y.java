import java.util.*;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String keypad = "123456789";
        int[] L_keypad = {3,0};
        int[] R_keypad = {3,2};
        int[] M_keypad = {3,1};
        int num = 0;
        
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] % 3 == 1){ // 1,4,7일 경우
                answer += 'L';
                num = keypad.indexOf(Integer.toString(numbers[i]));
                L_keypad[0] = num/3;
                L_keypad[1] = num%3;
            }
            else if(numbers[i] != 0 && numbers[i] % 3 == 0){ // 0을 제외한 3,6,9일 경우
                answer += 'R';
                num = keypad.indexOf(Integer.toString(numbers[i]));
                R_keypad[0] = num/3;
                R_keypad[1] = num%3;
            }
            else {
                // 0일 경우
                if(numbers[i] == 0){ M_keypad[0] = 3; M_keypad[1] = 1; }
                else{ // 2,5,8일 경우
                    num = keypad.indexOf(Integer.toString(numbers[i]));
                    M_keypad[0] = num/3;
                    M_keypad[1] = num%3;
                }
                // 거리계산
                int L_num = Math.abs(L_keypad[0] - M_keypad[0]) + Math.abs(L_keypad[1] - M_keypad[1]);
                int R_num = Math.abs(R_keypad[0] - M_keypad[0]) + Math.abs(R_keypad[1] - M_keypad[1]);
                
                // 왼손이 더 가까울 경우
                if(L_num < R_num){ answer += 'L'; }
                
                // 오른손이 더 가까울 경우
                else if(R_num < L_num){ answer += 'R'; }
                
                 // 거리가 같은 경우
                else{
                    if(hand.charAt(0) == 'r'){ answer += 'R'; }
                    else{ answer += 'L'; }
                }
                // 손 위치 설정
                if(answer.charAt(answer.length()-1) == 'L'){ L_keypad = M_keypad.clone(); }
                else{ R_keypad = M_keypad.clone(); }
            }
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (1.81ms, 75MB)
테스트 2 〉	통과 (1.70ms, 74.8MB)
테스트 3 〉	통과 (1.69ms, 76MB)
테스트 4 〉	통과 (1.96ms, 76.8MB)
테스트 5 〉	통과 (1.84ms, 78.6MB)
테스트 6 〉	통과 (2.55ms, 78.1MB)
테스트 7 〉	통과 (2.18ms, 75.6MB)
테스트 8 〉	통과 (2.75ms, 75.5MB)
테스트 9 〉	통과 (1.95ms, 75.6MB)
테스트 10 〉	통과 (2.05ms, 77.9MB)
테스트 11 〉	통과 (2.05ms, 77.7MB)
테스트 12 〉	통과 (2.02ms, 78.6MB)
테스트 13 〉	통과 (2.23ms, 82.8MB)
테스트 14 〉	통과 (2.67ms, 72.5MB)
테스트 15 〉	통과 (3.08ms, 77.6MB)
테스트 16 〉	통과 (2.92ms, 78.1MB)
테스트 17 〉	통과 (3.28ms, 74.8MB)
테스트 18 〉	통과 (3.40ms, 75.9MB)
테스트 19 〉	통과 (3.56ms, 75.9MB)
테스트 20 〉	통과 (3.43ms, 75.5MB)
