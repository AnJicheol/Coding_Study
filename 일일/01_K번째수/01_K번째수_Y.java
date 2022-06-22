import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length]; // commands.length -> 길이를 알고 있기 때문에 3이라고 하는 편이 속도가 더 빠름
        int[] box = new int[array.length];
        
        //3중 for문 : n^3만큼 실행 런타임이 급격하게 증가(시간복잡도)
        
        for(int a = 0; a < commands.length; a++){ //2중 for문에 있는 변수는 첫번째 for문에 사용가능(메모리 주소 static의 형식)
            int i = commands[a][0]; // for문 계층 때문에 i(매개변수) 사용 불가
            int j = commands[a][1];
            int k = commands[a][2];
            //System.out.print("\nbox의 값은 : ");
            for(int count = 0;i<=j;count++){ // box에 숫자 담기
                box[count] = array[i-1];
                i++;
                //System.out.print(box[count] + " ");
            }
                //System.out.print("\n박스에 들어있는 값 : ");
            /*for(int h = 0; h <=6;h++){ // 테스트 코드
                System.out.print(box[h]);
            }
            */
            int swap = 0;
            //System.out.print("\n정렬된 box의 값은 : " + " ");
            for(int b = 0; b < box.length; b++){ // 정렬(버블) 시작
                for(int c = 0; c < box.length-1; c++){
                    if(box[c] > box[c+1] && box[c+1] != 0){
                        swap = box[c];
                        box[c] = box[c+1];
                        box[c+1] = swap;
                    }
                }
            }
            /*for(int z = 0; z <=6;z++){ // 정렬된 값 확인
                System.out.print(box[z]);
            }
            */
            answer[a] = box[k-1];
            Arrays.fill(box, 0); // 배열의 값을 0으로 초기화
        }
        
        return answer;
    }
}



