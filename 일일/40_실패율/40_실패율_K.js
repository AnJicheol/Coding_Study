function solution(N, stages) {
    var answer = [];
    let failure_rate = []; // 실패율 담을 배열
    var total = stages.length; // 남은 인원들

    for(var i=1; i<=N; i++){
        var count = 0
        for(var j=0; j<stages.length; j++){ // 실패율 확인
            if(i == stages[j]) count++
        }
        failure_rate[i-1] = count/total
        total -= count
        if(count == 0) failure_rate[i-1] = 0 // 남은 인원이 0이 되면 NaN이 들어가게 됨
    }

    for(var i=0; i<failure_rate.length; i++){ // 정렬
        var max = 0
        for(var j=0; j<failure_rate.length; j++){
            if(failure_rate[max] < failure_rate[j]) max = j
        }
        failure_rate[max] = -1
        answer[i] = max+1
    }
    return answer;
}



테스트 1 〉	통과 (0.15ms, 33.5MB)
테스트 2 〉	통과 (0.41ms, 33.6MB)
테스트 3 〉	통과 (7.66ms, 37.4MB)
테스트 4 〉	통과 (28.51ms, 38.7MB)
테스트 5 〉	통과 (69.11ms, 40.7MB)
테스트 6 〉	통과 (4.67ms, 36.9MB)
테스트 7 〉	통과 (5.52ms, 37.2MB)
테스트 8 〉	통과 (24.27ms, 38.8MB)
테스트 9 〉	통과 (67.05ms, 40.9MB)
테스트 10 〉	통과 (15.27ms, 38.4MB)
테스트 11 〉	통과 (25.04ms, 38.7MB)
테스트 12 〉	통과 (22.16ms, 39.3MB)
테스트 13 〉	통과 (32.84ms, 39.7MB)
테스트 14 〉	통과 (0.20ms, 33.4MB)
테스트 15 〉	통과 (5.59ms, 37.4MB)
테스트 16 〉	통과 (5.18ms, 37.9MB)
테스트 17 〉	통과 (6.26ms, 37.4MB)
테스트 18 〉	통과 (5.03ms, 37.9MB)
테스트 19 〉	통과 (2.63ms, 36.8MB)
테스트 20 〉	통과 (5.50ms, 38.3MB)
테스트 21 〉	통과 (6.55ms, 37.7MB)
테스트 22 〉	통과 (66.65ms, 40.7MB)
테스트 23 〉	통과 (10.98ms, 39.4MB)
테스트 24 〉	통과 (12.75ms, 39.7MB)
테스트 25 〉	통과 (0.06ms, 33.4MB)
테스트 26 〉	통과 (0.06ms, 33.4MB)
테스트 27 〉	통과 (0.06ms, 33.5MB)
