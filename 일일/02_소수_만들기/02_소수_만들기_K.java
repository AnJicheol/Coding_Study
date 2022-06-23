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


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
안지철
[소수 판별 과정을 다른 클래스로 나누었는데 결과적으로 수행과정에서
호출 단계가 생기고 특히 이번 알고리즘 처럼 다차원 for문을 써야할 땐
성능에 매우 치명적인 영향을 끼칠 것 같다 또 이번 코드는 가독성 또한
더 떨어진 느낌이든다 하지만 다차원 for문이 반복하는 횟수가 많다는 것을
인지하고 이를 개선하려고 시도한 것은 매우 시도였다]
 
   
송정훈 
[객체지향을 생각해서 Minority 클래스를 만든 거라고 생각해. 객체지향적인 생각은 좋지만
단지 소수를 판별하는 간단한 하나의 매서드만 가진다면 성능 상 solution 클래스에
포함 시키는 편이 좋다고 생각해. 또한 37번과 38번은 
answer += minority.Find_decimal_places(add);
이런 식으로 간소화 시킬 수 있을 것 같아.]
