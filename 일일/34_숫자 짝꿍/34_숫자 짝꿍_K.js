function solution(X, Y) {
    var answer = '';
    var number = 0;
    
    for(var i=9; i>-1; i--){ 
        var x_count = X.split(i).length - 1;
        var y_count = Y.split(i).length - 1;
        
        if(x_count == 0) continue
        if(x_count <= y_count) number = x_count
        if(x_count > y_count) number = y_count
        
        for(var j=0; j<number; j++ ){
            answer += i
        }
    }
    
    if(answer.length == 0) return '-1'
    
    var zero_count = answer.split(0).length - 1;
    if(answer.length == zero_count) return '0'
        
    return answer;
}


테스트 1 〉	통과 (0.06ms, 33.5MB)
테스트 2 〉	통과 (0.09ms, 33.6MB)
테스트 3 〉	통과 (0.10ms, 33.5MB)
테스트 4 〉	통과 (0.07ms, 33.4MB)
테스트 5 〉	통과 (0.07ms, 33.6MB)
테스트 6 〉	통과 (0.37ms, 33.5MB)
테스트 7 〉	통과 (0.33ms, 33.6MB)
테스트 8 〉	통과 (0.26ms, 33.6MB)
테스트 9 〉	통과 (0.33ms, 33.5MB)
테스트 10 〉	통과 (0.22ms, 33.5MB)
테스트 11 〉	통과 (1376.43ms, 201MB)
테스트 12 〉	통과 (1441.45ms, 196MB)
테스트 13 〉	통과 (1454.99ms, 200MB)
테스트 14 〉	통과 (1310.51ms, 194MB)
테스트 15 〉	통과 (1282.29ms, 187MB)
테스트 16 〉	통과 (0.09ms, 33.5MB)
테스트 17 〉	통과 (0.09ms, 33.4MB)
테스트 18 〉	통과 (0.07ms, 33.5MB)
테스트 19 〉	통과 (0.06ms, 33.5MB)
