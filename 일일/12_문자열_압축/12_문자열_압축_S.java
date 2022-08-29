class Solution {
    public int solution(String s) {
        int answer = s.length();
        int tmp_len;
        int count;
        String before;    

        for (int i = 1; i < s.length()/2+1; i++) {
            tmp_len = s.length();
            count = 1;
            before = s.substring(0, i);
            
            for (int j = i; j <= s.length()-i; j+=i) {
                String now = s.substring(j, j+i);
                
                if (before.equals(now)) {
                    tmp_len -= i;
                    count++;
                } else {
                    
                    before = now;
                    
                    if (count != 1) {
                        tmp_len += String.valueOf(count).length();
                        count = 1;
                    }
                }
                
            }
            
            if (count != 1) tmp_len += String.valueOf(count).length();

            if (tmp_len < answer) answer = tmp_len;
        }


        return answer;
    }
    
    
}


테스트 1 〉	통과 (0.03ms, 78.6MB)
테스트 2 〉	통과 (0.22ms, 74.9MB)
테스트 3 〉	통과 (0.12ms, 75.7MB)
테스트 4 〉	통과 (0.04ms, 74.4MB)
테스트 5 〉	통과 (0.02ms, 86.9MB)
테스트 6 〉	통과 (0.06ms, 76.3MB)
테스트 7 〉	통과 (0.22ms, 75MB)
테스트 8 〉	통과 (0.22ms, 74.5MB)
테스트 9 〉	통과 (0.33ms, 74.7MB)
테스트 10 〉	통과 (1.01ms, 76.2MB)
테스트 11 〉	통과 (0.07ms, 71.4MB)
테스트 12 〉	통과 (0.06ms, 72.7MB)
테스트 13 〉	통과 (0.08ms, 75.5MB)
테스트 14 〉	통과 (0.31ms, 73.5MB)
테스트 15 〉	통과 (0.07ms, 73.9MB)
테스트 16 〉	통과 (0.02ms, 73.9MB)
테스트 17 〉	통과 (0.46ms, 72.8MB)
테스트 18 〉	통과 (0.62ms, 81.4MB)
테스트 19 〉	통과 (0.66ms, 73.6MB)
테스트 20 〉	통과 (1.06ms, 84MB)
테스트 21 〉	통과 (1.51ms, 83MB)
테스트 22 〉	통과 (1.08ms, 74MB)
테스트 23 〉	통과 (1.02ms, 75.7MB)
테스트 24 〉	통과 (0.93ms, 75.5MB)
테스트 25 〉	통과 (1.05ms, 67.7MB)
테스트 26 〉	통과 (1.05ms, 78.7MB)
테스트 27 〉	통과 (1.09ms, 74MB)
테스트 28 〉	통과 (0.03ms, 73.6MB)
