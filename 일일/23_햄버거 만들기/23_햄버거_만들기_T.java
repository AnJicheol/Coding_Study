import java.util.*;

class Solution {
    public int solution(int[] ingredient) {

        ArrayList<Integer> list = new ArrayList <Integer>();
        int answer = 0;
        int num = 0;

        for(Integer i : ingredient){
            list.add(i);
            if(list.size() > 3){
                num += list.get(list.size() - 4) * 1000;
                num += list.get(list.size() - 3) * 100;
                num += list.get(list.size() - 2) * 10;
                num += list.get(list.size() - 1);

                if(num == 1231){
                    for(int j = 0; j < 4; j++) list.remove(list.size() - 1);
                    answer++;
                }
            }
            num = 0;
        }
        return answer;
    }
}
