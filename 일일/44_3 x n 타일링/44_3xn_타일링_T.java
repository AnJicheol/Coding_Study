class Solution {
    public int solution(int n) {
        
        long[] num = new long[n + 1];
        long sum = 0;
        
        num[2] = 3;
        
        for (int i = 4; i <= n; i += 2) {
            num[i] = (num[i - 2] * 3 + (sum * 2 + 2)) % 1000000007;
            sum += num[i - 2] % 1000000007;
        }

        return (int)num[n];
    }
}
