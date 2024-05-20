class Solution {
    public int solution(int[] numbers) {
		int answer = -1;

		answer = 0;

		for (int i = 1; i <= 9; i++) {
			boolean exist = false;
			for (int number : numbers) {
				if (i == number) {
					exist = true;
					break;
				}
			}

			if (!exist) {
				answer += i;
			}
		}

		return answer;
    }
}