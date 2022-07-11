import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        for(int count = 0; count < commands.length; count ++){
            int i = commands[count][0];
            int j = commands[count][1];
            int k = commands[count][2];
            int[] box = new int[j-i+1];
            
            for(int start = i; start <= j; start++){
                box[index] = array[start-1];
                index++;
            }
            index = 0;
            Arrays.sort(box);
            
            answer[count] = box[k-1];
        }
        return answer;
    }
}
