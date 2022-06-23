class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int rank = 0;  // 맞는 로또 번호의 갯 수를 담는 변수
        int zero = 0;  // 0(알아볼 수 없는 번호)를 담는 변수
        int top_rank = 0; // 로또 번호를 최고 많이 맞은 변수
        int lowest_rank = 0; // 로또 번호를 최고 적게 맞은 변수
       
        for (int i = 0; i < lottos.length; i ++) { 
            if (lottos[i] == 0) { // for문을 이용해 lottos[i] 가 0이랑 같을 경우 zero(알아볼 수 없는 번호) 증가
                    zero ++;    
                }
            for (int j = 0; j < lottos.length; j ++) { 
                if (win_nums[i] == lottos[j]) {  // 2중 for문을 이용해 win_nums[i] 와 lottos[j]를 비교해서 rank를 증가
                    rank ++;
                }
            }
        }

        top_rank = rank + zero; // top_rank에 rank 와 zero를 더함
        lowest_rank = rank;    //  lowest_rank 에 rank를 담음
        
        switch (top_rank) { // top_rank 수에 따라 등수 결정
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
                break;
        }
        switch (lowest_rank) { // lowest_rank 수에 따라 등수 결정
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
                break;
        }
        return answer;
    }
}
