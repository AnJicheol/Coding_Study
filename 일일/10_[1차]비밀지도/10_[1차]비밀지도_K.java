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
            i_map = Long.parseLong(Integer.toBinaryString(31));
            
            if(s_map.length()<arr1.length){       
                 for(int j=0; j < n-s_map.length();  j++){ 
                    s_map = '0'+s_map;
                     j--; // s_map 길이가 같이 증가 하기 때문에 j-- 를 해줌
                 }
            }  
            s_map = s_map.replaceAll("[^0]", "#"); // 0 빼고 모두 #으로 바꿈
            s_map = s_map.replaceAll("[0]", " ");  // 0 을 모두 공백으로 바꿈

            answer[i] = s_map;
        }
        
         i_map = Long.parseLong(Integer.toBinaryString(31));
            
            System.out.println(i_map);
        return answer;
    }
}
