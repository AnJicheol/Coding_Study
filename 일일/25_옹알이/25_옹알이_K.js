function solution(babbling) {
    var answer = 0;
    const regex = /^[0-9]+$/;

    for(var i=0;i<babbling.length; i++){
        babbling[i] = babbling[i].replaceAll("aya","1") // aya, ye, woo, ma 각 1,2,3,4 로 바꾼다.
        babbling[i] = babbling[i].replaceAll("ye","2")
        babbling[i] = babbling[i].replaceAll("woo","3")
        babbling[i] = babbling[i].replaceAll("ma","4")

        if(regex.test(babbling[i]) == true){ // 숫자로만 되어있는지 확인한다.
            var test = '5';
            var count = 1;
            for(var j = 0; j<babbling[i].length; j++){ 
                if(babbling[i].charAt(j) != test){ // 숫자가 중복되는지 확인
                    test = babbling[i].charAt(j)
                }
                else{
                    count = 0; // 0이면 중복
                    break;
                }
            }
            if(count == 1) answer++;
        }
    }
    return answer;
}


테스트 1 〉	통과 (0.21ms, 33.4MB)
테스트 2 〉	통과 (0.16ms, 33.5MB)
테스트 3 〉	통과 (0.15ms, 33.5MB)
테스트 4 〉	통과 (0.15ms, 33.5MB)
테스트 5 〉	통과 (0.23ms, 33.4MB)
테스트 6 〉	통과 (0.15ms, 33.5MB)
테스트 7 〉	통과 (0.22ms, 33.5MB)
테스트 8 〉	통과 (0.21ms, 33.4MB)
테스트 9 〉	통과 (0.23ms, 33.4MB)
테스트 10 〉	통과 (0.22ms, 33.5MB)
테스트 11 〉	통과 (0.31ms, 33.5MB)
테스트 12 〉	통과 (0.36ms, 33.6MB)
테스트 13 〉	통과 (0.35ms, 33.4MB)
테스트 14 〉	통과 (0.34ms, 33.5MB)
테스트 15 〉	통과 (0.37ms, 33.6MB)
테스트 16 〉	통과 (0.36ms, 33.5MB)
테스트 17 〉	통과 (0.37ms, 33.5MB)
테스트 18 〉	통과 (0.34ms, 33.4MB)
테스트 19 〉	통과 (0.24ms, 33.4MB)
테스트 20 〉	통과 (0.26ms, 33.4MB)
