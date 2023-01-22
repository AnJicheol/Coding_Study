import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] date = new int[3];
        int num;
        int count = 0;
        
        int[] today_int = new int[3];
        
        today_int[0] = Integer.parseInt(today.substring(0,4)); // 년
        today_int[1] = Integer.parseInt(today.substring(5,7)); // 월
        today_int[2] = Integer.parseInt(today.substring(8,10)); // 일
        
        //System.out.println(Arrays.toString(today_int));
        
        for(int i = 0; i < privacies.length; i++){ // 년월일로 문자열 분리
            date[0] = Integer.parseInt(privacies[i].substring(0,4)); // 년
            date[1] = Integer.parseInt(privacies[i].substring(5,7)); // 월
            date[2] = Integer.parseInt(privacies[i].substring(8,10)); // 일

            for(int j = 0; j < terms.length; j++){ // 유효기간 확인
                if(privacies[i].charAt(privacies[i].length()-1) == terms[j].charAt(0)){
                    num = Integer.parseInt(terms[j].substring(2,terms[j].length()));
                    //System.out.println(num);
                    
                    date[0] += (date[1] + num) / 12; // 년
                    date[1] = (date[1] + num) % 12; // 월
                    date[2]--; // 일
                    
                    if(date[1] == 0){date[1] = 12; date[0]--;}
                    if(date[2] == 0){date[2] = 28; date[1]--;}               
                }
            }
            //System.out.println(date[0] + " " + date[1] + " " + date[2]);
            
            if(today_int[0] == date[0]){ // 년이 같다면
                if(today_int[1] == date[1]){ // 월이 같다면
                    if(today_int[2] == date[2]){continue;} // 일이 같다면
                    else if(today_int[2] > date[2]){count++; privacies[i] += "*"; continue;}
                    else{continue;}
                }
                else if(today_int[1] > date[1]){count++; privacies[i] += "*"; continue;}
                else{continue;}
            }
            else if(today_int[0] > date[0]){count++; privacies[i] += "*";} // 년이 더 큰 경우
            else{continue;}
        }
        
        //System.out.println(Arrays.toString(privacies));
        
        int[] answer = new int[count];
        int index = 0;
        
        for(int i = 0; i < privacies.length; i++){
            if(privacies[i].charAt(privacies[i].length()-1) == '*'){answer[index] = i+1; index++;}
        }
        
        
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (1.93ms, 79MB)
테스트 2 〉	통과 (1.90ms, 76.5MB)
테스트 3 〉	통과 (1.75ms, 78.8MB)
테스트 4 〉	통과 (1.75ms, 75MB)
테스트 5 〉	통과 (2.01ms, 78.7MB)
테스트 6 〉	통과 (1.95ms, 76.1MB)
테스트 7 〉	통과 (1.82ms, 75.6MB)
테스트 8 〉	통과 (1.76ms, 73.6MB)
테스트 9 〉	통과 (1.99ms, 74.3MB)
테스트 10 〉	통과 (2.81ms, 83.3MB)
테스트 11 〉	통과 (3.27ms, 77.4MB)
테스트 12 〉	통과 (3.06ms, 77.8MB)
테스트 13 〉	통과 (2.88ms, 76.1MB)
테스트 14 〉	통과 (2.00ms, 77.8MB)
테스트 15 〉	통과 (2.29ms, 75.7MB)
테스트 16 〉	통과 (3.22ms, 74.7MB)
테스트 17 〉	통과 (2.77ms, 72.2MB)
테스트 18 〉	통과 (2.95ms, 78MB)
테스트 19 〉	통과 (3.31ms, 72.6MB)
테스트 20 〉	통과 (3.41ms, 77.9MB)
