class Solution {
    public int solution(String s) {
        int answer = s.length();
        int tmp_len;
        int count;
        String before;

        for (int i = 1; i < s.length()/2+1; i++) {
            tmp_len = s.length();
            for (int j = 0; j < s.length()-i; j+=i) {
                before = s.substring(j, j + i);
                count = 1;
                while (j + 2 * i <= s.length() && before.equals(s.substring(j + i, j + 2 * i))) { //같을때
                    count++;
                    tmp_len -= i;
                    j += i;
                }
                if (count != 1) tmp_len += String.valueOf(count).length();
            }

            if (tmp_len < answer) answer = tmp_len;
        }


        return answer;
    }
}


테스트 1 〉	통과 (0.04ms, 73.8MB)
테스트 2 〉	통과 (0.45ms, 82.4MB)
테스트 3 〉	통과 (0.14ms, 76MB)
테스트 4 〉	통과 (0.06ms, 77MB)
테스트 5 〉	통과 (0.02ms, 71MB)
테스트 6 〉	통과 (0.04ms, 72.6MB)
테스트 7 〉	통과 (0.42ms, 77.3MB)
테스트 8 〉	통과 (0.29ms, 73.4MB)
테스트 9 〉	통과 (0.41ms, 73.7MB)
테스트 10 〉	통과 (1.63ms, 75.7MB)
테스트 11 〉	통과 (0.08ms, 76.7MB)
테스트 12 〉	통과 (0.10ms, 81.3MB)
테스트 13 〉	통과 (0.09ms, 76.1MB)
테스트 14 〉	통과 (0.40ms, 74.3MB)
테스트 15 〉	통과 (0.08ms, 86MB)
테스트 16 〉	통과 (0.02ms, 76MB)
테스트 17 〉	통과 (0.59ms, 74.8MB)
테스트 18 〉	통과 (0.70ms, 74.6MB)
테스트 19 〉	통과 (0.69ms, 75.5MB)
테스트 20 〉	통과 (1.73ms, 75.1MB)
테스트 21 〉	통과 (1.69ms, 77.8MB)
테스트 22 〉	통과 (1.72ms, 78MB)
테스트 23 〉	통과 (1.55ms, 72.7MB)
테스트 24 〉	통과 (1.53ms, 76.3MB)
테스트 25 〉	통과 (1.39ms, 68MB)
테스트 26 〉	통과 (1.70ms, 73.5MB)
테스트 27 〉	통과 (1.67ms, 74.7MB)
테스트 28 〉	통과 (0.03ms, 77.6MB)
