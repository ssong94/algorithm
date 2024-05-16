class Solution {
    public long solution(long n) {
        long answer = 0;
        
		for (long i = 1; i <= n; i++) {
			long square = i * i;

			if (square == n) {
				long value = (i + 1);
				answer = value * value;
				break;
			} else if (square > n) {
				return -1;
			}
		}
        
        return answer;
    }
}