import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++){ // 체육복을 도난당한 사람이 여분이 있는지 확인
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1; reserve[j] = -1; 
                    answer++;
                    break;
                }
            }
        }
        
        //System.out.println(Arrays.toString(reserve));
        
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == -1){continue;}
            for(int j = 0; j < reserve.length;j++){
                if(reserve[j]-1 == lost[i] || reserve[j]+1 == lost[i]){
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(reserve));
        
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.43ms, 67.2MB)
테스트 2 〉	통과 (0.51ms, 72.7MB)
테스트 3 〉	통과 (0.33ms, 78MB)
테스트 4 〉	통과 (0.41ms, 83MB)
테스트 5 〉	통과 (0.50ms, 76MB)
테스트 6 〉	통과 (0.50ms, 73.9MB)
테스트 7 〉	통과 (0.36ms, 78.4MB)
테스트 8 〉	통과 (0.36ms, 76.3MB)
테스트 9 〉	통과 (0.46ms, 75.2MB)
테스트 10 〉	통과 (0.40ms, 80.9MB)
테스트 11 〉	통과 (0.37ms, 78MB)
테스트 12 〉	통과 (0.47ms, 75.2MB)
테스트 13 〉	통과 (0.50ms, 69.9MB)
테스트 14 〉	통과 (0.34ms, 77.2MB)
테스트 15 〉	통과 (0.50ms, 76.3MB)
테스트 16 〉	통과 (0.48ms, 77.5MB)
테스트 17 〉	통과 (0.41ms, 80.2MB)
테스트 18 〉	통과 (0.47ms, 77.4MB)
테스트 19 〉	통과 (0.34ms, 74.8MB)
테스트 20 〉	통과 (0.36ms, 76.7MB)
테스트 21 〉	통과 (0.43ms, 71.1MB)
테스트 22 〉	통과 (0.35ms, 78.1MB)
테스트 23 〉	통과 (0.45ms, 73.1MB)
테스트 24 〉	통과 (0.36ms, 78MB)
테스트 25 〉	통과 (0.39ms, 74.3MB)
