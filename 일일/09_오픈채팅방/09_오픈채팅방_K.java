import java.util.HashMap;
class Solution {
    public String[] solution(String[] record) {
       
        String[] id = new String[record.length]; // 아이디를 담을 변수 
        String[] name = new String[record.length]; // 맵에 값(닉네임)을 담을 변수
        String[] division = {}; // 공백을 나눠서 저장할 변수
        int up = 0;  // 각 배열 인덱스 증가 시키는 변수
        int count = 0; // Change 갯수 파악하는 변수
        String com_in = "님이 들어왔습니다.";
        String go_outside = "님이 나갔습니다.";
        
        
        HashMap < String, String > map = new HashMap<>();
        
        for (int i = 0; i < record.length; i ++) {
            division = record[i].split("\\s"); // 공백을 쪼개서 division에 저장
            if((record[i].charAt(0) != 'C')){ // Change는 아니면
                id[up] = division[1]; // 배열 b에 아이디만 저장
                up++;
            }   
            else count++; // Change는 갯수 파악
            if (division.length == 3) map.put(division[1], division[2]); // 키는 아이디 값은 닉네임 저장
        }
        
         
        for (int i = 0; i < name.length; i ++) {
                 name[i] = (String)map.get(id[i]); // name[i] 에 값 닉네임 저장,  map.get(id[i]) 키(id)를 넣어줘서 값(name)을 출력해줌
        }

        String[] answer = new String[record.length - count]; // count 만큼 빼줘서 answer 배열 만들기
        
        count = 0; // answer를 증가시켜야 되기 때문에 0 초기화
        for (int i = 0; i < record.length; i ++) {
            if (record[i].charAt(0) == 'E') { // E 일경우 
                answer[count] = name[count] + com_in;  // value[i] 값 + 님이 들어왔습니다.
                count++;
            } else if (record[i].charAt(0) == 'L') { // L 일경우
                answer[count] = name[count] + go_outside;// value[i] 값 + 님이 나갔습니다.
                count++;
            }
        }   
        return answer;
    }
}
테스트 1 〉	통과 (1.93ms, 75.2MB)
테스트 2 〉	통과 (2.13ms, 77.3MB)
테스트 3 〉	통과 (2.74ms, 72.8MB)
테스트 4 〉	통과 (2.74ms, 76.7MB)
테스트 5 〉	통과 (11.09ms, 87.7MB)
테스트 6 〉	통과 (15.53ms, 85.3MB)
테스트 7 〉	통과 (14.70ms, 92.5MB)
테스트 8 〉	통과 (11.21ms, 82.4MB)
테스트 9 〉	통과 (14.15ms, 86.5MB)
테스트 10 〉	통과 (11.84ms, 87MB)
테스트 11 〉	통과 (9.05ms, 82.2MB)
테스트 12 〉	통과 (8.64ms, 83.4MB)
테스트 13 〉	통과 (11.99ms, 83.3MB)
테스트 14 〉	통과 (15.64ms, 77.7MB)
테스트 15 〉	통과 (1.80ms, 83.5MB)
테스트 16 〉	통과 (1.80ms, 75.7MB)
테스트 17 〉	통과 (3.59ms, 79MB)
테스트 18 〉	통과 (3.86ms, 73.9MB)
테스트 19 〉	통과 (13.98ms, 88.1MB)
테스트 20 〉	통과 (11.44ms, 88.1MB)
테스트 21 〉	통과 (12.02ms, 80.3MB)
테스트 22 〉	통과 (12.53ms, 82MB)
테스트 23 〉	통과 (11.30ms, 82.9MB)
테스트 24 〉	통과 (12.01ms, 82.7MB)
테스트 25 〉	통과 (134.90ms, 169MB)
테스트 26 〉	통과 (135.29ms, 173MB)
테스트 27 〉	통과 (135.10ms, 189MB)
테스트 28 〉	통과 (132.07ms, 182MB)
테스트 29 〉	통과 (141.82ms, 170MB)
테스트 30 〉	통과 (117.85ms, 164MB)
테스트 31 〉	통과 (120.47ms, 196MB)
테스트 32 〉	통과 (110.54ms, 182MB)
