class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");

        for (int i = 0; i < arr1.length; i++) {
            String binary_1 = make_binary(arr1[i]);
            String binary_2 = make_binary(arr2[i]);
            if (binary_1.length() < n) {
                while (binary_1.length() < n) {
                    binary_1 = 0 + binary_1;
                }
            }
            if (binary_2.length() < n) {
                while (binary_2.length() < n) {
                    binary_2 = 0 + binary_2;
                }
            }
            for (int j = 0; j < binary_1.length(); j++) {
                char a = binary_1.charAt(j);
                char b = binary_2.charAt(j);
                if (a == '1' || b == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }

        }

        return answer;
    }

    String make_binary(int num) {
        String ans = "";
        while (num > 0) {
            ans = (num % 2) + ans;
            num /= 2;
        }
        return ans;
    }
}
