function solution(today, terms, privacies) {
    var answer = [];
    var index = 0;
    var today_year = today.substr(0,4) // 오늘의 해

    for(var i=0; i<privacies.length; i++){
        var privacies_year = privacies[i].substr(0,4) // 수집일자 해
        var privacies_month = privacies[i].substr(5, 2) // 수집일자 월
        
        for(var j=0; j<terms.length; j++){
            if(privacies[i].charAt(privacies[i].length-1) == terms[j].charAt(0)) {
                var terms_month = terms[j].substr(2); // 유효기간 월
                var total_month = Number(privacies_month) + Number(terms_month) //  수집일자 달 + 유효기간 달 
                var today_month = today.substr(5,2) // 오늘의 달
                today_month = Number(today_month) + Number(12*(today_year - privacies_year)) 
              
                if(Number(today_month) > Number(total_month)){ // 오늘으 달이 더 클경우
                    answer[index] = i+1
                    index++
                }    
                
                if(Number(today_month) == Number(total_month)){ // 같을 경우
                    if(Number(today.substr(8)) >= Number(privacies[i].substr(8,2))){
                        answer[index] = i+1
                        index++
                    }
                }
                break
            }
        }    
    }
    
    return answer;
}


정확성  테스트
테스트 1 〉	통과 (0.08ms, 33.6MB)
테스트 2 〉	통과 (0.24ms, 33.5MB)
테스트 3 〉	통과 (0.09ms, 33.5MB)
테스트 4 〉	통과 (0.10ms, 33.5MB)
테스트 5 〉	통과 (0.10ms, 33.5MB)
테스트 6 〉	통과 (0.33ms, 33.5MB)
테스트 7 〉	통과 (0.21ms, 33.5MB)
테스트 8 〉	통과 (0.22ms, 33.5MB)
테스트 9 〉	통과 (0.27ms, 33.5MB)
테스트 10 〉	통과 (0.25ms, 33.5MB)
테스트 11 〉	통과 (0.25ms, 33.6MB)
테스트 12 〉	통과 (0.30ms, 33.5MB)
테스트 13 〉	통과 (0.29ms, 33.6MB)
테스트 14 〉	통과 (0.44ms, 33.6MB)
테스트 15 〉	통과 (0.28ms, 33.5MB)
테스트 16 〉	통과 (0.35ms, 33.5MB)
테스트 17 〉	통과 (0.33ms, 33.5MB)
테스트 18 〉	통과 (0.43ms, 33.6MB)
테스트 19 〉	통과 (0.42ms, 33.7MB)
테스트 20 〉	통과 (0.36ms, 33.6MB)
