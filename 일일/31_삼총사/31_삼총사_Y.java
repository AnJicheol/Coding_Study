class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
    for(int i = 0; i < number.length-2; i++) {
        for(int j = i+1; j < number.length-1; j++) {
            for(int k = j+1; k < number.length; k++) {
                if(number[i] + number[j] + number[k] == 0) {answer++;}
            }
        }
    }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.02ms, 71.7MB)
테스트 2 〉	통과 (0.03ms, 73.7MB)
테스트 3 〉	통과 (0.02ms, 64.9MB)
테스트 4 〉	통과 (0.02ms, 76.5MB)
테스트 5 〉	통과 (0.03ms, 74MB)
테스트 6 〉	통과 (0.03ms, 79.3MB)
테스트 7 〉	통과 (0.04ms, 74.7MB)
테스트 8 〉	통과 (0.03ms, 78.7MB)
테스트 9 〉	통과 (0.02ms, 78.8MB)
테스트 10 〉	통과 (0.03ms, 76.7MB)
테스트 11 〉	통과 (0.04ms, 89.6MB)
테스트 12 〉	통과 (0.02ms, 69MB)
테스트 13 〉	통과 (0.03ms, 72MB)
