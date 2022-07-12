import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        String num = "";
        int[] box = new int[dartResult.length()];
        
        
        for(int i = 0; i < dartResult.length(); i++){
            //숫자인 경우
            if(dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57){ 
                num += dartResult.charAt(i); //문자나 특수문자가 나오기 전까지의 숫자
                
            //영어인 경우
            }else if(dartResult.charAt(i) >= 65 && dartResult.charAt(i) <= 90){ 
                if(dartResult.charAt(i) == 'D'){
                    box[index] = (int)Math.pow(Integer.parseInt(num),2); // 2제곱
                    num = "";
                    index++;
                }
                else if(dartResult.charAt(i) == 'T'){
                    box[index] = (int)Math.pow(Integer.parseInt(num),3); // 3제곱
                    num = "";
                    index++;
                }
                else{ // S인 경우
                    box[index] = Integer.parseInt(num);
                    num = "";
                    index++;
                }
            }
            
             // 특수문자인 경우
            else{
                if(dartResult.charAt(i) == '#'){
                    box[index-1] = box[index - 1] * -1;
                }
                else{
                    box[index-1] = box[index - 1] * 2;
                    if(index >= 2){
                        box[index-2] = box[index - 2] * 2;
                    }
                }
            }
        }
        /*
        System.out.println("index : " + index);
        System.out.println(Arrays.toString(box));
        */
        for(int i = 0; i < index;i++){
            answer += box[i];
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (9.71ms, 72.3MB)
테스트 2 〉	통과 (8.82ms, 77.1MB)
테스트 3 〉	통과 (9.03ms, 78.6MB)
테스트 4 〉	통과 (11.06ms, 80.6MB)
테스트 5 〉	통과 (8.73ms, 77.5MB)
테스트 6 〉	통과 (9.03ms, 73.9MB)
테스트 7 〉	통과 (9.61ms, 82.9MB)
테스트 8 〉	통과 (9.00ms, 77.7MB)
테스트 9 〉	통과 (13.36ms, 77.4MB)
테스트 10 〉	통과 (8.93ms, 78.9MB)
테스트 11 〉	통과 (10.94ms, 78.1MB)
테스트 12 〉	통과 (9.08ms, 78.4MB)
테스트 13 〉	통과 (11.18ms, 78.6MB)
테스트 14 〉	통과 (8.86ms, 73.6MB)
테스트 15 〉	통과 (8.94ms, 79MB)
테스트 16 〉	통과 (8.61ms, 74.3MB)
테스트 17 〉	통과 (8.94ms, 75MB)
테스트 18 〉	통과 (11.98ms, 76.2MB)
테스트 19 〉	통과 (12.91ms, 86.1MB)
테스트 20 〉	통과 (9.05ms, 79.1MB)
테스트 21 〉	통과 (8.79ms, 73.8MB)
테스트 22 〉	통과 (8.64ms, 74.7MB)
테스트 23 〉	통과 (9.24ms, 78MB)
테스트 24 〉	통과 (10.60ms, 75MB)
테스트 25 〉	통과 (9.38ms, 79MB)
테스트 26 〉	통과 (8.71ms, 76.1MB)
테스트 27 〉	통과 (9.24ms, 70.1MB)
테스트 28 〉	통과 (9.86ms, 79.8MB)
테스트 29 〉	통과 (9.46ms, 79.2MB)
테스트 30 〉	통과 (9.21ms, 78.4MB)
테스트 31 〉	통과 (9.82ms, 71.7MB)
테스트 32 〉	통과 (13.05ms, 80.4MB)
