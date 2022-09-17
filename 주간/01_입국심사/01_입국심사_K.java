class Solution {
    public long solution(int n, int[] times) {
        long personnel = 0; // 이용가능한 인원
        long answer = 0; // 정답
        long first = 0; // 가장 작은 경우의 수 
        long last = (long)times[times.length-1]*n; // 가장 큰 경우의 수
        long target = 0; // 중간 값(시간)
        
        while(first<=last){  
            target = (first + last)/2; 
            personnel = 0;
           
            for(int i = 0; i<times.length; i++){  
                personnel += target/times[i]; 
            }    
         
            if(personnel < n)  first = target +1;    
            if(personnel >= n){
                answer = target;
                last = target - 1;
            } 
        }           
        return answer;
    }
}




테스트 1 〉	통과 (0.10ms, 72.9MB)
테스트 2 〉	통과 (0.10ms, 77.1MB)
테스트 3 〉	통과 (1.07ms, 67.5MB)
테스트 4 〉	통과 (57.18ms, 93.8MB)
테스트 5 〉	통과 (40.64ms, 79.4MB)
테스트 6 〉	통과 (58.67ms, 95.2MB)
테스트 7 〉	통과 (71.82ms, 85.2MB)
테스트 8 〉	통과 (55.63ms, 88.3MB)
테스트 9 〉	통과 (0.07ms, 79.5MB)




