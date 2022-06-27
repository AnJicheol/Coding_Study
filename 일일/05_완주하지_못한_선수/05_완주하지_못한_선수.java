import java.util.HashMap;

class Solution {
    
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String name : participant) map.put(name, map.getOrDefault(name, 0) + 1);
        for (String name : completion) map.put(name, map.get(name) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}



테스트 1 〉	통과 (0.08ms, 68.6MB)
테스트 2 〉	통과 (0.09ms, 74MB)
테스트 3 〉	통과 (0.72ms, 80.2MB)
테스트 4 〉	통과 (1.38ms, 79.7MB)
테스트 5 〉	통과 (0.88ms, 77.9MB)
  
효율성  테스트

테스트 1 〉	통과 (49.73ms, 83.6MB)
테스트 2 〉	통과 (74.52ms, 88.2MB)
테스트 3 〉	통과 (87.11ms, 95.2MB)
테스트 4 〉	통과 (87.15ms, 95.2MB)
테스트 5 〉	통과 (87.48ms, 95.3MB)

  
