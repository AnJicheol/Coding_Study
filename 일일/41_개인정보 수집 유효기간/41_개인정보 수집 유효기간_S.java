import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        
        for (int i = 0; i < terms.length; i++) {
            String[] split = terms[i].split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }
        
        String[] split = today.split("\\.");
        int[] t = new int[3];
        
        t[0] = Integer.parseInt(split[0]);
        t[1] = Integer.parseInt(split[1]);
        t[2] = Integer.parseInt(split[2]);
        
        
        for (int i = 0; i < privacies.length; i++) {
            String[] pri_s = privacies[i].split(" ");
            String[] day_s = pri_s[0].split("\\.");
            
            int year = Integer.parseInt(day_s[0]);
            int month = Integer.parseInt(day_s[1]) + map.get(pri_s[1]);
            int day = Integer.parseInt(day_s[2]) - 1;
            
            year += month / 12;
            month = month % 12;
            
            if (month == 0) {
                year--;
                month = 12;
            }
            if (day == 0) {
                day = 28;
                month--;
            }
            
            
            //System.out.println(year + " " + month + " " + day);
            
            if (year < t[0]) {
                list.add(i+1);
            } else if (year > t[0]) {
                continue;
            }
            else if (month < t[1]) {
                list.add(i+1);
            } else if (month == t[1] && day < t[2]) {
                list.add(i+1);
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

테스트 1 〉	통과 (0.11ms, 76.5MB)
테스트 2 〉	통과 (0.20ms, 66.4MB)
테스트 3 〉	통과 (0.20ms, 73.9MB)
테스트 4 〉	통과 (0.15ms, 73.6MB)
테스트 5 〉	통과 (0.22ms, 66.5MB)
테스트 6 〉	통과 (0.22ms, 72.4MB)
테스트 7 〉	통과 (0.35ms, 78.1MB)
테스트 8 〉	통과 (0.24ms, 73.9MB)
테스트 9 〉	통과 (0.73ms, 74.9MB)
테스트 10 〉	통과 (0.66ms, 76.5MB)
테스트 11 〉	통과 (0.81ms, 81MB)
테스트 12 〉	통과 (1.09ms, 77.8MB)
테스트 13 〉	통과 (1.61ms, 84.2MB)
테스트 14 〉	통과 (0.79ms, 77.4MB)
테스트 15 〉	통과 (0.58ms, 73.4MB)
테스트 16 〉	통과 (1.26ms, 73MB)
테스트 17 〉	통과 (1.09ms, 74.2MB)
테스트 18 〉	통과 (1.04ms, 75.3MB)
테스트 19 〉	통과 (0.90ms, 73.9MB)
테스트 20 〉	통과 (1.16ms, 75MB)
