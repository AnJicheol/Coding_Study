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


@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@
    
안지철   
[13번째 줄 코드는 개선할 수 있을 것 같다 예로 


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

위 코드는 for문이 if문 내부에 있다 때문에 조건문 수행 횟수를 
줄일 이를 참고하여 수정하면 성능면에서 더욱 개선될 것이다 
또 23번 줄 부터 시작되는 스위치 문을 사용하여 매우 직관적으로
가독성이 좋았다 좋은 접근이다 하지만 반복문을 통해 23번 스위치와
43스위치는 완벽히 같은 코드이다 반복문 통해 합치면 좋을 것 같다]
