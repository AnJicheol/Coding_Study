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

테스트 1 〉	통과 (0.15ms, 75.8MB)
테스트 2 〉	통과 (0.16ms, 76.2MB)
테스트 3 〉	통과 (175.89ms, 161MB)
테스트 4 〉	통과 (0.25ms, 77.1MB)
테스트 5 〉	통과 (0.24ms, 75.6MB)
테스트 6 〉	통과 (2.98ms, 80.8MB)
테스트 7 〉	통과 (6.07ms, 83MB)
테스트 8 〉	통과 (9.63ms, 97.1MB)
테스트 9 〉	통과 (96.52ms, 128MB)
테스트 10 〉	통과 (70.02ms, 144MB)
테스트 11 〉	통과 (161.31ms, 185MB)
테스트 12 〉	통과 (3.13ms, 78.4MB)
테스트 13 〉	통과 (0.89ms, 78.7MB)
테스트 14 〉	통과 (118.83ms, 134MB)
테스트 15 〉	통과 (119.48ms, 162MB)
테스트 16 〉	통과 (1.14ms, 74MB)
테스트 17 〉	통과 (0.85ms, 77.1MB)
테스트 18 〉	통과 (3.83ms, 79.5MB)
테스트 19 〉	통과 (3.55ms, 75.9MB)
테스트 20 〉	통과 (93.04ms, 148MB)
테스트 21 〉	통과 (145.53ms, 157MB)
테스트 22 〉	통과 (0.10ms, 76.6MB)
테스트 23 〉	통과 (0.15ms, 77MB)
테스트 24 〉	통과 (0.12ms, 76.1MB)
