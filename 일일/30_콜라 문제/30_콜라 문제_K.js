function solution(a, b, n) {
    var answer = 0;

    while(n%a != n){
        answer += Math.floor(n/a)*b
        n = (Math.floor(n/a)*b) + Math.floor(n%a)  
    }       
    return answer;
}

테스트 1 〉	통과 (0.19ms, 33.5MB)
테스트 2 〉	통과 (0.04ms, 33.5MB)
테스트 3 〉	통과 (0.12ms, 33.5MB)
테스트 4 〉	통과 (0.05ms, 33.4MB)
테스트 5 〉	통과 (0.04ms, 33.4MB)
테스트 6 〉	통과 (0.06ms, 33.5MB)
테스트 7 〉	통과 (0.06ms, 33.5MB)
테스트 8 〉	통과 (0.06ms, 33.5MB)
테스트 9 〉	통과 (0.11ms, 33.4MB)
테스트 10 〉	통과 (0.04ms, 33.4MB)
테스트 11 〉	통과 (0.06ms, 33.5MB)
테스트 12 〉	통과 (0.64ms, 33.5MB)
테스트 13 〉	통과 (0.04ms, 33.5MB)
테스트 14 〉	통과 (0.06ms, 33.4MB)
