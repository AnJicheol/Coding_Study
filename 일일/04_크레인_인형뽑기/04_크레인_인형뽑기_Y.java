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
