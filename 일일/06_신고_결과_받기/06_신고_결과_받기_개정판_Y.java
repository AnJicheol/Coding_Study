import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //set은 중복을 허용하지 않으므로 중복을 제거해준다.
        HashSet<String> hash_report = new HashSet<>(Arrays.asList(report));
        String[] new_report = hash_report.toArray(new String[0]);
        
        String[] target_man = new String[new_report.length];
        String[] repoter = new String[new_report.length];

        //System.out.println(Arrays.toString(new_report));
        
        for(int i = 0; i < new_report.length; i ++){
            String[] cut_new_report = new_report[i].split(" "); // new_report의 공백을 기준으로 문자열을 자른다.
                repoter[i] = cut_new_report[0];
                target_man[i] = cut_new_report[1];
        }
        
        HashSet<String> hash_target = new HashSet<>(Arrays.asList(target_man));
        String[] new_target = hash_target.toArray(new String[0]); // new_target = 중복을 뺀 값
        
        //System.out.println(Arrays.toString(new_target));
        
        for(int i = 0; i < new_target.length; i++){
            if(Collections.frequency(Arrays.asList(target_man), new_target[i]) >= k){
                for(int j = 0; j < target_man.length; j ++){
                    if(new_target[i].equals(target_man[j])){
                        answer[Arrays.asList(id_list).indexOf(repoter[j])] ++;
                    }
                }
            }
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.20ms, 74.4MB)
테스트 2 〉	통과 (0.27ms, 78.8MB)
테스트 3 〉	통과 (2239.60ms, 177MB)
테스트 4 〉	통과 (0.39ms, 86.9MB)
테스트 5 〉	통과 (0.39ms, 76.2MB)
테스트 6 〉	통과 (8.34ms, 87.4MB)
테스트 7 〉	통과 (11.85ms, 80.8MB)
테스트 8 〉	통과 (14.51ms, 99.9MB)
테스트 9 〉	통과 (618.82ms, 136MB)
테스트 10 〉	통과 (317.48ms, 145MB)
테스트 11 〉	통과 (1513.17ms, 167MB)
테스트 12 〉	통과 (4.88ms, 67.5MB)
테스트 13 〉	통과 (3.33ms, 75.3MB)
테스트 14 〉	통과 (812.67ms, 147MB)
테스트 15 〉	통과 (626.06ms, 157MB)
테스트 16 〉	통과 (1.74ms, 77.7MB)
테스트 17 〉	통과 (3.43ms, 73.3MB)
테스트 18 〉	통과 (7.65ms, 74.1MB)
테스트 19 〉	통과 (16.50ms, 91.8MB)
테스트 20 〉	통과 (845.65ms, 147MB)
테스트 21 〉	통과 (1665.30ms, 142MB)
테스트 22 〉	통과 (0.20ms, 77.1MB)
테스트 23 〉	통과 (0.30ms, 73.2MB)
테스트 24 〉	통과 (0.18ms, 77.7MB)
