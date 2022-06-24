    // nums의 숫자는 1이상 1000이하의 자연수이며, 중복된 숫자가 들어있지 않기 때문에 
    // 소수가 나오는 경우는 같은조합으로 1가지라고 가정한다.

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int prime_number = 0;
        
        int[] box = null; //배열의 크기 동적할당
        
        
        //box의 사이즈를 정하기 위해
        for(int i = 0; i < nums.length; i++){ 
            for(int j = 0 ; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    
                    // 숫자가 중복되지 않으므로 중복되는 숫자가 있으면 for문을 재시작
                    if(nums[i] == nums[j] || nums[j] == nums[k] || nums[i] == nums[k]){
                        continue;
                    }
                    // 중복되지않은 숫자들로 소수판별
                    else {
                        int count=0;
                        // sum = 각 배열의 값들을 더한다.
                        sum = nums[i]+nums[j]+nums[k];
                        
                        for(int division = 1 ; division <= sum ; division++){
                            if(sum % division == 0){
                                count ++;
                                continue;
                            }
                        }
                        if(count == 2){ // 나머지가 0인경우가 2번인 숫자만 소수이다.
                            prime_number++; // 소수의 개수 카운트
                        }
                    }
                }
            }
        }
        box = new int[prime_number]; // 소수의 개수만큼 box의 크기를 정한다.
        System.out.println(box.length);
        
        
        // 모든 숫자를 검사한다.
        prime_number = 0;
        for(int i = 0; i < nums.length; i++){ 
            for(int j = 0 ; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                   
                    /*
                    테스트코드(모든숫자를 전부 검사하는지)
                    System.out.print(nums[i]);
                    System.out.print(nums[j]);
                    System.out.print(nums[k]+"  ");
                    */
                    
                    // 숫자가 중복되지 않으므로 중복되는 숫자가 있으면 for문을 재시작
                    if(nums[i] == nums[j] || nums[j] == nums[k] || nums[i] == nums[k]){
                        continue;
                    }
                    // 중복되지않은 숫자들로 소수판별
                    else {
                        int count=0;
                        // sum = 각 배열의 값들을 더한다.
                        sum = nums[i]+nums[j]+nums[k];
                        
                        for(int division = 1 ; division <= sum ; division++){
                            if(sum % division == 0){
                                count ++;
                                continue;
                            }
                        }
                        if(count == 2){ // 나머지가 0인경우가 2번인 숫자만 소수이다.
                            prime_number++;
                            box[prime_number-1] = sum; //박스에 소수값 할당
                        }
                        
                    }
                }
            }
        }
        //중복검사
        for(int i = 0; i<box.length;i++){
            for(int j = i+1; j<box.length;j++){
                if(box[i] == box[j]){
                    box[j] = 0;
                }
            }
        }
        /* 테스트코드(box의 값 확인)
        for(int a = 0; a<box.length;a++){
            System.out.print(box[a] + " ");
        }
        */
        for(int i = 0; i < box.length;i++){
            if(box[i] != 0){
                answer++;
            }
        }
        

        return answer;
    }
}
