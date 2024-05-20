class Solution {
    public int solution(int num) {
		int answer = 0;

		long value = num;

		while (value != 1) {
			value = value % 2 == 0
					? value / 2
					: (value * 3) + 1;

			answer++;

			if (answer >= 500) {
				answer = -1;
				break;
			}
		}

		return answer;
    }
}