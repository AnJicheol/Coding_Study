import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d); // 정렬을 해서 budget 보다 큰수를 빨리 찾음
        
        for(int i = 0; i<d.length; i++){
             answer += d[i]; // answer에 d[i]를 더해줌
             if(answer > budget)  return i; // 크다면 i를 리턴 해준다 
        }
        
        answer = d.length; // 다 더해도 budget 작기때문에 배열 크기를 answer에 넣어줌
        return answer;
    }
}


테스트 1 〉	통과 (0.33ms, 73.1MB)
테스트 2 〉	통과 (0.34ms, 76.8MB)
테스트 3 〉	통과 (0.36ms, 78MB)
테스트 4 〉	통과 (0.30ms, 76.6MB)
테스트 5 〉	통과 (0.30ms, 76.9MB)
테스트 6 〉	통과 (0.32ms, 76.2MB)
테스트 7 〉	통과 (0.40ms, 72.9MB)
테스트 8 〉	통과 (0.37ms, 75.2MB)
테스트 9 〉	통과 (0.34ms, 78.1MB)
테스트 10 〉	통과 (0.37ms, 75.8MB)
테스트 11 〉	통과 (0.38ms, 75.4MB)
테스트 12 〉	통과 (0.36ms, 66.5MB)
테스트 13 〉	통과 (0.37ms, 81.2MB)
테스트 14 〉	통과 (0.37ms, 77.1MB)
테스트 15 〉	통과 (0.39ms, 76MB)
테스트 16 〉	통과 (0.52ms, 72.3MB)
테스트 17 〉	통과 (0.39ms, 76.6MB)
테스트 18 〉	통과 (0.40ms, 73.8MB)
테스트 19 〉	통과 (0.38ms, 76.5MB)
테스트 20 〉	통과 (0.46ms, 75.6MB)
테스트 21 〉	통과 (0.36ms, 72.5MB)
테스트 22 〉	통과 (0.44ms, 78.1MB)
테스트 23 〉	통과 (0.34ms, 73.9MB)
