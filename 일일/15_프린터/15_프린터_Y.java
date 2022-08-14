import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index = 0;
        int[] sort = priorities.clone();
        
        
        Arrays.sort(sort);
        
        for(int i = sort.length-1; i >= 0; i--){
            for(int j = 0; j < sort.length; j++){
                if(index == sort.length){ index = 0; }
                if(sort[i] == priorities[index]){
                    answer++;
                    if(index==location){return answer;}
                    index++;
                    break;
                }
                index++;
            }
        }
        
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

테스트 1 〉	통과 (0.34ms, 75.8MB)
테스트 2 〉	통과 (0.52ms, 72MB)
테스트 3 〉	통과 (0.39ms, 73.3MB)
테스트 4 〉	통과 (0.45ms, 74.6MB)
테스트 5 〉	통과 (0.54ms, 78.1MB)
테스트 6 〉	통과 (0.35ms, 79.6MB)
테스트 7 〉	통과 (0.47ms, 68MB)
테스트 8 〉	통과 (0.52ms, 80.8MB)
테스트 9 〉	통과 (0.34ms, 77.7MB)
테스트 10 〉	통과 (0.39ms, 73.2MB)
테스트 11 〉	통과 (0.41ms, 74.6MB)
테스트 12 〉	통과 (0.35ms, 89.6MB)
테스트 13 〉	통과 (0.35ms, 72.7MB)
테스트 14 〉	통과 (0.35ms, 74.5MB)
테스트 15 〉	통과 (0.32ms, 77.9MB)
테스트 16 〉	통과 (0.32ms, 76.6MB)
테스트 17 〉	통과 (0.44ms, 73.4MB)
테스트 18 〉	통과 (0.33ms, 74.1MB)
테스트 19 〉	통과 (0.48ms, 72.8MB)
테스트 20 〉	통과 (0.33ms, 74.8MB)
