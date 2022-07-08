import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        
        int size = 0;
        int index = 0;
        
        HashMap<String,String> id_nickname = new HashMap<String,String>();
        
        for(int i = 0; i < record.length; i ++){
            if(record[i].charAt(0) == 'E' || record[i].charAt(0) == 'C'){
                String[] cut = record[i].split(" ");
                id_nickname.put(cut[1],cut[2]); // 해쉬에 대입
            }
            if(record[i].charAt(0) == 'E' || record[i].charAt(0) == 'L'){
                size++;
            }
        }
        
        //System.out.print(id_nickname);
        String[] answer = new String[size];
        
        for(int i = 0; i < record.length; i++){
            String[] cut2 = record[i].split(" ");
            if(record[i].charAt(0) == 'E'){
                answer[index] = id_nickname.get(cut2[1]) + "님이 들어왔습니다.";
                index++;
            }
            else if(record[i].charAt(0) == 'L'){
                answer[index] = id_nickname.get(cut2[1]) + "님이 나갔습니다.";
                index++;
            }
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (2.06ms, 77.2MB)
테스트 2 〉	통과 (2.13ms, 71.3MB)
테스트 3 〉	통과 (2.33ms, 73.5MB)
테스트 4 〉	통과 (2.32ms, 76.8MB)
테스트 5 〉	통과 (5.44ms, 81.7MB)
테스트 6 〉	통과 (5.21ms, 89.3MB)
테스트 7 〉	통과 (6.09ms, 84MB)
테스트 8 〉	통과 (5.99ms, 74.4MB)
테스트 9 〉	통과 (5.33ms, 82.9MB)
테스트 10 〉	통과 (7.35ms, 72.2MB)
테스트 11 〉	통과 (4.42ms, 77.5MB)
테스트 12 〉	통과 (4.56ms, 74MB)
테스트 13 〉	통과 (4.87ms, 76MB)
테스트 14 〉	통과 (5.29ms, 76MB)
테스트 15 〉	통과 (1.90ms, 76.8MB)
테스트 16 〉	통과 (2.21ms, 80.9MB)
테스트 17 〉	통과 (2.81ms, 70.2MB)
테스트 18 〉	통과 (3.09ms, 76.4MB)
테스트 19 〉	통과 (5.05ms, 78.2MB)
테스트 20 〉	통과 (6.04ms, 85MB)
테스트 21 〉	통과 (5.21ms, 91.7MB)
테스트 22 〉	통과 (6.12ms, 85.7MB)
테스트 23 〉	통과 (4.96ms, 79.3MB)
테스트 24 〉	통과 (5.10ms, 80.3MB)
테스트 25 〉	통과 (84.42ms, 171MB)
테스트 26 〉	통과 (90.39ms, 177MB)
테스트 27 〉	통과 (111.15ms, 191MB)
테스트 28 〉	통과 (110.37ms, 177MB)
테스트 29 〉	통과 (103.15ms, 184MB)
테스트 30 〉	통과 (88.96ms, 188MB)
테스트 31 〉	통과 (91.16ms, 183MB)
테스트 32 〉	통과 (86.80ms, 162MB)
