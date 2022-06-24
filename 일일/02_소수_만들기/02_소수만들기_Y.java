// nums의 숫자는 1이상 1000이하의 자연수이며, 중복된 숫자가 들어있지 않기 때문에 
    // 소수가 나오는 경우는 같은조합으로 1가지라고 가정한다.

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int prime_number = 0;
        int count = 0;
        
        // 모든 경우를 검사한다.
        for(int i = 0; i < nums.length; i++){ 
            for(int j = i+1 ; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){

                    /*테스트코드(모든숫자를 전부 검사하는지)
                    System.out.print(nums[i]);
                    System.out.print(nums[j]);
                    System.out.print(nums[k]+"  ");
                    */
                    sum = nums[i] + nums[j] + nums[k];
                    
                    for(int division = 1; division <= sum; division++){
                        
                        if(sum % division ==0){
                            count++;
                        }
                    }
                    
                    if(count == 2){
                        prime_number++;
                    }
                    count = 0;
                }
            }
        }
        answer = prime_number;
        return answer;
        }
    }
