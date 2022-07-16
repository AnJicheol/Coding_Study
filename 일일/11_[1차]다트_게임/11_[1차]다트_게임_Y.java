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
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (9.36ms, 74.9MB)
테스트 2 〉	통과 (8.88ms, 76.4MB)
테스트 3 〉	통과 (10.81ms, 89MB)
테스트 4 〉	통과 (9.33ms, 77.5MB)
테스트 5 〉	통과 (9.27ms, 79.9MB)
테스트 6 〉	통과 (8.98ms, 80.2MB)
테스트 7 〉	통과 (8.79ms, 78.5MB)
테스트 8 〉	통과 (8.98ms, 74.5MB)
테스트 9 〉	통과 (9.14ms, 75.9MB)
테스트 10 〉	통과 (9.67ms, 73.1MB)
테스트 11 〉	통과 (8.93ms, 86.1MB)
테스트 12 〉	통과 (9.03ms, 74.4MB)
테스트 13 〉	통과 (9.14ms, 76.9MB)
테스트 14 〉	통과 (9.03ms, 78.3MB)
테스트 15 〉	통과 (9.38ms, 77.1MB)
테스트 16 〉	통과 (8.84ms, 77MB)
테스트 17 〉	통과 (9.13ms, 75.5MB)
테스트 18 〉	통과 (9.12ms, 75.2MB)
테스트 19 〉	통과 (8.82ms, 74.2MB)
테스트 20 〉	통과 (9.06ms, 88.9MB)
테스트 21 〉	통과 (9.69ms, 76.4MB)
테스트 22 〉	통과 (13.97ms, 83.3MB)
테스트 23 〉	통과 (9.09ms, 75.3MB)
테스트 24 〉	통과 (8.76ms, 77.9MB)
테스트 25 〉	통과 (9.77ms, 78.5MB)
테스트 26 〉	통과 (10.81ms, 75.6MB)
테스트 27 〉	통과 (8.83ms, 71.5MB)
테스트 28 〉	통과 (10.11ms, 79.5MB)
테스트 29 〉	통과 (8.61ms, 78.5MB)
테스트 30 〉	통과 (11.48ms, 78.8MB)
테스트 31 〉	통과 (9.12ms, 78MB)
테스트 32 〉	통과 (8.67ms, 77.1MB)
