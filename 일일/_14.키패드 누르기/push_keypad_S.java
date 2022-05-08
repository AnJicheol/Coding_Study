class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left_location = 10;
        int right_location = 12;
        for (int i = 0; i < numbers.length; i++) {
            String next = "";
            if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                int left_distance = find_distance(numbers[i], left_location);
                int right_distance = find_distance(numbers[i], right_location);
                if (right_distance > left_distance) next = "L";
                else if (right_distance == left_distance && hand.equals("right")) next = "R";
                else if (right_distance == left_distance && hand.equals("left")) next = "L";
                else if (right_distance < left_distance) next = "R";
            }
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) next = "L";
            
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) next = "R";
            
            if (next.equals("R")) right_location = numbers[i];
            else left_location = numbers[i];
            
            answer += next;
        }
        return answer;
    }
    
    int find_distance (int num, int location) {
        if (num == 0) num = 11;
        if (location == 0) location = 11;
        int tmp = 4;
        for (int i = -3; i <= 3; i++) {
            for (int j = -3; j <= 3; j++) {
                int tmp2 = Math.abs(i) + Math.abs(j);
                if (location + 3 * i + j == num && tmp2 < tmp) {
                    tmp = tmp2;
                }
            }
        }
        return tmp;
    }
}
