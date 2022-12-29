import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        //1,7 = 3점
        //2,6 = 2점
        //3,5 = 1점
        //4 = 0점
        
        int[] category = new int[4];
        
        for(int i = 0; i < choices.length;i++){
            switch (survey[i].charAt(0)){
                case 'R': category[0] += 4 - choices[i]; break;
                case 'T': category[0] += (-1) * (4 - choices[i]); break;
                case 'C': category[1] += 4 - choices[i]; break;
                case 'F': category[1] += (-1) * (4 - choices[i]); break;
                case 'J': category[2] += 4 - choices[i]; break;
                case 'M': category[2] += (-1) * (4 - choices[i]); break;
                case 'A': category[3] += 4 - choices[i]; break;
                case 'N': category[3] += (-1) * (4 - choices[i]); break;
            }
        }
        //System.out.println(Arrays.toString(category));
        
        
        
        if(category[0] >= 0){answer.append("R");}
        else{answer.append("T");}
        
        if(category[1] >= 0){answer.append("C");}
        else{answer.append("F");}
        
        if(category[2] >= 0){answer.append("J");}
        else{answer.append("M");}
        
        if(category[3] >= 0){answer.append("A");}
        else{answer.append("N");}
        
        
        
        return answer.toString();
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.03ms, 76.9MB)
테스트 2 〉	통과 (0.05ms, 76.3MB)
테스트 3 〉	통과 (0.05ms, 67.4MB)
테스트 4 〉	통과 (0.04ms, 72.6MB)
테스트 5 〉	통과 (0.03ms, 73.9MB)
테스트 6 〉	통과 (0.04ms, 78.3MB)
테스트 7 〉	통과 (0.09ms, 73.9MB)
테스트 8 〉	통과 (0.06ms, 79.3MB)
테스트 9 〉	통과 (0.04ms, 73.1MB)
테스트 10 〉	통과 (0.05ms, 72MB)
테스트 11 〉	통과 (0.04ms, 77.9MB)
테스트 12 〉	통과 (0.13ms, 78.2MB)
테스트 13 〉	통과 (0.09ms, 78.9MB)
테스트 14 〉	통과 (0.11ms, 74.7MB)
테스트 15 〉	통과 (0.12ms, 83MB)
테스트 16 〉	통과 (0.10ms, 74.4MB)
테스트 17 〉	통과 (0.11ms, 82.2MB)
테스트 18 〉	통과 (0.10ms, 85.8MB)
테스트 19 〉	통과 (0.09ms, 76.8MB)
테스트 20 〉	통과 (0.10ms, 76.2MB)
