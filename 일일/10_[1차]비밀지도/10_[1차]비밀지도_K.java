class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Long i_map;
        String s_map = "";
            
        for(int i = 0; i < n; i++){
            // 2진수로 바꾸고 롱 형태로 변환후 i_map 에 저장 
            i_map = Long.parseLong(Integer.toBinaryString(arr1[i])) + Long.parseLong( Integer.toBinaryString(arr2[i]));
            // i_map을 스트링으로 변환하여 s_map에 저장
            s_map = Long.toString(i_map);
            // 앞자리가 0일경우 찾아 넣어주는 과정
            if(s_map.length()<arr1.length){       
                 for(int j=0; j < n-s_map.length();  j++){ 
                    s_map = s_map.replaceFirst("", " "); // 가장 처음 "" 만 0으로 바꿈
                     j--; // s_map 길이가 같이 증가 하기 때문에 j-- 를 해줌
                 }
            }  
            s_map = s_map.replaceAll("[^0]", "#"); // 0 빼고 모두 #으로 바꿈
            s_map = s_map.replaceAll("[0]", " ");  // 0 을 모두 공백으로 바꿈

            answer[i] = s_map;
        }
        return answer;
    }
}


테스트 1 〉	통과 (0.74ms, 77.9MB)
테스트 2 〉	통과 (1.78ms, 84.9MB)
테스트 3 〉	통과 (0.30ms, 77.4MB)
테스트 4 〉	통과 (0.90ms, 75.9MB)
테스트 5 〉	통과 (0.92ms, 74.5MB)
테스트 6 〉	통과 (1.21ms, 73.8MB)
테스트 7 〉	통과 (0.76ms, 75.6MB)
테스트 8 〉	통과 (0.49ms, 76.9MB)
