class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }
        else if (new_id.length() == 0) new_id = "aaa";
        else if (new_id.length() < 3) {
            String last = new_id.substring(new_id.length()-1);
            while (new_id.length() != 3) {
                new_id += last;
            }
        }
      
        answer = new_id;
        
        return answer;
    }
}
