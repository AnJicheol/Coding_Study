import java.util.Arrays;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[][] chart = new String[id_list.length+1][id_list.length+1]; // 세로 4, 가로 4의 2차원 배열생성
        int count = 0;
        int[] count_vote = new int[chart.length];
        
        
        // 2차원의 배열을 생성
        for(int i = 0; i < id_list.length; i ++){
            chart[i+1][0] = id_list[i];
        }
        for(int i = 0; i < id_list.length; i ++){
            chart[0][i+1] = id_list[i];
        }
        
        for(int i = 0; i < report.length; i ++){
            String[] cut_report = report[i].split(" "); // report의 공백을 기준으로 문자열을 자른다.
            for(int column = 0; column < chart.length; column ++){
                for(int row = 0; row < chart.length; row ++){
                    if(cut_report[0].equals(chart[column][0])){ // 신고자의 이름이 일치하는 열을 찾는다.
                        if(cut_report[1].equals(chart[0][row])){ // 피고인의 이름이 일치하는 행을 찾는다.
                            if(chart[column][row] == null){
                                chart[column][row] = "vote";
                                count_vote[row] ++;
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        
        
        for(int column= 1; column < chart.length; column ++){
            for(int row = 1; row < chart.length; row++){
                if(chart[column][row] == "vote" && count_vote[row] >= k){
                    answer[column-1]++;
                }
            }
        }
        
        /*
        // 테스트 코드
        for(int i = 0; i < chart.length; i ++){
            for(int j = 0; j < chart.length; j ++){
                System.out.print(chart[i][j] + " ");
            }
            System.out.print("\n");
        }
        */
        return answer;
    }
}
