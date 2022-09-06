import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String p) {
        String answer = "";
        String u = "";
        String v = "";
        int count = 0;
        
        Deque<String> deque = new ArrayDeque<>();
        
        // 덱에 괄호 분리하여 저장   
        for(int i = 0; i<p.length(); i++){
            if(p.charAt(i) == '(') count ++;
            else if (p.charAt(i) == ')') count --;
            
            u += p.charAt(i);    
            
            if(count == 0){  
                deque.addFirst(u);  
                count = 0;
                u="";
            }      
        }    
        
        while(0 < deque.size()){
            boolean tf = true;
            count = 0;
            u = deque.poll(); 
            // u가 올바른 괄호인지 확인
            for(int j = 0; j<u.length(); j++){
                if(u.charAt(j) == '(') count ++;
                else if (u.charAt(j) == ')') count --;
                if(count<0){
                    tf = false;
                    break;
                }
            }
            // 올바른 괄혼
            if(tf == true){
                v = u+v;   
            }
           // 올바르지 않은 괄호  
            else{
                u = u.substring(1, u.length() - 1);
                v = '('+v+')';
                
                for(int k = 0; k<u.length(); k++){
                    if(u.charAt(k) == '(') v += ')';
                    else v += '(';
                } 
            }
        }  
        return v;
    }
}


정확성  테스트
테스트 1 〉	통과 (12.58ms, 75MB)
테스트 2 〉	통과 (17.44ms, 76.4MB)
테스트 3 〉	통과 (14.85ms, 85.3MB)
테스트 4 〉	통과 (16.38ms, 78.3MB)
테스트 5 〉	통과 (12.19ms, 79.7MB)
테스트 6 〉	통과 (17.39ms, 70.4MB)
테스트 7 〉	통과 (31.10ms, 95.8MB)
테스트 8 〉	통과 (13.46ms, 82MB)
테스트 9 〉	통과 (28.70ms, 81.1MB)
테스트 10 〉	통과 (15.07ms, 84.9MB)
테스트 11 〉	통과 (27.50ms, 82.4MB)
테스트 12 〉	통과 (23.96ms, 75.7MB)
테스트 13 〉	통과 (23.05ms, 74.9MB)
테스트 14 〉	통과 (19.13ms, 83.7MB)
테스트 15 〉	통과 (17.16ms, 75.8MB)
테스트 16 〉	통과 (15.36ms, 78.3MB)
테스트 17 〉	통과 (20.58ms, 80.1MB)
테스트 18 〉	통과 (16.99ms, 77.3MB)
테스트 19 〉	통과 (13.84ms, 87MB)
테스트 20 〉	통과 (13.68ms, 77.1MB)
테스트 21 〉	통과 (22.16ms, 89.7MB)
테스트 22 〉	통과 (14.31ms, 75MB)
테스트 23 〉	통과 (19.17ms, 85.7MB)
테스트 24 〉	통과 (20.81ms, 78.3MB)
테스트 25 〉	통과 (17.12ms, 93.7MB)





