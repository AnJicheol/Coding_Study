function solution(sizes) {
    var max = 0;
    var min = 0;
    
    for(var i=0; i<sizes.length; i++){    
        for(var j=0; j<sizes[i].length; j++){
            if(max < sizes[i][j]){
                max = sizes[i][j]
            }
        }
    }
    var a = 0;
    for(var i=0; i<sizes.length; i++){
        if(sizes[i][0]>=sizes[i][1]) min = sizes[i][1]
        if(sizes[i][0]<=sizes[i][1]) min = sizes[i][0]
        if(a < min) a = min
    }
    
    return a*max;
}


테스트 1 〉	통과 (0.05ms, 33.4MB)
테스트 2 〉	통과 (0.05ms, 33.5MB)
테스트 3 〉	통과 (0.05ms, 33.4MB)
테스트 4 〉	통과 (0.05ms, 33.4MB)
테스트 5 〉	통과 (0.23ms, 33.4MB)
테스트 6 〉	통과 (0.23ms, 33.4MB)
테스트 7 〉	통과 (0.14ms, 33.6MB)
테스트 8 〉	통과 (0.13ms, 33.4MB)
테스트 9 〉	통과 (0.24ms, 33.5MB)
테스트 10 〉	통과 (0.17ms, 33.4MB)
테스트 11 〉	통과 (0.30ms, 33.5MB)
테스트 12 〉	통과 (0.30ms, 33.4MB)
테스트 13 〉	통과 (0.57ms, 33.8MB)
테스트 14 〉	통과 (0.59ms, 33.7MB)
테스트 15 〉	통과 (0.74ms, 33.9MB)
테스트 16 〉	통과 (2.91ms, 37.4MB)
테스트 17 〉	통과 (3.88ms, 37.8MB)
테스트 18 〉	통과 (4.02ms, 38.3MB)
테스트 19 〉	통과 (3.76ms, 38.8MB)
테스트 20 〉	통과 (5.91ms, 38.8MB)
