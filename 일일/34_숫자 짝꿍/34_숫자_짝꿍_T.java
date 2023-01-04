class Solution {
    public String solution(String X, String Y) {
        
        StringBuilder sb = new StringBuilder();
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int len = 0;
        
        for(int i = 0; i < X.length(); i++) num1[X.charAt(i) - 48]++; 
        for(int i = 0; i < Y.length(); i++) num2[Y.charAt(i) - 48]++;
        
        for(int i = 9; i >= 0; i--){
          
            len = (num1[i] < num2[i]) ? num1[i] : num2[i];
            
            for(int j = 0; j < len; j++) {
                sb.append((char)(i + '0'));
            }
        }
        
        if(sb.toString().equals("") ) return "-1";
        if(sb.charAt(0) == '0') return "0";
        
        return (sb.toString());
    }
}
