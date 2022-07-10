import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] report_split;
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> index = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            index.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }

        for (String names : report) {
            report_split = names.split(" ");
            map.get(report_split[1]).add(report_split[0]);
        }

        for (String id : map.keySet()) {
            if (map.get(id).size() >= k) {
                for (String set_list : map.get(id)) {
                    answer[index.get(set_list)]++;
                }
            }
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.16ms, 77.1MB)
테스트 2 〉	통과 (0.16ms, 82.6MB)
테스트 3 〉	통과 (124.23ms, 178MB)
테스트 4 〉	통과 (0.23ms, 77.5MB)
테스트 5 〉	통과 (0.31ms, 70.8MB)
테스트 6 〉	통과 (3.21ms, 84MB)
테스트 7 〉	통과 (4.96ms, 88.2MB)
테스트 8 〉	통과 (8.70ms, 93.8MB)
테스트 9 〉	통과 (71.99ms, 150MB)
테스트 10 〉	통과 (55.16ms, 137MB)
테스트 11 〉	통과 (110.60ms, 170MB)
테스트 12 〉	통과 (1.06ms, 78.9MB)
테스트 13 〉	통과 (0.81ms, 78.8MB)
테스트 14 〉	통과 (67.24ms, 137MB)
테스트 15 〉	통과 (100.33ms, 155MB)
테스트 16 〉	통과 (0.75ms, 74.8MB)
테스트 17 〉	통과 (0.83ms, 76.4MB)
테스트 18 〉	통과 (1.49ms, 67.8MB)
테스트 19 〉	통과 (2.94ms, 76MB)
테스트 20 〉	통과 (74.43ms, 136MB)
테스트 21 〉	통과 (117.53ms, 171MB)
테스트 22 〉	통과 (0.11ms, 74.8MB)
테스트 23 〉	통과 (0.13ms, 75.1MB)
테스트 24 〉	통과 (0.11ms, 74.6MB)
