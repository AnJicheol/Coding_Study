import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index = 0;
        int count = 0;
        int[] box = priorities.clone();
        
        Arrays.sort(priorities); // 정렬
        
        for(int i = priorities.length-1 ; i >=0 ; i--){ // 정렬된 배열 뒤에서부터 시작
            while(count < priorities.length){
                if(index == priorities.length){ // index가 배열 끝에 도달하였으면 배열 처음으로
                    index = 0;
                }
                if(box[index] == priorities[i]){
                    answer ++;
                    index++;
                    break;
                }
                index++;
                count++;
            }
            if(index-1 == location){
                break;
            }
            count = 0;
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.50ms, 74MB)
테스트 2 〉	통과 (0.53ms, 81.7MB)
테스트 3 〉	통과 (0.60ms, 76.4MB)
테스트 4 〉	통과 (0.51ms, 76.9MB)
테스트 5 〉	통과 (0.44ms, 76.1MB)
테스트 6 〉	통과 (0.59ms, 74.5MB)
테스트 7 〉	통과 (0.58ms, 78.3MB)
테스트 8 〉	통과 (0.69ms, 84.6MB)
테스트 9 〉	통과 (0.47ms, 71.4MB)
테스트 10 〉	통과 (0.47ms, 73.4MB)
테스트 11 〉	통과 (0.58ms, 77.2MB)
테스트 12 〉	통과 (0.47ms, 76.3MB)
테스트 13 〉	통과 (0.54ms, 75.4MB)
테스트 14 〉	통과 (0.45ms, 73MB)
테스트 15 〉	통과 (0.49ms, 68.8MB)
테스트 16 〉	통과 (0.48ms, 75.3MB)
테스트 17 〉	통과 (0.57ms, 72.5MB)
테스트 18 〉	통과 (0.60ms, 76MB)
테스트 19 〉	통과 (0.66ms, 75MB)
테스트 20 〉	통과 (0.50ms, 74.5MB)
