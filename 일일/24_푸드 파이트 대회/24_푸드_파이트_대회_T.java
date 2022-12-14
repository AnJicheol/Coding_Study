class Solution {
    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();
        String answer = "";
        int num = 0;

        for(Integer index : food){
            for(int i = 0; i < index / 2; i++) sb.append(num);
            num++;
        }
        answer = sb.toString();
        sb.append(0);
        sb.reverse();
        answer += sb.toString();

        return answer;
    }
}
