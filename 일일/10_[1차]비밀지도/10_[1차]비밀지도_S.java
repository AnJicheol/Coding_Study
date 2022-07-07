class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String sum = String.valueOf(make_binary(arr1[i]) + make_binary(arr2[i]));
            for (int j = sum.length(); j < n; j++) {
                sum = "0" + sum;
            }
            answer[i] = sum.replaceAll("[1-2]", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        return answer;
    }

    long make_binary(int num) {
        long ans = 0L;
        long digit = 1;
        while (num > 0) {
            ans = (num % 2) * digit  + ans;
            num /= 2;
            digit *= 10;
        }

        return ans;
    }
}
