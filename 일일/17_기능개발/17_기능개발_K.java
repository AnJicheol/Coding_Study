class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] work_days_remaining = new int [progresses.length]; // 기계마다 남은 작업일 수 저장
        int[] min_day_array = new int [progresses.length]; // 현재 기계보다 낮은 기계 갯수 저장
        int min_day = 1; // 현재 기계보다 낮은 기계 갯수 파악
        int index = 0; // min_day_array 
        
        // 남은 작업일 수 저장
        for(int i = 0; i<progresses.length; i++){
            work_days_remaining[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                work_days_remaining[i] +=1;
            }
        }
        
        // 현재 남은 작업일 수보다 적은 것 저장
        int min = work_days_remaining[0]; // 현재 남은 작업일보다 큰 작업일을 저장
        
        for(int i = 1; i<progresses.length; i++){
           if(min < work_days_remaining[i]){
               min = work_days_remaining[i];
               min_day_array[index] = min_day;
               min_day = 1;
               index ++;
               continue;
           }
            min_day++;
        }
        min_day_array[index] = min_day;
        
        // 배열에 다시 저장
        int[] result = new int [index+1];  
        
        for(int i = 0; i<result.length; i++){
            result[i] = min_day_array[i];
        }
      
        return result;
    }
}


테스트 1 〉	통과 (0.01ms, 70.1MB)
테스트 2 〉	통과 (0.03ms, 73.9MB)
테스트 3 〉	통과 (0.02ms, 70.9MB)
테스트 4 〉	통과 (0.01ms, 75.1MB)
테스트 5 〉	통과 (0.02ms, 74.6MB)
테스트 6 〉	통과 (0.02ms, 73.6MB)
테스트 7 〉	통과 (0.03ms, 74.7MB)
테스트 8 〉	통과 (0.01ms, 76.5MB)
테스트 9 〉	통과 (0.02ms, 77.2MB)
테스트 10 〉	통과 (0.02ms, 75.4MB)
테스트 11 〉	통과 (0.01ms, 79.3MB)
