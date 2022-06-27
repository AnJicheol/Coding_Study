import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // completion은 participant보다 1만큼 작으므로 배열 크기를 맞추기위해 새로운 배열생성 후 +1을 해줌
        String[] newCompletion = new String[completion.length + 1];
        
        
        for (int i = 0; i < completion.length; i++) {
            newCompletion[i] = completion[i];        
        }
        
        // 남는 배열에 임의의 값 할당
         newCompletion[completion.length] = "a";
        
        /*
        for(int i =0; i < newCompletion.length; i ++){
            System.out.print(newCompletion[i]);
        }
        */
        
        for(int i =0; i < participant.length;i++){ // 검사
            if(newCompletion[i].equals(participant[i]) != true){
                answer = participant[i];
                break;
            }
        
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
정확성  테스트
테스트 1 〉	통과 (0.24ms, 74.9MB)
테스트 2 〉	통과 (0.25ms, 74MB)
테스트 3 〉	통과 (2.73ms, 80.6MB)
테스트 4 〉	통과 (4.01ms, 80.2MB)
테스트 5 〉	통과 (4.25ms, 92.6MB)
효율성  테스트
테스트 1 〉	통과 (142.37ms, 83.3MB)
테스트 2 〉	통과 (256.68ms, 88.6MB)
테스트 3 〉	통과 (289.78ms, 93.8MB)
테스트 4 〉	통과 (397.27ms, 94.9MB)
테스트 5 〉	통과 (302.08ms, 94.6MB)
