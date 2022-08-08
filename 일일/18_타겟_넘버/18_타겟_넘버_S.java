class Solution {
    public int solution(int[] numbers, int target) {
        int answer;

        answer = search(numbers, 0, 0, target, 0);

        //System.out.println(answer);

        return answer;
    }

    int search (int[] numbers, int sum, int index, int target, int ans) {
        if (index == numbers.length) {
            if (sum == target) return ans+1;
            else return ans;
        }

        ans = search(numbers, sum + numbers[index], index+1, target, ans);
        ans = search(numbers, sum - numbers[index], index+1, target, ans);

        return ans;

    }
}


테스트 1 〉	통과 (5.10ms, 73.6MB)
테스트 2 〉	통과 (5.99ms, 79MB)
테스트 3 〉	통과 (0.24ms, 78.3MB)
테스트 4 〉	통과 (0.44ms, 71.6MB)
테스트 5 〉	통과 (0.77ms, 79MB)
테스트 6 〉	통과 (0.68ms, 84MB)
테스트 7 〉	통과 (0.23ms, 79MB)
테스트 8 〉	통과 (0.43ms, 71MB)
