class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
		int answer = 123456789;

		answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			int value = absolutes[i];
			boolean isPositive = signs[i];

			if (isPositive) {
				answer += value;
			} else {
				answer -= value;
			}
		}

		return answer;
    }
}