import java.util.*;
class Solution
{
    public int solution(String s){
        int index = 0;
        char[] save = new char[s.length()+1];
        
        
        for (int i = 0; i < s.length(); i++) {
            if (save[index] != s.charAt(i)) {
                save[++index] = s.charAt(i);
            }
            else index--;

            //System.out.println(Arrays.toString(save));
        }
        
        if (index == 0) return 1;
        else return 0;
        
    }
}

정확성  테스트
테스트 1 〉	통과 (0.02ms, 78.1MB)
테스트 2 〉	통과 (6.10ms, 78.4MB)
테스트 3 〉	통과 (6.08ms, 76.5MB)
테스트 4 〉	통과 (6.01ms, 75.6MB)
테스트 5 〉	통과 (6.43ms, 72.8MB)
테스트 6 〉	통과 (6.11ms, 78MB)
테스트 7 〉	통과 (6.47ms, 80.2MB)
테스트 8 〉	통과 (8.49ms, 78.3MB)
테스트 9 〉	통과 (0.01ms, 77.1MB)
테스트 10 〉	통과 (0.02ms, 74.7MB)
테스트 11 〉	통과 (0.02ms, 75.5MB)
테스트 12 〉	통과 (0.04ms, 76.6MB)
테스트 13 〉	통과 (0.03ms, 75.7MB)
효율성  테스트
테스트 1 〉	통과 (21.50ms, 57.8MB)
테스트 2 〉	통과 (12.04ms, 58MB)
테스트 3 〉	통과 (16.02ms, 57.8MB)
테스트 4 〉	통과 (15.83ms, 57.7MB)
테스트 5 〉	통과 (54.31ms, 80.2MB)
테스트 6 〉	통과 (15.88ms, 57.7MB)
테스트 7 〉	통과 (15.61ms, 57.9MB)
테스트 8 〉	통과 (14.28ms, 57.8MB)
