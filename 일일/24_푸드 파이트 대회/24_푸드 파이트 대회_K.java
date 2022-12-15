class Solution {
    public String solution(int[] food) {
        String answer = "";

        for(int i = 1; i<food.length; i++){ // 왼쪽 음식 준비
            food[i] = food[i]/2;
            for(int j = 0; j<food[i]; j++){
                answer += i;
            }

        }

        answer += 0; // 물 준비

        for(int i = food.length-1; i > 0; i--){ // 오른쪽 물 준비
            System.out.println(i);
            for(int j = 0; j<food[i]; j++){
                answer += i;
            }
        }
        return answer;
    }
}


테스트 1 〉	통과 (14.71ms, 76.1MB)
테스트 2 〉	통과 (15.33ms, 78.3MB)
테스트 3 〉	통과 (14.73ms, 78.5MB)
테스트 4 〉	통과 (20.63ms, 88.8MB)
테스트 5 〉	통과 (11.52ms, 73.4MB)
테스트 6 〉	통과 (16.70ms, 81.3MB)
테스트 7 〉	통과 (22.53ms, 88.8MB)
테스트 8 〉	통과 (15.41ms, 81.5MB)
테스트 9 〉	통과 (16.16ms, 80MB)
테스트 10 〉	통과 (12.41ms, 79.9MB)
테스트 11 〉	통과 (9.83ms, 78.4MB)
테스트 12 〉	통과 (13.12ms, 79.1MB)
테스트 13 〉	통과 (12.13ms, 78.8MB)
테스트 14 〉	통과 (29.13ms, 102MB)
테스트 15 〉	통과 (11.60ms, 75.1MB)
테스트 16 〉	통과 (9.25ms, 76.3MB)
테스트 17 〉	통과 (10.81ms, 79.6MB)
테스트 18 〉	통과 (10.34ms, 69.8MB)
테스트 19 〉	통과 (12.62ms, 77.6MB)
테스트 20 〉	통과 (12.90ms, 79.9MB)
