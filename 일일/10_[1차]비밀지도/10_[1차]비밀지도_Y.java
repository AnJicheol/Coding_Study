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
