class Solution {
    public String solution(int n) {

        long num = 0;
        long unit = 1;

        while(n > 0){

            if(n % 3 == 0) num += 4 * unit;
            else num += (n % 3) * unit;

            n = (n - 1) / 3;
            unit = unit * 10;
        }

        String answer =  Long.toString(num);

        return answer;
    }
}



@@@@@@@@@@@@@@ 시간 @@@@@@@@@@@@@@@@@
  
  테스트 1 〉	통과 (0.04ms, 75MB)
테스트 2 〉	통과 (0.04ms, 72.3MB)
테스트 3 〉	통과 (0.05ms, 76.8MB)
테스트 4 〉	통과 (0.06ms, 72.7MB)
테스트 5 〉	통과 (0.06ms, 75.6MB)
테스트 6 〉	통과 (0.05ms, 69MB)
테스트 7 〉	통과 (0.05ms, 79.3MB)
테스트 8 〉	통과 (0.05ms, 78.6MB)
테스트 9 〉	통과 (0.04ms, 71.4MB)
테스트 10 〉	통과 (0.05ms, 72.4MB)
테스트 11 〉	통과 (0.05ms, 66.6MB)
테스트 12 〉	통과 (0.05ms, 70.5MB)
테스트 13 〉	통과 (0.05ms, 77.9MB)
테스트 14 〉	통과 (0.05ms, 75.8MB)
  
효율성  테스트

테스트 1 〉	통과 (0.06ms, 51.8MB)
테스트 2 〉	통과 (0.06ms, 52MB)
테스트 3 〉	통과 (0.05ms, 52MB)
테스트 4 〉	통과 (0.07ms, 52.1MB)
테스트 5 〉	통과 (0.06ms, 51.9MB)
테스트 6 〉	통과 (0.06ms, 52.3MB)
