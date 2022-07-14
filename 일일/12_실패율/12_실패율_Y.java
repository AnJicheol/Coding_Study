import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float user = 0;
        float f_user = 0;
        
        // key : 스테이지, value : 실패율
        Map<Integer,Float> stage_f = new HashMap<Integer,Float>();
        
        for(int level = 1; level <= N ; level++){ // 1스테이지부터 시작
            for(int j = 0; j < stages.length; j++){
                if(stages[j] > level){ //스테이지를 클리어한 경우
                    user ++;
                }
                else if(stages[j] == level){ // 스테이지를 도전중인 경우
                    user ++;
                    f_user++;
                }
            }
            if(f_user == 0 && user == 0){ //스테이지에 도달한 유저가 없는 경우
                stage_f.put(level,(float)0);
                continue;
            }
            stage_f.put(level,f_user/user); //해시 맵 구현
            f_user = 0;
            user = 0;
        }
        //System.out.println(stage_f);
        
        //Entry : key값과 value값을 모두 얻을 수 있다.
        //Entry의 list를 생성한다.
        List<Entry<Integer,Float>> list_stage_f = new ArrayList<Entry<Integer,Float>>(stage_f.entrySet());
        
        // Comparator : 두 매개 변수의 객체를 비교하는 인터페이스
        // "두 매개변수 객체를 비교"
        Collections.sort(list_stage_f, new Comparator<Entry<Integer,Float>>(){
            //필수구현 부분
            public int compare(Entry<Integer,Float> obj1, Entry<Integer,Float> obj2){
                return obj2.getValue().compareTo(obj1.getValue()); // 내림차순 정렬
            }
        });
        
        int index = 0;
        for(Entry<Integer,Float> entry : list_stage_f){
            answer[index] = entry.getKey(); //정렬된 스테이지를 반환
            index++;
        }
        return answer;
    }
}


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.58ms, 83.4MB)
테스트 2 〉	통과 (0.74ms, 78.6MB)
테스트 3 〉	통과 (25.14ms, 85MB)
테스트 4 〉	통과 (106.71ms, 84.3MB)
테스트 5 〉	통과 (440.73ms, 84MB)
테스트 6 〉	통과 (2.94ms, 77.4MB)
테스트 7 〉	통과 (18.14ms, 87.3MB)
테스트 8 〉	통과 (113.26ms, 94.4MB)
테스트 9 〉	통과 (387.66ms, 94.2MB)
테스트 10 〉	통과 (57.26ms, 95MB)
테스트 11 〉	통과 (133.09ms, 82.7MB)
테스트 12 〉	통과 (93.45ms, 84.4MB)
테스트 13 〉	통과 (137.56ms, 101MB)
테스트 14 〉	통과 (0.55ms, 85MB)
테스트 15 〉	통과 (10.36ms, 81MB)
테스트 16 〉	통과 (9.72ms, 78.9MB)
테스트 17 〉	통과 (18.61ms, 89.4MB)
테스트 18 〉	통과 (9.92ms, 81.4MB)
테스트 19 〉	통과 (2.76ms, 75.8MB)
테스트 20 〉	통과 (17.68ms, 84.9MB)
테스트 21 〉	통과 (11.94ms, 83.8MB)
테스트 22 〉	통과 (283.72ms, 90.3MB)
테스트 23 〉	통과 (13.78ms, 91.7MB)
테스트 24 〉	통과 (24.00ms, 84.2MB)
테스트 25 〉	통과 (0.44ms, 72.4MB)
테스트 26 〉	통과 (0.46ms, 78.1MB)
테스트 27 〉	통과 (0.45ms, 77.4MB)
