class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int same =0;
        int zero = 0;
        int RANK_MAX = 0;
        int RANK_MIN = 0;
        int[] rank = {1,2,3,4,5,6,6};
        
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
        
        /*
        System.out.println(" RANK_MAX의 값 : "+RANK_MAX);
        System.out.println(" RANK_MIN의 값 : "+RANK_MIN);
        */
        
        int index = rank.length-1;
        
        // 최고 당첨 등수 
        for(int j = 0; j <= win_nums.length; j++){ 
            
            if(j == RANK_MAX){
                //System.out.println("index의 값  : " +index);
                answer[0] = rank[index];
            }
            else{
                index --;
            }
        }
        
        index = rank.length-1;
        
         // 최소 당첨 등수
        for(int j = 0; j <= win_nums.length; j++){ 
            
            if(j == RANK_MIN){
                //System.out.println("index의 값  : " +index);
                answer[1] = rank[index];
            }
            else{
                index --;
            }
        }
        
        return answer;
    }
}
