import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] box = new int[arr.length];
        int index = 0;
        int num = arr[index];
        
        for(int i = 0; i < arr.length;i++){
            if(num != arr[i]){box[index] = num; index++; num = arr[i];}
            if(i == arr.length-1){box[index] = arr[i]; index++;}
            //System.out.println(index);
            //System.out.println(Arrays.toString(box));
        }
        
        
        int[] answer = new int[index];
        for(int i = 0; i < index; i++){answer[i] = box[i];}
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.03ms, 73.1MB)
테스트 2 〉	통과 (0.02ms, 76.5MB)
테스트 3 〉	통과 (0.04ms, 73.9MB)
테스트 4 〉	통과 (0.03ms, 72.7MB)
테스트 5 〉	통과 (0.02ms, 75.3MB)
테스트 6 〉	통과 (0.03ms, 81.1MB)
테스트 7 〉	통과 (0.02ms, 80.5MB)
테스트 8 〉	통과 (0.02ms, 74.8MB)
테스트 9 〉	통과 (0.02ms, 80MB)
테스트 10 〉	통과 (0.03ms, 77.3MB)
테스트 11 〉	통과 (0.03ms, 73.1MB)
테스트 12 〉	통과 (0.03ms, 79MB)
테스트 13 〉	통과 (0.02ms, 82.7MB)
테스트 14 〉	통과 (0.01ms, 72.7MB)
테스트 15 〉	통과 (0.02ms, 79MB)
테스트 16 〉	통과 (0.02ms, 78.1MB)
테스트 17 〉	통과 (0.03ms, 76.8MB)
효율성  테스트
테스트 1 〉	통과 (16.20ms, 114MB)
테스트 2 〉	통과 (16.20ms, 111MB)
테스트 3 〉	통과 (15.40ms, 114MB)
테스트 4 〉	통과 (16.32ms, 111MB)
