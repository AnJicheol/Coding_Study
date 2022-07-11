import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        String[] record_split;
        String[] act;
        HashMap<String, String> nick_name = new HashMap<>();
        ArrayList<String[]> History = new ArrayList<>();

        for (String result : record) {
            record_split = result.split(" ");
            if (record_split.length == 3) 
                nick_name.put(record_split[1], record_split[2]);
            if (!record_split[0].equals("Change")) {
                act = new String[]{record_split[0], record_split[1]};
                History.add(act);
            }
        }
        answer = new String[History.size()];
        for (int i = 0; i < answer.length; i++) {
            if (History.get(i)[0].equals("Enter")) 
                answer[i] = nick_name.get(History.get(i)[1]) + "님이 들어왔습니다.";
            else answer[i] = nick_name.get(History.get(i)[1]) + "님이 나갔습니다.";
        }
        return answer;
    }
}

테스트 1 〉	통과 (1.95ms, 87MB)
테스트 2 〉	통과 (1.91ms, 81.7MB)
테스트 3 〉	통과 (2.40ms, 82.2MB)
테스트 4 〉	통과 (2.59ms, 75.8MB)
테스트 5 〉	통과 (5.09ms, 76.5MB)
테스트 6 〉	통과 (4.88ms, 82.9MB)
테스트 7 〉	통과 (4.69ms, 81MB)
테스트 8 〉	통과 (4.96ms, 78.9MB)
테스트 9 〉	통과 (5.16ms, 83.4MB)
테스트 10 〉	통과 (5.05ms, 79.4MB)
테스트 11 〉	통과 (4.25ms, 77.9MB)
테스트 12 〉	통과 (4.31ms, 73.7MB)
테스트 13 〉	통과 (7.47ms, 83.8MB)
테스트 14 〉	통과 (4.84ms, 98.5MB)
테스트 15 〉	통과 (2.00ms, 73.8MB)
테스트 16 〉	통과 (1.99ms, 65.9MB)
테스트 17 〉	통과 (2.50ms, 77.4MB)
테스트 18 〉	통과 (2.39ms, 73.9MB)
테스트 19 〉	통과 (5.02ms, 76.5MB)
테스트 20 〉	통과 (4.75ms, 80.6MB)
테스트 21 〉	통과 (4.51ms, 75.2MB)
테스트 22 〉	통과 (4.78ms, 78.9MB)
테스트 23 〉	통과 (5.42ms, 82.1MB)
테스트 24 〉	통과 (4.91ms, 76.5MB)
테스트 25 〉	통과 (79.64ms, 147MB)
테스트 26 〉	통과 (100.08ms, 170MB)
테스트 27 〉	통과 (97.75ms, 147MB)
테스트 28 〉	통과 (82.32ms, 158MB)
테스트 29 〉	통과 (90.82ms, 167MB)
테스트 30 〉	통과 (71.05ms, 167MB)
테스트 31 〉	통과 (80.23ms, 159MB)
테스트 32 〉	통과 (87.18ms, 171MB)
    
    
    
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
안지철----------------------------------------------------------------
9 ArrayList<String[]> History = new ArrayList<>();
해당 리스트는 필요없어보인다 이미 매개변수에 값이다 존재하기 때문이다

마지막 TMI로 equals 보다는 charAt이 좀더 빠를 것이다
------------------------------------------------------------------
    
    
    
    
    
    
    
