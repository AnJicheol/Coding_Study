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


