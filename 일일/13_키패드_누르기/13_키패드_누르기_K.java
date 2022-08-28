class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 인덱스 0:왼쪽 1:가운데 2:오른쪽
        int[] x = {1,2,3}; 
        int[] y = {4,0,4}; 
        int r; // 오른손과 numbers의 거리 
        int l; // 왼손과 numbers의 거리
        for(int i = 0; i<numbers.length; i++){
            // 3,6,9
            if(numbers[i] != 0 && numbers[i]%3 == 0){
                answer += 'R';
                y[2] = numbers[i]/3; 
                x[2] = 3; 
            }
            // 1,2,3
            else if (numbers[i]%3 == 1){
                answer += 'L';
                y[0] = (numbers[i]/3)+1;
                x[0] = 1;
            }
            // 2,5,8,0
            else{   
                if(numbers[i]==0){
                    y[1] = 4;
                }
                else{
                   y[1] = (numbers[i]/3)+1;
                }
                // 거리 구하기
                r = (Math.abs(x[2] - x[1])) + (Math.abs(y[2] - y[1]));
                l = (Math.abs(x[0] - x[1])) + (Math.abs(y[0] - y[1]));
                
                if(r == l){
                    if(hand.charAt(0) == 'r'){
                        answer += 'R';
                    }
                    else{
                        answer += 'L';
                    }
                }
                else if(r<l){
                    answer += 'R';
                }
                else{
                    answer += 'L';
                }  
                
                // 좌표 넣어주기
                if(answer.charAt(i) == 'R'){
                    x[2] = x[1];
                    y[2] = y[1];
                }
                else{
                    x[0] = x[1];
                    y[0] = y[1];
                }
            }
        }     
        return answer;    
    }
}

    

정확성  테스트
테스트 1 〉	통과 (1.85ms, 76.1MB)
테스트 2 〉	통과 (2.16ms, 78MB)
테스트 3 〉	통과 (1.99ms, 79.6MB)
테스트 4 〉	통과 (1.68ms, 72.8MB)
테스트 5 〉	통과 (1.99ms, 78.9MB)
테스트 6 〉	통과 (1.96ms, 75.6MB)
테스트 7 〉	통과 (2.83ms, 76.8MB)
테스트 8 〉	통과 (2.90ms, 79.4MB)
테스트 9 〉	통과 (1.96ms, 66.6MB)
테스트 10 〉	통과 (1.84ms, 74.4MB)
테스트 11 〉	통과 (2.11ms, 71.3MB)
테스트 12 〉	통과 (2.12ms, 78.2MB)
테스트 13 〉	통과 (2.86ms, 77.3MB)
테스트 14 〉	통과 (2.35ms, 80.3MB)
테스트 15 〉	통과 (2.58ms, 72MB)
테스트 16 〉	통과 (2.37ms, 76.9MB)
테스트 17 〉	통과 (4.20ms, 73.8MB)
테스트 18 〉	통과 (2.95ms, 76.5MB)
테스트 19 〉	통과 (3.04ms, 77.3MB)
테스트 20 〉	통과 (2.97ms, 75.9MB)
