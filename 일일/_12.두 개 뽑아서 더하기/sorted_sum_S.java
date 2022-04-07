import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        int num = 0;
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        //System.out.println(set);
        int[] answer = new int[set.size()];

        for (Integer integer : set) {
            answer[num] = integer;
            num++;
        }

        return answer;
    }
}


//처음엔 SortedSet<Integer> set = new TreeSet<>();로 선언했다가 TreeSet 자체로 정렬이 된다는 걸 알고 변경
