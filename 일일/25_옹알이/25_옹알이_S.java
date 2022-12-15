class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
                  
            if (babbling[i].contains("ayaaya")) continue;
            else if (babbling[i].contains("yeye")) continue;
            else if (babbling[i].contains("woowoo")) continue;
            else if (babbling[i].contains("mama")) continue;
            
            
            for (int j = 0; j < 4; j++) {
                babbling[i] = babbling[i].replace(words[j], ".");
            }
            
            babbling[i] = babbling[i].replace(".", "");
            
            if (babbling[i].equals("")) answer++;
            
            
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (0.12ms, 78.6MB)
테스트 2 〉	통과 (0.20ms, 78.2MB)
테스트 3 〉	통과 (0.17ms, 72.5MB)
테스트 4 〉	통과 (0.08ms, 78.6MB)
테스트 5 〉	통과 (0.10ms, 78.5MB)
테스트 6 〉	통과 (0.07ms, 71.3MB)
테스트 7 〉	통과 (0.09ms, 65.7MB)
테스트 8 〉	통과 (0.08ms, 83.3MB)
테스트 9 〉	통과 (0.20ms, 80.5MB)
테스트 10 〉	통과 (0.29ms, 81.3MB)
테스트 11 〉	통과 (0.19ms, 77.4MB)
테스트 12 〉	통과 (0.48ms, 74.7MB)
테스트 13 〉	통과 (0.98ms, 74MB)
테스트 14 〉	통과 (1.13ms, 71.8MB)
테스트 15 〉	통과 (0.27ms, 77.1MB)
테스트 16 〉	통과 (1.06ms, 76.8MB)
테스트 17 〉	통과 (0.85ms, 74.1MB)
테스트 18 〉	통과 (0.26ms, 84.1MB)
테스트 19 〉	통과 (0.28ms, 78.7MB)
테스트 20 〉	통과 (0.78ms, 74.2MB)
