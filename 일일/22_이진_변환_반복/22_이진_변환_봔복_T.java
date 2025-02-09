class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int BitCount = 0;

        while(s.length() != 1 ){

            BitCount = 0;
            for(int i = 0; i < s.length(); i ++){
                if(s.charAt(i) == '1') BitCount++;
            }

            answer[1] += s.length() - BitCount;
            answer[0]++;
            s = Integer.toBinaryString(BitCount);
        }
        return answer;
    }
}
