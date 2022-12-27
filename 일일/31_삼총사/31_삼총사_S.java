class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int num = 0;
        
        for (int i = 0; i < number.length-2; i++) {
            
            for (int j = i+1; j < number.length-1; j++) {
                
                num = number[i] + number[j];
                
                for (int k = j+1; k < number.length; k++) {
                    
                    if (num + number[k] == 0) answer++;
                    
                }
            }
        }
        
        return answer;
    }
}



테스트 1 〉	통과 (0.04ms, 78.3MB)
테스트 2 〉	통과 (0.03ms, 77.7MB)
테스트 3 〉	통과 (0.03ms, 65.9MB)
테스트 4 〉	통과 (0.04ms, 77.4MB)
테스트 5 〉	통과 (0.03ms, 80.8MB)
테스트 6 〉	통과 (0.02ms, 71.1MB)
테스트 7 〉	통과 (0.03ms, 95.9MB)
테스트 8 〉	통과 (0.04ms, 66.8MB)
테스트 9 〉	통과 (0.03ms, 69.2MB)
테스트 10 〉	통과 (0.03ms, 78.2MB)
테스트 11 〉	통과 (0.04ms, 73.6MB)
테스트 12 〉	통과 (0.03ms, 84.4MB)
테스트 13 〉	통과 (0.02ms, 74.8MB)
