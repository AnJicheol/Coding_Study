import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for(int i = 1; i < triangle.length; i++){ 
            triangle[i][0] += triangle[i-1][0]; // 맨 왼쪽
            triangle[i][triangle[i].length-1] += triangle[i-1][triangle[i-1].length-1]; // 맨 오른쪽
        }
        //System.out.println(Arrays.deepToString(triangle));
        for(int i = 2; i < triangle.length; i++){ // 큰 값 계속더해주기
            for(int j = 1; j <= triangle[i].length-2;j++){
                if(triangle[i-1][j-1] > triangle[i-1][j]){
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else{
                    triangle[i][j] += triangle[i-1][j];
                }
            }
        }
        //System.out.println(Arrays.deepToString(triangle));
        
        for(int i = 0; i < triangle.length; i++){ // 최대값 찾기
            if(answer < triangle[triangle.length-1][i]){
                answer = triangle[triangle.length-1][i];
            }
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.03ms, 79.2MB)
테스트 2 〉	통과 (0.02ms, 72.9MB)
테스트 3 〉	통과 (0.03ms, 72.1MB)
테스트 4 〉	통과 (0.06ms, 81.4MB)
테스트 5 〉	통과 (0.27ms, 77.9MB)
테스트 6 〉	통과 (0.07ms, 69.7MB)
테스트 7 〉	통과 (0.19ms, 75.2MB)
테스트 8 〉	통과 (0.15ms, 81.8MB)
테스트 9 〉	통과 (0.02ms, 76.2MB)
테스트 10 〉	통과 (0.04ms, 74MB)
효율성  테스트
테스트 1 〉	통과 (6.07ms, 57MB)
테스트 2 〉	통과 (5.87ms, 58.8MB)
테스트 3 〉	통과 (6.95ms, 60.6MB)
테스트 4 〉	통과 (6.55ms, 59.7MB)
테스트 5 〉	통과 (6.48ms, 58.8MB)
테스트 6 〉	통과 (8.05ms, 61.3MB)
테스트 7 〉	통과 (8.42ms, 57.7MB)
테스트 8 〉	통과 (6.49ms, 59MB)
테스트 9 〉	통과 (7.43ms, 59.5MB)
테스트 10 〉	통과 (10.75ms, 60.9MB)
