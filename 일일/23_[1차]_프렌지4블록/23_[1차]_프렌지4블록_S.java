class Solution {
    
    char[][] char_board;
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        int pop = 0;
        boolean[][] clear = new boolean[m][n];
        char_board = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char_board[i][j] = board[i].charAt(j);
            }
        }

        while (true) {
            pop = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (!clear[i][j]){

                        if (check(char_board[i][j], i-1, j-1)) clear[i][j] = true;
                        else if (check(char_board[i][j], i-1, j)) clear[i][j] = true;
                        else if (check(char_board[i][j], i, j-1)) clear[i][j] = true;
                        else if (check(char_board[i][j], i, j)) clear[i][j] = true;

                        if (clear[i][j]) pop++;
                    }
                }
            }

            if (pop == 0) break;
            answer += pop;

            for (int i = 0; i < n; i++) {
                for (int j = m-1; j > 0; j--) {
                    if (clear[j][i]) {
                        int space = 1;
                        char_board[j][i] = ' ';
                        for (int k = j-1; k >= 0; k--) {
                            if (clear[k][i]) space++;
                            else break;
                        }

                        for (int k = j-space; k >= 0; k--) {
                            char_board[k+space][i] = char_board[k][i];
                            clear[k+space][i] = clear[k][i];
                            clear[k][i] = true;
                        }
                    }
                }
            }

        }

        return answer;
    }
    boolean check(char main, int height, int index) {

        if (height < 0 || height == char_board.length-1) {
            return false;
        }
        if (index < 0 || index == char_board[0].length-1) {
            return false;
        }

        for (int i = height; i <= height + 1; i++) {
            for (int j = index; j <= index + 1; j++) {
                if (main != char_board[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}


테스트 1 〉	통과 (0.09ms, 71.3MB)
테스트 2 〉	통과 (0.08ms, 76.3MB)
테스트 3 〉	통과 (0.05ms, 73.3MB)
테스트 4 〉	통과 (0.55ms, 80MB)
테스트 5 〉	통과 (21.98ms, 81.6MB)
테스트 6 〉	통과 (4.12ms, 77.2MB)
테스트 7 〉	통과 (0.40ms, 76.7MB)
테스트 8 〉	통과 (0.52ms, 80.6MB)
테스트 9 〉	통과 (0.08ms, 74.2MB)
테스트 10 〉	통과 (0.48ms, 72MB)
테스트 11 〉	통과 (1.02ms, 76.5MB)
