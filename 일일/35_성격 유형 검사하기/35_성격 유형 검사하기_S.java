import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        int score;
        char key;

        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {

            if (choices[i] < 4) {
                key = survey[i].charAt(0);
                score = map.get(key) + 4 - choices[i];
                map.put(key, score);
            }
            if (choices[i] > 4) {
                key = survey[i].charAt(1);
                score = map.get(key) - 4 + choices[i];
                map.put(key, score);
            }

        }

        key = map.get('R') >= map.get('T') ? 'R' : 'T';
        answer.append(key);
        key = map.get('C') >= map.get('F') ? 'C' : 'F';
        answer.append(key);
        key = map.get('J') >= map.get('M') ? 'J' : 'M';
        answer.append(key);
        key = map.get('A') >= map.get('N') ? 'A' : 'N';
        answer.append(key);

        return answer.toString();
    }
}

테스트 1 〉	통과 (0.27ms, 75MB)
테스트 2 〉	통과 (0.18ms, 77.3MB)
테스트 3 〉	통과 (0.17ms, 73.8MB)
테스트 4 〉	통과 (0.14ms, 73.8MB)
테스트 5 〉	통과 (0.13ms, 73.4MB)
테스트 6 〉	통과 (0.17ms, 80.4MB)
테스트 7 〉	통과 (0.18ms, 74.6MB)
테스트 8 〉	통과 (0.18ms, 73.6MB)
테스트 9 〉	통과 (0.16ms, 69.5MB)
테스트 10 〉	통과 (0.26ms, 71.4MB)
테스트 11 〉	통과 (0.22ms, 86.1MB)
테스트 12 〉	통과 (0.50ms, 72.7MB)
테스트 13 〉	통과 (0.40ms, 82.2MB)
테스트 14 〉	통과 (0.60ms, 79.8MB)
테스트 15 〉	통과 (0.55ms, 82.7MB)
