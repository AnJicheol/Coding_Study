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



@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

안지철
[38번 줄 부터 시작 되는 알고리즘은 불필요해보임 이미 27번째 줄에
최대 최소를 구했기 때문에 int[] rank = {1,2,3,4,5,6,6}; 를 
int[] rank = {6,6,5,4,3,2,1};로 수정하면 rank[RANK_MAX] 로 
값을 얻을 수 있고 코드 사이즈를 줄이고 성능도 개선될 것이다]
