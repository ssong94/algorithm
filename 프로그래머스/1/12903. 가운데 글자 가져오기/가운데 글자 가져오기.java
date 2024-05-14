class Solution {
    public String solution(String s) {
        String answer = "";
        
		String[] strs = s.split("");
		int half = s.length() / 2;

		boolean isEvenNumber = s.length() % 2 == 0;
		if(isEvenNumber) {
			answer = strs[half - 1] + strs[half];
		} else {
			answer = strs[half];
		}
        
        return answer;
    }
}