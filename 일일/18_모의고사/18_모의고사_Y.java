import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        int count2 = 0;
        int max = 0;
        int[] num = {};
        
        for(int i = 0; i < 3; i++){
            
             // 찍는 방식 전달
            if(i == 0){num = first.clone();}
            else if(i == 1){num = second.clone();}
            else{num = third.clone();}
            
            for(int j = 0; j < answers.length; j++){
                //System.out.println(j % num.length + " " + num[j % num.length]);
                if(answers[j] == num[j % num.length]) { count[i]++; }
            }
            if(max < count[i]){max = count[i];}
        }
        //System.out.println(Arrays.toString(count));
        //System.out.println(max);
        
        for(int i = 0; i < count.length; i++){
            if(max == count[i]){count2++;}
        }

        int[] answer = new int[count2];
        int index = 0;
        
        for(int i = 0; i < count.length; i++){
            if(count[i] == max){answer[index] = i+1; index++;}
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.02ms, 67.2MB)
테스트 2 〉	통과 (0.04ms, 73MB)
테스트 3 〉	통과 (0.02ms, 71.2MB)
테스트 4 〉	통과 (0.03ms, 76.2MB)
테스트 5 〉	통과 (0.02ms, 73.2MB)
테스트 6 〉	통과 (0.03ms, 79.5MB)
테스트 7 〉	통과 (0.64ms, 83.5MB)
테스트 8 〉	통과 (0.31ms, 83MB)
테스트 9 〉	통과 (1.33ms, 78.6MB)
테스트 10 〉	통과 (0.38ms, 76MB)
테스트 11 〉	통과 (1.06ms, 83.6MB)
테스트 12 〉	통과 (1.12ms, 72.4MB)
테스트 13 〉	통과 (0.09ms, 81.4MB)
테스트 14 〉	통과 (0.87ms, 69.9MB)
