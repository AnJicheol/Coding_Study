import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];  
        Map<String, Integer> index = new HashMap<>();
        Map<String, HashSet<String>> map = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
              String id = id_list[i];
              map.put(id, new HashSet<>());
              index.put(id, i);
        }
        
        for(String ID : report){                 
              String[]  CH = ID.split(" ");
              map.get(CH[1]).add(CH[0]);       
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> len = map.get(id_list[i]);
            if (len.size() >= k) {
                for (String id : len) {
                    answer[index.get(id)]++;
                }
            }
        }
        return answer;
    }
}


최저 속도 114.39ms
