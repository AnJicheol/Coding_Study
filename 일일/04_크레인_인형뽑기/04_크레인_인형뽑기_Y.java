class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] box = new int[moves.length]; // moves의 길이만큼 배열 크기를 정함
        int index = 0; //box의 index
        
        
        for(int row = 0; row < moves.length;row++){
            for(int column = 0; column < board.length; column++){
                
                if(board[column][moves[row]-1] != 0){ //1,5,3,5,1,2,1,4; 1부터 시작하기 때문에 -1을해줌
                    
                    box[index] = board[column][moves[row]-1];
                    board[column][moves[row]-1] = 0;
                    
                    if(index != 0 && box[index-1] == box[index]){ // 2값이 연속으로 동일한 숫자일 경우
                        box[index-1] = 0;
                        box[index] = 0;
                        index = index -2;
                        answer = answer+2;
                    }
                    
                    index++;
                    break;
                }
            }
        }
        /* 테스트코드
        System.out.print(" box의 값 확인 : " + " ");
        for(int i=0; i < box.length; i++){
            System.out.print(box[i]);
        }
        */
        
        return answer;
    }
}


@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
안지철-------------------------------------------------------------
    
깔끔하게 잘 한 것 같다 스터디 시간에 말했듯 스택으로 풀 수있지만
해당 알고리즘에 장점이 있다면 성능이다 자바 특성상 리스트 보다는 배열이
빠르기 때문에 성능이 중요한 프로그램이라면 해당 알고리즘이 더 좋아보인다
스택만큼 충분히 직관적이고 성능도 빠르기 때문이다 다만 스택으로 풀수도
있다는 것만 인지했으면 한다.

-------------------------------------------------------------------
