import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap();
        
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.getOrDefault(completion[i], 0) -1);
        }
        
        for (String name : map.keySet()) {
            if (map.get(name) != 0) return name;
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@ 수정 @@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap();
        
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) -1);
        }
        
        for (String name : map.keySet()) {
            if (map.get(name) != 0) return name;
        }
        
        return answer;
    }
}


13번째 줄에선 map 이 이미 모든 값을 가지므로
getOrDefalult대신 get을 써도 문제가 없단 것을 확인하고 변했다.
