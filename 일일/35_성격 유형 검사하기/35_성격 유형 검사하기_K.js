function solution(survey, choices) {
    var answer = '';
    var name_list = ['R','T','C','F','J','M','A','N'] // 이름
    var score_list = [0,0,0,0,0,0,0,0,] // 이름 마다 점수
    var name = ""
    
    for(var i=0; i<choices.length; i++){
        // 점수 별로 누가 높은지 확인
        if(choices[i]>4) name = survey[i].charAt(1)
        if(choices[i]<4) name = survey[i].charAt(0)
        if(choices[i]==4) continue  
        // 이름 찾아서 점수 증가
        for(var j=0; j<name_list.length; j++){
            if(name == name_list[j]){
                score_list [j] += Math.abs(4-choices[i])
                break
            }
        }
    }
    
    for(var i=0; i<name_list.length; i+=2){
        if(score_list [i] < score_list [i+1]) answer += name_list[i+1]
        if(score_list [i] > score_list [i+1])  answer += name_list[i]
        if(score_list [i] == score_list [i+1]) answer += name_list[i]
    } 
    return answer;
}


테스트 1 〉	통과 (0.07ms, 33.4MB)
테스트 2 〉	통과 (0.10ms, 33.4MB)
테스트 3 〉	통과 (0.08ms, 33.4MB)
테스트 4 〉	통과 (0.24ms, 33.4MB)
테스트 5 〉	통과 (0.09ms, 33.4MB)
테스트 6 〉	통과 (0.23ms, 33.4MB)
테스트 7 〉	통과 (0.22ms, 33.4MB)
테스트 8 〉	통과 (0.19ms, 33.5MB)
테스트 9 〉	통과 (0.19ms, 33.5MB)
테스트 10 〉	통과 (0.20ms, 33.5MB)
테스트 11 〉	통과 (0.19ms, 33.4MB)
테스트 12 〉	통과 (0.25ms, 33.4MB)
테스트 13 〉	통과 (0.30ms, 33.4MB)
테스트 14 〉	통과 (0.37ms, 33.5MB)
테스트 15 〉	통과 (0.39ms, 33.5MB)
테스트 16 〉	통과 (0.41ms, 33.4MB)
테스트 17 〉	통과 (0.41ms, 33.6MB)
테스트 18 〉	통과 (0.42ms, 33.4MB)
테스트 19 〉	통과 (0.42ms, 33.4MB)
테스트 20 〉	통과 (0.42ms, 33.4MB)
