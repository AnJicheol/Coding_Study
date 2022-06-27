public String solution(String[] participant, String[] completion) {
       String answer = "";

        HashSet<String> set = new HashSet();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < completion.length; i++) {
            set.add(completion[i]);
            if (set.contains(completion[i])) map.put(completion[i], map.getOrDefault(completion[i],0) + 1);
        }

        for (int i = 0; i < participant.length; i++) {
            if (!set.contains(participant[i])) {
                answer = participant[i];
                break;
            } else if (map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i]) - 1);
            }
        }

        if (answer.equals("")) {
            for (String key : map.keySet()) {
                if (map.get(key) != 0) return key;
            }
        }

        return answer;
    }

정확성  테스트
테스트 1 〉	통과 (0.05ms, 74.2MB)
테스트 2 〉	통과 (0.07ms, 78.6MB)
테스트 3 〉	통과 (0.40ms, 89.7MB)
테스트 4 〉	통과 (0.71ms, 74.5MB)
테스트 5 〉	통과 (0.86ms, 75.6MB)
효율성  테스트
테스트 1 〉	통과 (69.80ms, 86.1MB)
테스트 2 〉	통과 (88.15ms, 88.5MB)
테스트 3 〉	통과 (114.93ms, 97.5MB)
테스트 4 〉	통과 (89.67ms, 96.1MB)
테스트 5 〉	통과 (131.17ms, 97.4MB)
