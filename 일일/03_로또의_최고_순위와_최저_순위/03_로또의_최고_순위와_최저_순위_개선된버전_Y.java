@@@@@@@@@@@@@@@@@@@@@@개선한 코드@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int same =0;
        int zero = 0;
        int RANK_MAX = 0;
        int RANK_MIN = 0;
        int[] rank = {6,6,5,4,3,2,1};
        
        for(int i = 0; i<lottos.length;i++){
            if(lottos[i] != 0){
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        same++; // 로또의 숫자와 동일하면 same++
                    }
                }
            }
            else{ // 로또의 숫자가 0이면 zero ++
                zero++;
            }
        }
        /* 테스트코드(same, zero 값 확인)
        System.out.println(same);
        System.out.print(zero);
        */
        
        RANK_MAX = same + zero;
        RANK_MIN = same;
        
        answer[0] = rank[RANK_MAX];
        answer[1] = rank[RANK_MIN];
        /*
        System.out.println(" RANK_MAX의 값 : "+RANK_MAX);
        System.out.println(" RANK_MIN의 값 : "+RANK_MIN);
        */
        
        return answer;
    }
}
