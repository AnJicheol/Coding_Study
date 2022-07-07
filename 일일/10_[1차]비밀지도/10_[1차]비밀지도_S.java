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

테스트 1 〉	통과 (0.64ms, 69.5MB)
테스트 2 〉	통과 (3.35ms, 74MB)
테스트 3 〉	통과 (1.91ms, 76MB)
테스트 4 〉	통과 (2.30ms, 77.9MB)
테스트 5 〉	통과 (2.18ms, 76.7MB)
테스트 6 〉	통과 (2.66ms, 76.7MB)
테스트 7 〉	통과 (2.30ms, 72.8MB)
테스트 8 〉	통과 (0.37ms, 70.1MB)
