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
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.14ms, 77.3MB)
테스트 2 〉	통과 (0.22ms, 76MB)
테스트 3 〉	통과 (3456.11ms, 160MB)
테스트 4 〉	통과 (0.26ms, 76.4MB)
테스트 5 〉	통과 (0.35ms, 79.3MB)
테스트 6 〉	통과 (14.22ms, 79.5MB)
테스트 7 〉	통과 (19.20ms, 88.4MB)
테스트 8 〉	통과 (28.21ms, 93.3MB)
테스트 9 〉	통과 (931.34ms, 118MB)
테스트 10 〉	통과 (989.72ms, 123MB)
테스트 11 〉	통과 (3205.79ms, 159MB)
테스트 12 〉	통과 (5.81ms, 77.6MB)
테스트 13 〉	통과 (5.67ms, 70.6MB)
테스트 14 〉	통과 (1715.27ms, 134MB)
테스트 15 〉	통과 (3346.02ms, 160MB)
테스트 16 〉	통과 (2.32ms, 80.8MB)
테스트 17 〉	통과 (7.19ms, 83.9MB)
테스트 18 〉	통과 (8.83ms, 71.9MB)
테스트 19 〉	통과 (12.25ms, 82.2MB)
테스트 20 〉	통과 (1652.45ms, 132MB)
테스트 21 〉	통과 (3375.77ms, 151MB)
테스트 22 〉	통과 (0.13ms, 78MB)
테스트 23 〉	통과 (0.15ms, 78.4MB)
테스트 24 〉	통과 (0.14ms, 87.5MB)
