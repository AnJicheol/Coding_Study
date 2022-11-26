import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int Bottom = 0;
        
        Arrays.sort(people);
        
        for(int i = people.length - 1; i >= min; i--){           

            if(people[min] + people[i] <= limit){
                Bottom ++;                         
            }       
            answer++;
        }
        return answer;
    }
}
