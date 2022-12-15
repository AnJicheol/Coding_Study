function solution(arr)
{
    var answer = [];
    var index = 0;
    var test = 10;
    
    for(var i = 0; i<arr.length; i++){
        if(test != arr[i]){
            answer[index] = arr[i];
            test = arr[i]
            index++;
        }
        else continue;
    }
    return answer;
}


테스트 1 〉	통과 (0.06ms, 33.4MB)
테스트 2 〉	통과 (0.09ms, 33.6MB)
테스트 3 〉	통과 (0.07ms, 33.6MB)
테스트 4 〉	통과 (0.09ms, 33.5MB)
테스트 5 〉	통과 (0.10ms, 33.5MB)
테스트 6 〉	통과 (0.06ms, 33.4MB)
테스트 7 〉	통과 (0.09ms, 33.5MB)
테스트 8 〉	통과 (0.06ms, 33.5MB)
테스트 9 〉	통과 (0.09ms, 33.6MB)
테스트 10 〉	통과 (0.05ms, 33.6MB)
테스트 11 〉	통과 (0.06ms, 33.4MB)
테스트 12 〉	통과 (0.06ms, 33.5MB)
테스트 13 〉	통과 (0.05ms, 33.5MB)
테스트 14 〉	통과 (0.05ms, 33.5MB)
테스트 15 〉	통과 (0.05ms, 33.6MB)
테스트 16 〉	통과 (0.06ms, 33.6MB)
테스트 17 〉	통과 (0.04ms, 33.5MB)
효율성  테스트
테스트 1 〉	통과 (13.90ms, 83.2MB)
테스트 2 〉	통과 (14.53ms, 83.3MB)
테스트 3 〉	통과 (13.86ms, 83.3MB)
테스트 4 〉	통과 (14.56ms, 83.1MB)
