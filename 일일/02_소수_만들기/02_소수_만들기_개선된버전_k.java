class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int add = 0;
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    add = nums[i] + nums[j] + nums[k];
                    for (int t = 2; t < add; t ++) {
                        if (add % t == 0) {
                            count ++;
                        }
                    }
                    if (count == 0) {
                        result ++;
                    }
                    count = 0;
                    answer = result;
                }
            }
        }
        return answer;
    }
}
