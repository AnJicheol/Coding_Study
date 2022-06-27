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
