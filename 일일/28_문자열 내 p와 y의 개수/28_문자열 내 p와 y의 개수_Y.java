class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) =='P'){count++;}
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){count--;}
        }
        
        if(count==0){answer = true;}
        else{answer = false;}
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.03ms, 71.1MB)
테스트 2 〉	통과 (0.03ms, 83.2MB)
테스트 3 〉	통과 (0.02ms, 79MB)
테스트 4 〉	통과 (0.03ms, 77.2MB)
테스트 5 〉	통과 (0.02ms, 79.9MB)
테스트 6 〉	통과 (0.03ms, 71.2MB)
테스트 7 〉	통과 (0.03ms, 71.9MB)
테스트 8 〉	통과 (0.02ms, 77.6MB)
테스트 9 〉	통과 (0.04ms, 71.3MB)
테스트 10 〉	통과 (0.03ms, 75.8MB)
테스트 11 〉	통과 (0.03ms, 74.4MB)
테스트 12 〉	통과 (0.04ms, 75.1MB)
테스트 13 〉	통과 (0.03ms, 76.9MB)
테스트 14 〉	통과 (0.04ms, 72.4MB)
테스트 15 〉	통과 (0.02ms, 73MB)
테스트 16 〉	통과 (0.03ms, 80.3MB)
테스트 17 〉	통과 (0.03ms, 77MB)
테스트 18 〉	통과 (0.04ms, 72.6MB)
테스트 19 〉	통과 (0.02ms, 73.8MB)
테스트 20 〉	통과 (0.04ms, 73.7MB)
테스트 21 〉	통과 (0.04ms, 85MB)
테스트 22 〉	통과 (0.02ms, 70.9MB)
테스트 23 〉	통과 (0.02ms, 78.3MB)
테스트 24 〉	통과 (0.04ms, 79.1MB)
테스트 25 〉	통과 (0.03ms, 74.3MB)
테스트 26 〉	통과 (0.03ms, 77.1MB)
테스트 27 〉	통과 (0.03ms, 75.1MB)
테스트 28 〉	통과 (0.03ms, 73.9MB)
테스트 29 〉	통과 (0.04ms, 85.6MB)
테스트 30 〉	통과 (0.04ms, 78.5MB)
