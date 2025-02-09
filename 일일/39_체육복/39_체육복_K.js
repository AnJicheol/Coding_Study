function solution(n, lost, reserve) {
    var answer = 0;
    var Exceeded = 32 // 최대 번호는 30
    lost.sort(function(a,b){ // 정렬
        return a-b
    })
    reserve.sort(function(a,b){ // 정렬
        return a-b
    })
    
    for(var i=0; i<lost.length; i++){ // lost reserve 중복 확인
        for(var j=0; j<reserve.length; j++){
            if(lost[i] == reserve[j]){
                lost[i] = Exceeded
                reserve[j] = Exceeded
                answer++
            }
        }
    }
        
    n -= lost.length
    
    for(var i=0; i<lost.length; i++){ // 오차 1 확인
        for(var j=0; j<reserve.length; j++){
            if(Math.abs(lost[i] - reserve[j]) == 1){
                answer++
                reserve[j] = Exceeded
                break;
            }
        }
    }
  
    answer += n
    return answer;
}

테스트 1 〉	통과 (0.20ms, 32.8MB)
테스트 2 〉	통과 (0.20ms, 32.7MB)
테스트 3 〉	통과 (0.17ms, 33.4MB)
테스트 4 〉	통과 (0.16ms, 33.4MB)
테스트 5 〉	통과 (0.18ms, 33.4MB)
테스트 6 〉	통과 (0.20ms, 33.3MB)
테스트 7 〉	통과 (0.20ms, 33.4MB)
테스트 8 〉	통과 (0.17ms, 33.5MB)
테스트 9 〉	통과 (0.08ms, 33.5MB)
테스트 10 〉	통과 (0.21ms, 33.4MB)
테스트 11 〉	통과 (0.16ms, 33.4MB)
테스트 12 〉	통과 (0.08ms, 33.4MB)
테스트 13 〉	통과 (0.08ms, 33.4MB)
테스트 14 〉	통과 (0.09ms, 33.4MB)
테스트 15 〉	통과 (0.08ms, 33.4MB)
테스트 16 〉	통과 (0.09ms, 33.4MB)
테스트 17 〉	통과 (0.07ms, 33.4MB)
테스트 18 〉	통과 (0.08ms, 33.3MB)
테스트 19 〉	통과 (0.08ms, 33.4MB)
테스트 20 〉	통과 (0.08ms, 33.4MB)
테스트 21 〉	통과 (0.06ms, 33.4MB)
테스트 22 〉	통과 (0.08ms, 33.4MB)
테스트 23 〉	통과 (0.06ms, 33.4MB)
테스트 24 〉	통과 (0.18ms, 33.4MB)
테스트 25 〉	통과 (0.12ms, 33.4MB)
