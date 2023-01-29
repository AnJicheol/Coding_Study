import java.util.Arrays;

class Solution {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] off = new int[emoticons.length];
        int[] answer = {0, 0};
        int[] tmp    = {0, 0};
        int Total = 0;
        int Pass  = 0;

        Arrays.fill(off, 40);

        while(off[off.length - 1] != 0) {

            Pass   = 0;
            Total  = 0;
            tmp[0] = 0;
            tmp[1] = 0;

            for(int i = 0; i < off.length; i++){ 
                Total += emoticons[i] - (emoticons[i] / 100) * off[i];
                
                if(users[i][0] > off[i]){
                    Pass += emoticons[i] - (emoticons[i] / 100) * off[i];
                }
            }    

            for(int i = 0; i < users.length; i++){
  
                if(Total - Pass >= users[i][1])tmp[0]++;
                else tmp[1] += Total - Pass;
            }

            if(tmp[0] > answer[0]){
                answer[0] = tmp[0];
                answer[1] = tmp[1];
            }
            if(tmp[0] == answer[0] && tmp[1] > answer[1]){
                answer[1] = tmp[1];
            }

            off[0] -= 10;

            for(int i = 0; i < off.length - 1; i++){
                if(off[i] == 0){
                    off[i + 1] -= 10;
                    off[i] = 40;
                }
            }
        }

        return answer;
    }
}
