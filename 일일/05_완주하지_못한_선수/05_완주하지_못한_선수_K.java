import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant); // 선수(partcipant)를 순서대로 정렬
        Arrays.sort(completion);  // 완주자 명단 (completion)을 순서대로 정렬
        
        for (int finish = 0; finish < completion.length; finish ++) { // 완주자 명단의 길이만큼 반복
            
            
            if (participant[finish].equals(completion[finish]) == false) { // 선수 와 완주자 명단을 비교해서 false이면
                answer = participant[finish];                             //  완주자 명단에 해당 선수가 없기 때문에 answer = participant[finish]; 
                break;
            }
            
            if (finish == completion.length - 1) {  // 선수 와 완주자 명단이 모두 같으면
                answer = participant[finish + 1];   // 정렬된 마지막 선수가 정답
            }
        }
        return answer;
    }
}


테스트 1 〉	통과 (0.19ms, 81.6MB)
테스트 2 〉	통과 (0.22ms, 71.9MB)
테스트 3 〉	통과 (1.43ms, 77.6MB)
테스트 4 〉	통과 (3.67ms, 78.2MB)
테스트 5 〉	통과 (2.43ms, 77.2MB)
효율성  테스트
테스트 1 〉	통과 (126.99ms, 81.5MB)
테스트 2 〉	통과 (226.76ms, 88.1MB)
테스트 3 〉	통과 (261.12ms, 94.5MB)
테스트 4 〉	통과 (306.09ms, 95.2MB)
테스트 5 〉	통과 (279.06ms, 94.9MB)
