class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int num2 = 0;
        int sum = 0;
        
        if(n <= 1){ 
            return n;
        }
        
        for(int i = 2; i <= n+1; i++){
            num2 = sum;
            sum = num2 % 1234567 + num % 1234567;
            num = num2;
            //System.out.println(sum);
        }
        
        answer = (int) sum % 1234567;
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.01ms, 73.1MB)
테스트 2 〉	통과 (0.02ms, 78.2MB)
테스트 3 〉	통과 (0.02ms, 73.1MB)
테스트 4 〉	통과 (0.01ms, 76.4MB)
테스트 5 〉	통과 (0.03ms, 79MB)
테스트 6 〉	통과 (0.02ms, 78MB)
테스트 7 〉	통과 (0.06ms, 70.1MB)
테스트 8 〉	통과 (0.04ms, 73.7MB)
테스트 9 〉	통과 (0.03ms, 77.2MB)
테스트 10 〉	통과 (0.06ms, 76.6MB)
테스트 11 〉	통과 (0.04ms, 76.5MB)
테스트 12 〉	통과 (0.03ms, 77.7MB)
테스트 13 〉	통과 (2.19ms, 84.2MB)
테스트 14 〉	통과 (2.12ms, 72.7MB)
