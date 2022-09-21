class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int total = 0;
        int count = 0;

        while(s.length() != 1){
            total = s.length();
            s = s.replaceAll("0", "");
            answer[1] += total - s.length();
            s = Integer.toBinaryString(s.length());

            
            count++;
        }     
        answer[0] = count;

        return answer;
    }
}
