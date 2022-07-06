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
