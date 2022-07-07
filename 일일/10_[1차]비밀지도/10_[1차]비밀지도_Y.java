class Solution {
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i = 0; i < arr1.length; i ++){
            
            String num1 = Integer.toBinaryString(arr1[i]); // 2진수 변환
            String num2 = Integer.toBinaryString(arr2[i]);
            
            // String형 변환
            String sum = Long.toString(Long.parseLong(num1)+Long.parseLong(num2));

            if(sum.length() < arr1.length){
                for(int j = arr1.length - sum.length(); j > 0; j--){
                    sum = "0" + sum;
                }
            }
            sum = sum.replaceAll("[1-2]", "#");
            sum = sum.replaceAll("0", " ");
            answer[i] = sum;
        }

        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
테스트 1 〉	통과 (0.79ms, 73.1MB)
테스트 2 〉	통과 (3.51ms, 74.8MB)
테스트 3 〉	통과 (1.85ms, 75.1MB)
테스트 4 〉	통과 (3.68ms, 77.7MB)
테스트 5 〉	통과 (2.51ms, 77.5MB)
테스트 6 〉	통과 (2.68ms, 75.6MB)
테스트 7 〉	통과 (2.11ms, 70.6MB)
테스트 8 〉	통과 (0.37ms, 73MB)
