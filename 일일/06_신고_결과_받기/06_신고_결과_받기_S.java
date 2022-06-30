import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] report_split;
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashSet<String> set;
        
        for (String report_list : report) {
            report_split = report_list.split(" ");
            set = map.getOrDefault(report_split[1], new HashSet<String>());
            set.add(report_split[0]);
            map.put(report_split[1], set);
        }

        for (String id : map.keySet()) {
            if (map.get(id).size() >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (map.get(id).contains(id_list[i])) answer[i]++;
                }
            }
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.20ms, 75.7MB)
테스트 2 〉	통과 (0.16ms, 78.9MB)
테스트 3 〉	통과 (185.57ms, 162MB)
테스트 4 〉	통과 (0.47ms, 74.7MB)
테스트 5 〉	통과 (0.24ms, 77.5MB)
테스트 6 〉	통과 (3.11ms, 83.2MB)
테스트 7 〉	통과 (7.77ms, 87.4MB)
테스트 8 〉	통과 (10.61ms, 101MB)
테스트 9 〉	통과 (90.55ms, 137MB)
테스트 10 〉	통과 (76.67ms, 148MB)
테스트 11 〉	통과 (138.86ms, 178MB)
테스트 12 〉	통과 (3.26ms, 78.5MB)
테스트 13 〉	통과 (0.99ms, 84.4MB)
테스트 14 〉	통과 (106.99ms, 142MB)
테스트 15 〉	통과 (139.73ms, 163MB)
테스트 16 〉	통과 (0.97ms, 73.8MB)
테스트 17 〉	통과 (0.95ms, 74.4MB)
테스트 18 〉	통과 (4.18ms, 72MB)
테스트 19 〉	통과 (3.12ms, 75.3MB)
테스트 20 〉	통과 (106.35ms, 136MB)
테스트 21 〉	통과 (158.57ms, 167MB)
테스트 22 〉	통과 (0.14ms, 75.4MB)
테스트 23 〉	통과 (0.17ms, 69.4MB)
테스트 24 〉	통과 (0.17ms, 68.6MB)
