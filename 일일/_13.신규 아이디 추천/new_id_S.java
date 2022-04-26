class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        if (new_id.length() == 0) new_id = "a";
        //System.out.println(new_id);
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }
        else if (new_id.length() < 3) {
            String last = new_id.substring(new_id.length()-1);
            StringBuilder new_idBuilder = new StringBuilder(new_id);
            while (new_idBuilder.length() != 3) {
                new_idBuilder.append(last);
            }
            new_id = new_idBuilder.toString();
        }
        //System.out.println(new_id);
        answer = new_id;
        
        return answer;
    }
}

//StringBuilder 가 메모리 소모가 적어서 사용했지만 솔직히 3자리라서 별 차이는 없을 것 같다.
