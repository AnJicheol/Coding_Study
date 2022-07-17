import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int num = 0;
        int index = 0;
        int[] box = new int[dartResult.length()];
        
        
        for(int i = 0; i < dartResult.length(); i++){
            //숫자인 경우
            if(Character.isDigit(dartResult.charAt(i))){ // Character.isDigit = 정수형인지 확인하는 메서드
                num =+ dartResult.charAt(i) - '0'; //char형에 - '0' 을 해주면 정수형으로 바뀐다.
                if(Character.isDigit(dartResult.charAt(i+1))){
                    num = num * 10 + dartResult.charAt(i+1) - '0';
                    i++;
                }
                //System.out.println(num);
            }
            else{ // 숫자가 아닌 경우
                switch(dartResult.charAt(i)){
                    case 'S':
                        box[index] = num;
                        index++;
                        break;
                    case 'D': 
                        num = (int)Math.pow(num,2); // Math.pow = 제곱을 해주는 함수
                        box[index] = num; 
                        index ++;
                        break; 
                    case 'T': 
                        num = (int)Math.pow(num,3); 
                        box[index] = num; 
                        index ++;
                        break;
                    case '*': 
                        box[index-1] = box[index-1] * 2;
                        if(index >= 2){
                            box[index-2] = box[index-2] * 2;
                        }
                        break;
                    case '#':
                        box[index-1] = box[index-1] * (-1);
                        break;
                }
                //System.out.println(Arrays.toString(box));
            }
        }
        for(int i = 0; i < index;i++){
            answer += box[i];
        }
        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.03ms, 76.3MB)
테스트 2 〉	통과 (0.05ms, 73.8MB)
테스트 3 〉	통과 (0.05ms, 79.4MB)
테스트 4 〉	통과 (0.05ms, 74.6MB)
테스트 5 〉	통과 (0.04ms, 70.4MB)
테스트 6 〉	통과 (0.06ms, 77.2MB)
테스트 7 〉	통과 (0.05ms, 77.3MB)
테스트 8 〉	통과 (0.08ms, 77.4MB)
테스트 9 〉	통과 (0.05ms, 73.2MB)
테스트 10 〉	통과 (0.07ms, 71.3MB)
테스트 11 〉	통과 (0.06ms, 79MB)
테스트 12 〉	통과 (0.05ms, 79MB)
테스트 13 〉	통과 (0.04ms, 78.6MB)
테스트 14 〉	통과 (0.04ms, 70.2MB)
테스트 15 〉	통과 (0.05ms, 76.6MB)
테스트 16 〉	통과 (0.05ms, 74.9MB)
테스트 17 〉	통과 (0.05ms, 73.6MB)
테스트 18 〉	통과 (0.04ms, 72.6MB)
테스트 19 〉	통과 (0.05ms, 72.7MB)
테스트 20 〉	통과 (0.04ms, 78.5MB)
테스트 21 〉	통과 (0.05ms, 72.2MB)
테스트 22 〉	통과 (0.05ms, 74.8MB)
테스트 23 〉	통과 (0.05ms, 70.4MB)
테스트 24 〉	통과 (0.06ms, 70.2MB)
테스트 25 〉	통과 (0.05ms, 72.7MB)
테스트 26 〉	통과 (0.05ms, 82.7MB)
테스트 27 〉	통과 (0.05ms, 74.3MB)
테스트 28 〉	통과 (0.05ms, 76.8MB)
테스트 29 〉	통과 (0.07ms, 79.3MB)
테스트 30 〉	통과 (0.04ms, 72.8MB)
테스트 31 〉	통과 (0.05ms, 72.5MB)
테스트 32 〉	통과 (0.05ms, 72.8MB)
