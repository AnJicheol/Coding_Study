class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 9;
        int right = 11;
        int R_distance;
        int L_distance;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
            if (numbers[i] % 3 == 0) {
                answer += "L";
                left = numbers[i];
            } else if (numbers[i] % 3 == 2) {
                answer += "R";
                right = numbers[i];
            } else {
                if (numbers[i] == -1) numbers[i] = 10;
                    
                R_distance = 
                        Math.abs(right / 3 - numbers[i] / 3)
                        + Math.abs(right % 3 - numbers[i] % 3);
                L_distance = 
                        Math.abs(left / 3 - numbers[i] / 3)
                        + Math.abs(left % 3 - numbers[i] % 3);
                
                if (R_distance > L_distance) answer += "L";   
                else if (R_distance < L_distance) answer += "R";
                else {
                     if (hand.equals("right")) answer += "R";
                     else answer += "L";
                }
              
                if (answer.charAt(answer.length()-1)=='R') right = numbers[i];
                else left = numbers[i];
                    
            }
        }
        return answer;
    }
}

테스트 1 〉	통과 (1.76ms, 72.6MB)
테스트 2 〉	통과 (2.20ms, 73.5MB)
테스트 3 〉	통과 (2.03ms, 73.6MB)
테스트 4 〉	통과 (1.96ms, 73.6MB)
테스트 5 〉	통과 (1.81ms, 75MB)
테스트 6 〉	통과 (1.79ms, 75MB)
테스트 7 〉	통과 (2.20ms, 76.2MB)
테스트 8 〉	통과 (2.94ms, 72.3MB)
테스트 9 〉	통과 (1.92ms, 78.5MB)
테스트 10 〉	통과 (1.91ms, 76.6MB)
테스트 11 〉	통과 (1.93ms, 76.5MB)
테스트 12 〉	통과 (2.98ms, 84.3MB)
테스트 13 〉	통과 (2.12ms, 75.6MB)
테스트 14 〉	통과 (2.13ms, 77.9MB)
테스트 15 〉	통과 (2.61ms, 73.2MB)
테스트 16 〉	통과 (2.68ms, 74.4MB)
테스트 17 〉	통과 (3.07ms, 79.5MB)
테스트 18 〉	통과 (4.06ms, 76.9MB)
테스트 19 〉	통과 (2.96ms, 75.5MB)
테스트 20 〉	통과 (4.60ms, 78.3MB)
