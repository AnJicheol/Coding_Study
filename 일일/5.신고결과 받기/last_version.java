import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] report_split;
        ArrayList<String> reporters;
        Set<String> set = new HashSet<>(Arrays.asList(report));
        HashMap<String, ArrayList<String>> reporter_Map = new HashMap<>();

        for (String report_list : set) {
            report_split = report_list.split(" ");
            if (reporter_Map.containsKey(report_split[1])) {
                reporters = reporter_Map.get(report_split[1]);
            }
            else {
                reporters = new ArrayList<>();
            }
            reporters.add(report_split[0]);
            reporter_Map.put(report_split[1], reporters);
        }


        for (String id : id_list) {

            if (reporter_Map.containsKey(id) && reporter_Map.get(id).size() >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (reporter_Map.get(id).contains(id_list[i])) answer[i]++;
                }
            }
        }

        return answer;
    }
}
