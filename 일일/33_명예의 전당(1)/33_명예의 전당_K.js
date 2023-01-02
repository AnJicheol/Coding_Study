function solution(k, score) {
    var answer = [];
    var arr = [];
    var max = k;
    
    if(k>score.length) max = score.length
    
    for(var i=0; i<max; i++){ // 명예의 전당이 다 차기전
        arr[k-1] = score[i] 
        arr.sort(function(a,b){ // 정렬
            return a-b
        })
        answer[i] = arr[0]
    }
    
    for(var i=k; i<score.length; i++){ // 명예의 전당이 다 찬후
        
        if(arr[0]<score[i]) arr[0] = score[i]
        arr.sort(function(a,b){ // 정렬
            return a-b
        })
        answer[i] = arr[0]
    }
    return answer;
}


테스트 1 〉	통과 (0.08ms, 33.4MB)
테스트 2 〉	통과 (0.11ms, 33.4MB)
테스트 3 〉	통과 (0.12ms, 33.4MB)
테스트 4 〉	통과 (0.10ms, 33.4MB)
테스트 5 〉	통과 (0.20ms, 33.4MB)
테스트 6 〉	통과 (0.08ms, 33.4MB)
테스트 7 〉	통과 (0.19ms, 33.4MB)
테스트 8 〉	통과 (0.28ms, 33.6MB)
테스트 9 〉	통과 (0.34ms, 33.5MB)
테스트 10 〉	통과 (0.27ms, 33.4MB)
테스트 11 〉	통과 (0.33ms, 33.5MB)
테스트 12 〉	통과 (4.62ms, 36.1MB)
테스트 13 〉	통과 (3.13ms, 36.1MB)
테스트 14 〉	통과 (3.23ms, 34.2MB)
테스트 15 〉	통과 (5.38ms, 36.4MB)
테스트 16 〉	통과 (7.31ms, 36.4MB)
테스트 17 〉	통과 (5.69ms, 36.5MB)
테스트 18 〉	통과 (6.22ms, 36.4MB)
테스트 19 〉	통과 (0.90ms, 34.5MB)
테스트 20 〉	통과 (0.87ms, 34.4MB)
테스트 21 〉	통과 (1.48ms, 34.4MB)
테스트 22 〉	통과 (1.46ms, 34.4MB)
테스트 23 〉	통과 (1.46ms, 34.5MB)
테스트 24 〉	통과 (1.06ms, 34.4MB)
테스트 25 〉	통과 (1.59ms, 34.5MB)
테스트 26 〉	통과 (0.08ms, 33.6MB)
