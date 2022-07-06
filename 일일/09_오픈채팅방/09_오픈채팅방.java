import java.util.HashMap;
public class Solution {

    public static String[] solution(String[] record) {              
        HashMap<String, String> map = new HashMap<String, String>();
        int count = 0;

        for(int i=0; i<record.length; i++) {

            if(record[i].charAt(0) == 'L')  continue;           
            else if(record[i].charAt(0) == 'C') count++;
            map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
        }

        String[] answer = new String[record.length - count];
        int index = 0;

        for(int i=0; i<record.length; i++) {     
            if(record[i].charAt(0) == 'E') {
                answer[index++] = map.get(record[i].split(" ")[1]) + "님이 들어왔습니다.";
            }
            else if(record[i].charAt(0) == 'L') {
                answer[index++] = map.get(record[i].split(" ")[1]) + "님이 나갔습니다.";
            }
        }        
        return answer;
    }
}
