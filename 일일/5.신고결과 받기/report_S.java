class Solution {  //총 30분
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];



        for (int i = 0; i < id_list.length; i++) {
            int k_count = 0;
            String reporters = "";


            for (int j = 0; j < report.length; j++) {
                String[] reporter_reported = report[j].split(" ");
                //System.out.println("신고자 "+reporter_reported[0]+" 신고당한 사람 "+reporter_reported[1]);
                if (!reporters.contains(reporter_reported[0]) && reporter_reported[1].equals(id_list[i])) {
                    k_count++;
                    reporters = reporters + " " + reporter_reported[0];
                    //System.out.println(reporters + " count "+ k_count);
                }

            }

            if (k_count >= k) {
                for (int j = 0; j < id_list.length; j++) {
                    if (reporters.contains(id_list[j])) answer[j]++;
                }
            }

        }


        return answer;
    }
}
