import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        int count2 = 0;
        int max = 0;
        
        for(int i = 0; i < 3; i++){
            
            int[] num = {};
            if(i == 0){num = first;} // 찍는 방식 전달
            else if(i == 1){num = second;}
            else{num = third;}
            
            for(int j = 0; j < answers.length; j++){
                //System.out.println(j % num.length + " " + num[j % num.length]);
                if(answers[j] == num[j % num.length]) { count[i]++; }
            }
            if(max < count[i]){max = count[i];} //최대값 찾기
        }
        
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

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.01ms, 73.6MB)
테스트 2 〉	통과 (0.01ms, 75.4MB)
테스트 3 〉	통과 (0.02ms, 77MB)
테스트 4 〉	통과 (0.02ms, 87.4MB)
테스트 5 〉	통과 (0.03ms, 78.2MB)
테스트 6 〉	통과 (0.02ms, 74.1MB)
테스트 7 〉	통과 (0.40ms, 72.4MB)
테스트 8 〉	통과 (0.15ms, 75.9MB)
테스트 9 〉	통과 (0.71ms, 72.5MB)
테스트 10 〉	통과 (0.34ms, 77.5MB)
테스트 11 〉	통과 (0.74ms, 78.2MB)
테스트 12 〉	통과 (0.65ms, 73.4MB)
테스트 13 〉	통과 (0.06ms, 70.7MB)
테스트 14 〉	통과 (0.75ms, 80MB)
