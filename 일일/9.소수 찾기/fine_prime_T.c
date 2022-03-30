#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// nums_len은 배열 nums의 길이입니다.
int solution(int nums[], size_t nums_len) {
    int answer = 0;
    int sum = 0;
    bool result = false;
     
    for (int i = 0; i < nums_len ; i++){      
        for (int j = (i+1) ; j < nums_len ; j++){           
            for (int t = (j+1); t < nums_len ; t++){                 
                sum = nums[i] + nums[j] + nums[t];
                result = true;                
                for(int c = 2; c<sum; c++){                   
                    if((sum % c)==0){                    
                        result = false;
                        break;                  
                    }                    
                }
                if(result == true){
                    answer++;
                }
                sum=0;
            }         
        }      
    }
    return answer;
}
