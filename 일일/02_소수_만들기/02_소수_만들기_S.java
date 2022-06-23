class Solution {
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    for (int div = 2; div < sum; div++) {
                        if (sum % div == 0) break;
                        else if (div == sum - 1) answer++;
                    }
                }
            }
        }
        return answer;
    }
  
}


@@@@@@@@@@@@@@@@@@@피드백 후 수정된 코드@@@@@@@@@@@@@@@@@@@ 
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum;
        boolean notDecimal = false;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    for (int div = 2; div < sum; div++) {
                        if (sum % div == 0) {
                            notDecimal = true;
                            break;
                        }
                    }
                    if (!notDecimal) {
                      answer++;
                    } else {
                        notDecimal = false;
                    }
                }
            }
        }
        return answer;
    }
  
}



@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    안지철 
    [9번줄 변수 생성을  for문 밖으로 빼면 더 좋을 거 같다
    결과적으로 같고 성능 차이도 무의미하겠지만 대략n^3제곱번 변수를
    생성 후 초기화 하는 것 보다는 초기화만 하는 것이 더 효율 적일 것이다
    또 코드를 재사용 한다고 해도 해당 메소드는 결과를 리턴하는 즉 호출 당하는
    메소드 이기 때문에 리턴하는 순간 자연스레 메모리는 삭제된다 따라서
    for문이 탈출 하는 순간 본문 메모리 또한 삭제 되기때문에 메모리에
    더 효율적일 것이다를 고려했다면 잘못된 생각이라 생각한다
    
     for (int div = 2; div < sum; div++) {
           if (sum % div == 0) break;
           else if (div == sum - 1) answer++;
     }
    
    또 10번줄 소수 서치 알고리즘은 비효율 적인 것 같다 예를 들어 성민이의 알고리즘
    
     for (int i = 2; i < add; i ++) { // 소수 찾기 위해 2부터 add-1 까지 반복
            if (add % i == 0) {     // 나머지가 0 일경우 count 증가
                count++;
            }
        }
        if (count == 0) {   // count가 0이랑 같을 경우 소수 , result 1 증가
            result ++; 
        }
        
   
    2번째 if문이 for문 밖에 있는데 위 알고리즘 과 비교하면 if문을 보다 적게 수행
    하기 때문에 성능에 더욱 좋을 것이다]
