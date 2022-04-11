import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> set = new HashSet<>();
 
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                  set.add(numbers[i] + numbers[j]);
            }
        }
        
        Integer[] arr = set.toArray(new Integer[0]);
        int answer[] = new int[set.size()];
        
        for(int i = 0; i < set.size(); i++){
            answer[i] = arr[i];
        }
        
        Arrays.sort(answer);
        return answer;
    }
}


최저 속도 1.17ms  (가장 오래 걸린 시간)
TreeSet보다 전체적으로 빠르며 심한경우 2~3배 차이까지남 (테스트 7,8번)
이유 Set 시간 복잡도 O(1) || TreeSet 시간 복잡도 O(log n)
TreeSet은 Set과 달리 오름차순으로 값을 저장함 따라서 Set 또는 List 보다 add가 느림   TreeSet.add -- > O(log n)     
여기서 문제가 생김 
TreeSet은 Set 처럼 get , index를 사용할 수 없음 즉 일반 적으로 둘다 객체를 만들어 줘야함 
따라서 장점은 정렬된 상태로 저장인데 이로 인한 이득은 TreeSet에 add를 커버하기에는 부족함 (경우에 따라 다를 수 있음)
