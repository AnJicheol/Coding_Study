class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int[]  category = new int[8];
        String Target = "RTCFJMAN";
        int index = 0;
        
        for(int i = 0; i < choices.length; i++){
            if(choices[i] - 4 == 0) continue;       
            if(choices[i] - 4 > 0) index = Target.indexOf(survey[i].charAt(1));            
            if(choices[i] - 4 < 0) index = Target.indexOf(survey[i].charAt(0));
        
            category[index] += Math.abs(choices[i] - 4);
        }
        
        for(int i = 0; i < 8; i += 2){         
            if(category[i] >= category[i + 1]) sb.append(Target.charAt(i));
            if(category[i] <  category[i + 1]) sb.append(Target.charAt(i + 1));
        }
            
        return sb.toString();
    }
}
