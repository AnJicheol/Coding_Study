class Minority { 
   int Find_decimal_places(int add) {  // 소수 찾는 메서드
        int result = 0; // 소수 갯 수
        int count = 0;  // 소수 찾을 때 사용 (0보다 크면 소수x)
       
        for (int i = 2; i < add; i ++) { // 소수 찾기 위해 2부터 add-1 까지 반복
            if (add % i == 0) {     // 나머지가 0 일경우 count 증가
                count++;
            }
        }
        if (count == 0) {   // count가 0이랑 같을 경우 소수 , result 1 증가
            result ++; 
        }
        
       return result;    // result(소수 갯수) 반환
    }
    
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int add = 0;
        int result=0;
    
         Minority minority = new Minority();
        
        
        // 3중 for문으로 숫자 세 개 씩 넣기
        for (int i = 0; i < nums.length; i ++) {  // 첫 번째수
            for (int j = i+1; j < nums.length; j ++) {  // 두 번째 수
                for (int k = j+1; k < nums.length; k ++) { // 세 번째 수
                  
                    add = nums[i] + nums[j] + nums[k]; // add에 순서대로 세 개 숫자를 합침
                   
                    
                  result = minority.Find_decimal_places(add); // 소수찾는 메서드에서 리턴값을 result에 저장
                    
                  answer += result; // answer에 result 저장
                }
            }
        }
        return answer;
    }
}
