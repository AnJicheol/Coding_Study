class Solution {
    boolean solution(String s) {

        boolean answer = true;
        int count = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') count++;
            if (s.charAt(i) == 'y') count--;
        }
        answer = (count == 0) ? true : false;
        return answer;
    }
}
