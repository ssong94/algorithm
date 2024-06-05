class Solution {
    public String solution(int[] food) {
		String answer = "";
		final int water = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < food.length; i++) {
			int count = food[i];
			int division = count / 2;

			String stringCount = String.valueOf(i);
			String repeat = stringCount.repeat(division);

			sb.append(repeat);
		}

		answer = sb.toString() + water + sb.reverse();

		return answer;
	}
}