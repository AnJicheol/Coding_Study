class Solution {
    public int solution(int[] nums) {
        int answer = 0;


        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int a = j+1; a < nums.length; a++) {
                    int sum = nums[i]+nums[j]+nums[a];
                    if (Prime_check(sum)) answer++;
                }
            }
        }

        return answer;
    }

    boolean Prime_check(int result) {
        for (int i = 2; i < result; i++) {
            if (result % i == 0) return false;
        }
        return true;
    }
}
