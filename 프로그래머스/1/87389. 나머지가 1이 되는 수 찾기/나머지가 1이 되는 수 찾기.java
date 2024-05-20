class Solution {
    public int solution(int n) {
        int answer = 0;
        
		int max = 1_000_000;

		for (int i = 1; i <= max; i++) {
			if (n % i == 1) {
				return i;
			}
		}
        
        return answer;
    }
}