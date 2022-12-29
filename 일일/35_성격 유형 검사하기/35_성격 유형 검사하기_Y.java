import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        //1,7 = 3점
        //2,6 = 2점
        //3,5 = 1점
        //4 = 0점
        
        int[] category = new int[4];
        
        for(int i = 0; i < choices.length;i++){
            if(survey[i].charAt(0) == 'R'){
                category[0] += 4 - choices[i];
            }
            else if(survey[i].charAt(0) == 'T'){
                category[0] += (-1) * (4 - choices[i]);
            }
            else if(survey[i].charAt(0) == 'C'){
                category[1] += 4 - choices[i];
            }
            else if(survey[i].charAt(0) == 'F'){
                category[1] += (-1) * (4 - choices[i]);
            }
            else if(survey[i].charAt(0) == 'J'){
                category[2] += 4 - choices[i];
            }
            else if(survey[i].charAt(0) == 'M'){
                category[2] += (-1) * (4 - choices[i]);
            }
            else if(survey[i].charAt(0) == 'A'){
                category[3] += 4 - choices[i];
            }
            else if(survey[i].charAt(0) == 'N'){
                category[3] += (-1) * (4 - choices[i]);
            }
        }
        //System.out.println(Arrays.toString(category));
        
        if(category[0] >= 0){answer += "R";}
        else if(category[0] < 0){answer += "T";}
        
        if(category[1] >= 0){answer += "C";}
        else if(category[1] < 0){answer += "F";}
        
        if(category[2] >= 0){answer += "J";}
        else if(category[2] < 0){answer += "M";}
        
        if(category[3] >= 0){answer += "A";}
        else if(category[3] < 0){answer += "N";}
        
        
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (1.94ms, 74.1MB)
테스트 2 〉	통과 (1.98ms, 72.9MB)
테스트 3 〉	통과 (2.21ms, 75.9MB)
테스트 4 〉	통과 (3.00ms, 85.5MB)
테스트 5 〉	통과 (2.04ms, 77.4MB)
테스트 6 〉	통과 (3.05ms, 76.6MB)
테스트 7 〉	통과 (2.65ms, 73.6MB)
테스트 8 〉	통과 (2.83ms, 74.6MB)
테스트 9 〉	통과 (2.80ms, 72.6MB)
테스트 10 〉	통과 (2.08ms, 72.1MB)
테스트 11 〉	통과 (2.19ms, 78.7MB)
테스트 12 〉	통과 (1.90ms, 75MB)
테스트 13 〉	통과 (3.26ms, 75.3MB)
테스트 14 〉	통과 (2.60ms, 87MB)
테스트 15 〉	통과 (2.18ms, 80.7MB)
테스트 16 〉	통과 (2.21ms, 79.8MB)
테스트 17 〉	통과 (2.54ms, 74.7MB)
테스트 18 〉	통과 (2.08ms, 76.7MB)
테스트 19 〉	통과 (2.03ms, 74.7MB)
테스트 20 〉	통과 (2.22ms, 72.5MB)
