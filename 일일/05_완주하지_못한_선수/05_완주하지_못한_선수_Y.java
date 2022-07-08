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

    
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
안지철-----------------------------------------------------------------------
    
14, 9번째 줄 코드는 작업에 편리성을 위해 배열을 복사한 것인데 정말 좋은 접근이라고
생각한다 하지만 배열을 복사하는 과정에서 성능에 악영향을 끼칠 것 같다 해당 코드는

 for (int i = 0; i < completion.length; i++) {
        newCompletion[i] = completion[i];        
 }
        
        // 남는 배열에 임의의 값 할당
newCompletion[completion.length] = "a";

각배열의 마지막인덱스를 검사하는 것으로 대체할 수 있을 것 같다.
    
if(newCompletion[last_index].equals(participant[last_index]) != true)

----------------------------------------------------------------------------
