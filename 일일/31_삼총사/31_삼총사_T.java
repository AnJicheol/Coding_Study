class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 0; i < number.length - 2; i++) {    
            for (int j = i + 1; j < number.length-1; j++) {
                sum = number[i] + number[j];   
                for (int t = j + 1; t <  number.length; t++) {
                    if (sum + number[t] == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}
