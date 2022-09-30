import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int value = 0;
        int smallest = 0;

        Arrays.sort(people);
        
        if (people[0] > limit/2) return people.length;
        
        for (int i = people.length-1; i >= smallest; i--) {
            
            if (people[i] + people[smallest] <= limit) {
                smallest++;
            }   
            
            answer++;
        }
        
        return answer;
    }
}
정확성  테스트
테스트 1 〉	통과 (1.47ms, 80.2MB)
테스트 2 〉	통과 (1.16ms, 76.1MB)
테스트 3 〉	통과 (1.19ms, 74.6MB)
테스트 4 〉	통과 (1.32ms, 80.7MB)
테스트 5 〉	통과 (1.15ms, 69MB)
테스트 6 〉	통과 (0.77ms, 83MB)
테스트 7 〉	통과 (0.75ms, 85.7MB)
테스트 8 〉	통과 (0.40ms, 77MB)
테스트 9 〉	통과 (0.60ms, 65.6MB)
테스트 10 〉	통과 (1.39ms, 80.8MB)
테스트 11 〉	통과 (1.22ms, 78.7MB)
테스트 12 〉	통과 (1.22ms, 82MB)
테스트 13 〉	통과 (1.58ms, 79.4MB)
테스트 14 〉	통과 (1.20ms, 80.1MB)
테스트 15 〉	통과 (0.73ms, 77.5MB)
효율성  테스트
테스트 1 〉	통과 (10.18ms, 53.9MB)
테스트 2 〉	통과 (11.04ms, 55.9MB)
테스트 3 〉	통과 (11.86ms, 53.5MB)
테스트 4 〉	통과 (5.44ms, 54.3MB)
테스트 5 〉	통과 (6.96ms, 53.3MB)
