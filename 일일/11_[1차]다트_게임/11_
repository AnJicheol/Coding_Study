class Solution {
    public int solution(String dartResult) {
        int[] num = new int[4];
        int index = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            //System.out.println(dartResult.charAt(i));
            switch (dartResult.charAt(i)) {
                case '1' -> {
                    index++;
                    if (dartResult.charAt(i + 1) == '0') {
                        num[index] = 10;
                        i++;
                    } else num[index] = 1;
                }
                case 'S' -> {}
                case 'D' -> num[index] *= num[index];
                case 'T' -> num[index] *= num[index] * num[index];
                case '*' -> {
                    num[index-1] *= 2;
                    num[index] *= 2;
                }
                case '#' -> num[index] = -num[index];
                default -> {
                    index++;
                    num[index] = dartResult.charAt(i) - 48;
                }
            }
            //System.out.println(Arrays.toString(num));
        }
        //System.out.println(num[3] + num[1] + num[2]);
        return num[3] + num[1] + num[2];
    }
}


테스트 1 〉	통과 (0.02ms, 76.6MB)
테스트 2 〉	통과 (0.03ms, 72.6MB)
테스트 3 〉	통과 (0.03ms, 74.1MB)
테스트 4 〉	통과 (0.03ms, 78.3MB)
테스트 5 〉	통과 (0.03ms, 74.8MB)
테스트 6 〉	통과 (0.03ms, 81.5MB)
테스트 7 〉	통과 (0.03ms, 73.9MB)
테스트 8 〉	통과 (0.03ms, 73.7MB)
테스트 9 〉	통과 (0.03ms, 73.1MB)
테스트 10 〉	통과 (0.03ms, 77.2MB)
테스트 11 〉	통과 (0.03ms, 77.4MB)
테스트 12 〉	통과 (0.05ms, 78.7MB)
테스트 13 〉	통과 (0.02ms, 76.1MB)
테스트 14 〉	통과 (0.04ms, 72.6MB)
테스트 15 〉	통과 (0.03ms, 74.1MB)
테스트 16 〉	통과 (0.02ms, 75.6MB)
테스트 17 〉	통과 (0.02ms, 78.3MB)
테스트 18 〉	통과 (0.04ms, 73.6MB)
테스트 19 〉	통과 (0.02ms, 71.8MB)
테스트 20 〉	통과 (0.03ms, 74.6MB)
테스트 21 〉	통과 (0.02ms, 72.8MB)
테스트 22 〉	통과 (0.03ms, 78MB)
테스트 23 〉	통과 (0.02ms, 72.6MB)
테스트 24 〉	통과 (0.03ms, 74.8MB)
테스트 25 〉	통과 (0.03ms, 82.4MB)
테스트 26 〉	통과 (0.02ms, 82.1MB)
테스트 27 〉	통과 (0.02ms, 74.2MB)
테스트 28 〉	통과 (0.03ms, 79.4MB)
테스트 29 〉	통과 (0.03ms, 81MB)
테스트 30 〉	통과 (0.03ms, 85.7MB)
테스트 31 〉	통과 (0.02ms, 71.6MB)
테스트 32 〉	통과 (0.03ms, 75.4MB)
