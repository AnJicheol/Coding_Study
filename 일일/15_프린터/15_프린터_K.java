class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0; // location보다 앞에 있는 순서들 증가
        int min = 0;
        int[] priorities_print = new int [priorities.length]; // priorities 복사
        
        // priorities 복사
        for(int i = 0; i<priorities.length; i++){
            priorities_print[i] = priorities[i];
        }
        
        // 내림차순 정렬
        for(int i = 0; i<priorities.length; i++){
            min = i;
            for(int j = i+1; j<priorities.length; j++){  
                if(priorities[min] < priorities[j]){
                    min = j;
                }
            }
            int sw = priorities[min];
            priorities[min] = priorities[i];
            priorities[i] = sw;
        }
        
        // location이 프린터 될때까지 반복
        while(count<priorities.length){
            for(int i = 0; i<priorities.length; i++){
                if(priorities_print[i] == priorities[count]){
                    count++;
                    if(i == location) return count;
                }
            }
        }
        
        return count;
    }
}

테스트 1 〉	통과 (0.11ms, 80.1MB)
테스트 2 〉	통과 (0.22ms, 80MB)
테스트 3 〉	통과 (0.13ms, 77.8MB)
테스트 4 〉	통과 (0.05ms, 72.2MB)
테스트 5 〉	통과 (0.01ms, 75.3MB)
테스트 6 〉	통과 (0.03ms, 73.7MB)
테스트 7 〉	통과 (0.05ms, 80MB)
테스트 8 〉	통과 (0.11ms, 77.7MB)
테스트 9 〉	통과 (0.02ms, 88.6MB)
테스트 10 〉	통과 (0.05ms, 77.5MB)
테스트 11 〉	통과 (0.08ms, 78.1MB)
테스트 12 〉	통과 (0.04ms, 75.8MB)
테스트 13 〉	통과 (0.09ms, 73.2MB)
테스트 14 〉	통과 (0.02ms, 72.1MB)
테스트 15 〉	통과 (0.02ms, 78.9MB)
테스트 16 〉	통과 (0.02ms, 71.8MB)
테스트 17 〉	통과 (0.13ms, 80.1MB)
테스트 18 〉	통과 (0.03ms, 76.3MB)
테스트 19 〉	통과 (0.11ms, 73.4MB)
테스트 20 〉	통과 (0.06ms, 72.5MB)
