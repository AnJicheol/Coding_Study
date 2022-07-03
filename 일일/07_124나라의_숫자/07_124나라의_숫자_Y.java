class Solution {
    public String solution(int n) {
        String answer = "";
        int share = 0;
        String[] world_124 = {"4","1","2"};
        
        while(n>0){
            
            if(n%3 != 0){
                answer = world_124[n%3] + answer;
                n = n/3;
            }
            else{
                answer = world_124[n%3] + answer;
                n = (n/3)-1;
            }
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
정확성  테스트
테스트 1 〉	통과 (1.22ms, 73MB)
테스트 2 〉	통과 (1.46ms, 83.7MB)
테스트 3 〉	통과 (1.11ms, 75.8MB)
테스트 4 〉	통과 (1.22ms, 77.3MB)
테스트 5 〉	통과 (1.10ms, 81.4MB)
테스트 6 〉	통과 (1.12ms, 75.4MB)
테스트 7 〉	통과 (1.12ms, 74.2MB)
테스트 8 〉	통과 (1.59ms, 75.2MB)
테스트 9 〉	통과 (1.46ms, 77.8MB)
테스트 10 〉	통과 (1.27ms, 73.7MB)
테스트 11 〉	통과 (1.40ms, 73.4MB)
테스트 12 〉	통과 (1.36ms, 84.1MB)
테스트 13 〉	통과 (1.44ms, 77.3MB)
테스트 14 〉	통과 (1.30ms, 76.9MB)
효율성  테스트
테스트 1 〉	통과 (1.41ms, 51.5MB)
테스트 2 〉	통과 (1.61ms, 51.6MB)
테스트 3 〉	통과 (1.80ms, 51.4MB)
테스트 4 〉	통과 (1.51ms, 51.8MB)
테스트 5 〉	통과 (1.64ms, 52MB)
테스트 6 〉	통과 (1.44ms, 51.8MB)
