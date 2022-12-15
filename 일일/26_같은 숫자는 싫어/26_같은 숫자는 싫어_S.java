public class Solution {
    public int[] solution(int []arr) {
        int[] arr2 = new int[arr.length];
        int tmp = arr[0];
        int index = 1;
        arr2[0] = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (tmp != arr[i]) {
                tmp = arr[i];
                arr2[index] = tmp;
                index++;
            }
        }
        
        int[] answer = new int[index];
        
        for (int i = 0; i < index; i++) {
            answer[i] = arr2[i];
        }
        
        return answer;
    }
}



정확성  테스트
테스트 1 〉	통과 (0.02ms, 74.1MB)
테스트 2 〉	통과 (0.02ms, 83.5MB)
테스트 3 〉	통과 (0.03ms, 71.1MB)
테스트 4 〉	통과 (0.03ms, 80.1MB)
테스트 5 〉	통과 (0.03ms, 77.2MB)
테스트 6 〉	통과 (0.02ms, 73.4MB)
테스트 7 〉	통과 (0.02ms, 69.6MB)
테스트 8 〉	통과 (0.02ms, 71.5MB)
테스트 9 〉	통과 (0.02ms, 80.3MB)
테스트 10 〉	통과 (0.02ms, 75.4MB)
테스트 11 〉	통과 (0.01ms, 73.9MB)
테스트 12 〉	통과 (0.03ms, 73.5MB)
테스트 13 〉	통과 (0.02ms, 73MB)
테스트 14 〉	통과 (0.01ms, 77.2MB)
테스트 15 〉	통과 (0.01ms, 72.3MB)
테스트 16 〉	통과 (0.03ms, 77.6MB)
테스트 17 〉	통과 (0.02ms, 74.1MB)
효율성  테스트
테스트 1 〉	통과 (14.83ms, 114MB)
테스트 2 〉	통과 (15.01ms, 114MB)
테스트 3 〉	통과 (13.83ms, 111MB)
테스트 4 〉	통과 (15.94ms, 110MB)
