class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            answer += Split(babbling[i], ' ');
        }

        return answer;
    }
    int Split(String str, char str2) {


        if(str.length() == 0) return 1;
        if(str.startsWith("aya") && str2 != 'a') return Split(str.substring(3), str.charAt(0));      
        if(str.startsWith("woo") && str2 != 'w') return Split(str.substring(3), str.charAt(0));
        if(str.startsWith( "ye") && str2 != 'y') return Split(str.substring(2), str.charAt(0));
        if(str.startsWith( "ma") && str2 != 'm') return Split(str.substring(2), str.charAt(0));
        return 0;
    }
}
