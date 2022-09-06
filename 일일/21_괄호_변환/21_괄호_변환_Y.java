import java.util.*;

class Solution {
    public String solution(String p) {
        int count = 0;
        int start = 0;
        
        LinkedList<String> box = new LinkedList<String>();
        
        
        for(int i = 0; i < p.length(); i++){ // 균형잡힌 괄호로 분리
            if(p.charAt(i) == '('){count++;}
            else{count--;}
            
            if(count == 0){
                box.add(p.substring(start,i+1));
                start = i + 1;
            }
        }
        box.add(""); // 배열의 맨 끝에 빈 문자열 추가
        //System.out.println(box);
        
        for(int i = box.size()-2;i>=0;i--){ //뒤에서 두번째 부터 실행
            String str = box.get(i);
            for(int j = 0; j < str.length();j++){ // 올바른 괄호인지 확인
                if(str.charAt(j) == '('){count++;}
                else{count--;}
                
                if(count < 0){break;}
            }
            if(count != 0){ // 올바른 괄호가 아니라면
                str = str.substring(1,str.length()-1); // 첫 번째와 마지막 문자를 제거
                String str2 = "";
                for(int j = 0; j < str.length(); j++){ // 나머지 문자열의 괄호 방향을 뒤집는다.
                    if(str.charAt(j)=='('){str2 += ')';}
                    else{str2 += '(';}
                }
                str2 = "(" + box.get(i+1) + ")" + str2;
                box.set(i,str2);
                
            }
            else{ // 올바른 괄호인 경우
                box.set(i,box.get(i) + box.get(i+1));
            }
            //System.out.println(box);
            count = 0;
        }
        
        
        return box.get(0);
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (1.13ms, 72.3MB)
테스트 2 〉	통과 (8.71ms, 78.6MB)
테스트 3 〉	통과 (1.23ms, 75.9MB)
테스트 4 〉	통과 (8.23ms, 79.7MB)
테스트 5 〉	통과 (1.31ms, 74.3MB)
테스트 6 〉	통과 (8.57ms, 79.7MB)
테스트 7 〉	통과 (10.22ms, 74.4MB)
테스트 8 〉	통과 (1.92ms, 77.9MB)
테스트 9 〉	통과 (8.83ms, 84.8MB)
테스트 10 〉	통과 (11.00ms, 70.5MB)
테스트 11 〉	통과 (12.26ms, 81.5MB)
테스트 12 〉	통과 (10.30ms, 77.2MB)
테스트 13 〉	통과 (10.33ms, 76.1MB)
테스트 14 〉	통과 (9.96ms, 74.4MB)
테스트 15 〉	통과 (9.63ms, 77.1MB)
테스트 16 〉	통과 (10.43ms, 75.3MB)
테스트 17 〉	통과 (10.62ms, 79MB)
테스트 18 〉	통과 (9.55ms, 85MB)
테스트 19 〉	통과 (11.00ms, 78.9MB)
테스트 20 〉	통과 (9.19ms, 78.6MB)
테스트 21 〉	통과 (14.16ms, 75.4MB)
테스트 22 〉	통과 (9.38ms, 80.4MB)
테스트 23 〉	통과 (11.87ms, 76.8MB)
테스트 24 〉	통과 (9.88ms, 85.1MB)
테스트 25 〉	통과 (10.31ms, 83.7MB)
