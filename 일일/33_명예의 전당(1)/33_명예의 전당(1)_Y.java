import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = score[0];
        LinkedList<Integer> box = new LinkedList<Integer>();
        
        for(int i = 0 ; i < score.length; i++){
            
            if(box.size() < k){ // k보다 작은경우
                if(score[i] <= min){box.add(0,score[i]); min = score[i];} // 제일작은경우
                else{
                    for(int j = box.size()-1; j >= 0; j--){ // 정렬
                        if(score[i] >= box.get(j)){box.add(j+1,score[i]); break;}
                    }
                }
                answer[i] = box.get(0);
                continue;
            }
            
            else{ // 크기가 k인경우
                if(score[i] >= min){
                    for(int j = box.size()-1; j >= 0; j--){ // 정렬
                        if(score[i] >= box.get(j)){box.add(j+1,score[i]); break;}
                    }
                    box.removeFirst(); // 밀어내기
                }
                min = box.get(0);
                answer[i] = min;
            }
            //System.out.println(box + " " + min);
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.26ms, 71.6MB)
테스트 2 〉	통과 (0.17ms, 77.8MB)
테스트 3 〉	통과 (0.15ms, 78.4MB)
테스트 4 〉	통과 (0.18ms, 74.3MB)
테스트 5 〉	통과 (0.27ms, 74.8MB)
테스트 6 〉	통과 (0.15ms, 75MB)
테스트 7 〉	통과 (0.14ms, 74.3MB)
테스트 8 〉	통과 (0.19ms, 75.7MB)
테스트 9 〉	통과 (0.29ms, 78.2MB)
테스트 10 〉	통과 (0.32ms, 79.6MB)
테스트 11 〉	통과 (0.34ms, 75.3MB)
테스트 12 〉	통과 (2.59ms, 82.4MB)
테스트 13 〉	통과 (2.72ms, 79MB)
테스트 14 〉	통과 (1.30ms, 66.5MB)
테스트 15 〉	통과 (3.60ms, 87.3MB)
테스트 16 〉	통과 (2.37ms, 86.5MB)
테스트 17 〉	통과 (2.95ms, 81.9MB)
테스트 18 〉	통과 (2.84ms, 77.8MB)
테스트 19 〉	통과 (0.85ms, 96.7MB)
테스트 20 〉	통과 (0.57ms, 74.5MB)
테스트 21 〉	통과 (0.57ms, 83.5MB)
테스트 22 〉	통과 (0.76ms, 72.2MB)
테스트 23 〉	통과 (0.61ms, 73.1MB)
테스트 24 〉	통과 (0.79ms, 75.9MB)
테스트 25 〉	통과 (0.61ms, 78.7MB)
테스트 26 〉	통과 (0.14ms, 76.8MB)
