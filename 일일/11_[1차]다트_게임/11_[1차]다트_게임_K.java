class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int [] value = new int [5]; // 값만 담을 변수
        char arr[] = dartResult.toCharArray();
        int num = 0; // 숫자를 담음
        int count = 0; // value 배열 인덱스 증가
        
        for(int i = 0; i<dartResult.length(); i++){
            if(Character.isDigit(arr[i]) == true) {
				num= arr[i];
                num -= '0';
                if(arr[i] == '1' && arr[i+1] == '0'){
                    num = 10;
                    i++;
                }     
            }    
    
            else{      
                switch(arr[i]){    
               // S일 경우 그냥 출력 
                case 'S' :              
                    value[count] = num;
                        count++;
                    break;
                        
               // D일 경우 제곱 
                    case 'D': 
                        value[count] = num*num;
                        count++;
                        break;
                        
               // T일경우 세제곱
                    case 'T': 
                        value[count] = num*num*num;
                        count++;
                        break;
                        
              // #일경우 -1을 곱합
                    case '#' :
                        value[count-1] *= (-1); 
                        break;
              // *일경우           
                    case '*' :
                        if((count - 1) == 0) value[count-1] *= 2;
                        else{
                            value[count-1] *= 2;
                            value[count-2] *= 2;
                        }
                        break;
                }
            }  
        }           
        answer = value[0]+value[1]+value[2];
        return answer;
    }
}

테스트 1 〉	통과 (0.03ms, 71.7MB)
테스트 2 〉	통과 (0.06ms, 74MB)
테스트 3 〉	통과 (0.05ms, 76.4MB)
테스트 4 〉	통과 (0.06ms, 76.9MB)
테스트 5 〉	통과 (0.03ms, 72.7MB)
테스트 6 〉	통과 (0.04ms, 75MB)
테스트 7 〉	통과 (0.04ms, 67.3MB)
테스트 8 〉	통과 (0.06ms, 73.8MB)
테스트 9 〉	통과 (0.04ms, 77MB)
테스트 10 〉	통과 (0.03ms, 69MB)
테스트 11 〉	통과 (0.05ms, 71.4MB)
테스트 12 〉	통과 (0.06ms, 77.2MB)
테스트 13 〉	통과 (0.04ms, 74.2MB)
테스트 14 〉	통과 (0.03ms, 74.3MB)
테스트 15 〉	통과 (0.03ms, 76.4MB)
테스트 16 〉	통과 (0.04ms, 75.2MB)
테스트 17 〉	통과 (0.04ms, 74.9MB)
테스트 18 〉	통과 (0.06ms, 84.3MB)
테스트 19 〉	통과 (0.03ms, 77.1MB)
테스트 20 〉	통과 (0.05ms, 81.7MB)
테스트 21 〉	통과 (0.04ms, 77.2MB)
테스트 22 〉	통과 (0.05ms, 73.1MB)
테스트 23 〉	통과 (0.05ms, 74.5MB)
테스트 24 〉	통과 (0.06ms, 73.6MB)
테스트 25 〉	통과 (0.03ms, 70.6MB)
테스트 26 〉	통과 (0.05ms, 87.7MB)
테스트 27 〉	통과 (0.04ms, 76.3MB)
테스트 28 〉	통과 (0.03ms, 72.1MB)
테스트 29 〉	통과 (0.04ms, 72.7MB)
테스트 30 〉	통과 (0.06ms, 71.9MB)
테스트 31 〉	통과 (0.05ms, 70.9MB)
테스트 32 〉	통과 (0.04ms, 75.6MB)
