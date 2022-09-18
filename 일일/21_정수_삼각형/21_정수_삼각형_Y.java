import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int[] box = new int[triangle.length];
        
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
        
        for(int i = 0; i < box.length; i++){ // 최대값 찾기
            if(answer < triangle[triangle.length-1][i]){
                answer = triangle[triangle.length-1][i];
            }
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.02ms, 76.4MB)
테스트 2 〉	통과 (0.03ms, 75.6MB)
테스트 3 〉	통과 (0.04ms, 80.1MB)
테스트 4 〉	통과 (0.06ms, 72.7MB)
테스트 5 〉	통과 (0.29ms, 81.2MB)
테스트 6 〉	통과 (0.10ms, 75.7MB)
테스트 7 〉	통과 (0.30ms, 72MB)
테스트 8 〉	통과 (0.07ms, 73.2MB)
테스트 9 〉	통과 (0.03ms, 77.8MB)
테스트 10 〉	통과 (0.07ms, 84.9MB)
효율성  테스트
테스트 1 〉	통과 (8.07ms, 56.9MB)
테스트 2 〉	통과 (10.40ms, 59.7MB)
테스트 3 〉	통과 (6.69ms, 61.2MB)
테스트 4 〉	통과 (6.04ms, 66.8MB)
테스트 5 〉	통과 (6.47ms, 73MB)
테스트 6 〉	통과 (10.77ms, 61.6MB)
테스트 7 〉	통과 (6.64ms, 57.3MB)
테스트 8 〉	통과 (6.60ms, 59.8MB)
테스트 9 〉	통과 (11.14ms, 57.3MB)
테스트 10 〉	통과 (8.05ms, 57.6MB)
