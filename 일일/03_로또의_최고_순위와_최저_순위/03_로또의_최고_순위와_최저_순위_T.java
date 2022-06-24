import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        Set<Integer> lottoSet = new HashSet<>();

 
        for (int lotto : lottos) if(lotto != 0) lottoSet.add(lotto);    // 0 을 제외한 값으로 set 을 만든다
      
        int[] answer = {1 + lottoSet.size(), 7};   // 0 의 수 만큼은 맞췄다고 가정

        for (int win_num : win_nums) if(lottoSet.contains(win_num)) { --answer[0]; --answer[1]; }  // set 에 존재하는 번호 중 담첨 번호가 있으면 등수가 올라감

        if(answer[0] == 7) --answer[0];    // 낙첨인 경우 중에 전부 다 틀렸을 경우 7등이 없기 때문에 6등 처리
        if(answer[1] == 7) --answer[1];

        return answer;
    }
}
