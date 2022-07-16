class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        int R_distance;
        int L_distance;
        
        for (int i = 0; i < numbers.length; i++) {
            
            switch (numbers[i]) {
                case 1:
                case 4:
                case 7:{
                    answer += "L";
                    left = numbers[i];
                    break;
                }
                case 3:
                case 6:
                case 9:{
                    answer += "R";
                    right = numbers[i];
                    break;
                }
                default: {
                    if (numbers[i] == 0) numbers[i] = 11;
                    
                    R_distance = 
                        Math.abs((right - 1) / 3 - (numbers[i] - 1) / 3)
                        + Math.abs((right - 1) % 3 - (numbers[i] - 1) % 3);
                    L_distance = 
                        Math.abs((left - 1) / 3 - (numbers[i] - 1) / 3)
                        + Math.abs((left - 1) % 3 - (numbers[i] - 1) % 3);
                    
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
        }
        return answer;
    }
    
}


테스트 1 〉	통과 (1.71ms, 76MB)
테스트 2 〉	통과 (1.76ms, 77.9MB)
테스트 3 〉	통과 (1.82ms, 76MB)
테스트 4 〉	통과 (1.85ms, 76.1MB)
테스트 5 〉	통과 (1.92ms, 72.2MB)
테스트 6 〉	통과 (1.73ms, 75.3MB)
테스트 7 〉	통과 (2.11ms, 75.7MB)
테스트 8 〉	통과 (1.90ms, 73.5MB)
테스트 9 〉	통과 (1.94ms, 73.4MB)
테스트 10 〉	통과 (1.82ms, 74.6MB)
테스트 11 〉	통과 (2.03ms, 76.7MB)
테스트 12 〉	통과 (1.89ms, 73.7MB)
테스트 13 〉	통과 (2.13ms, 77.1MB)
테스트 14 〉	통과 (2.82ms, 72MB)
테스트 15 〉	통과 (2.85ms, 75.3MB)
테스트 16 〉	통과 (2.78ms, 77.7MB)
테스트 17 〉	통과 (2.90ms, 77.3MB)
테스트 18 〉	통과 (3.55ms, 80.5MB)
테스트 19 〉	통과 (2.99ms, 77.9MB)
테스트 20 〉	통과 (3.13ms, 74.9MB)
