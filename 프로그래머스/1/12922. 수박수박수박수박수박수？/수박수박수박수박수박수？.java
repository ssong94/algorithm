class Solution {
    public String solution(int n) {
		String answer = "";

		String[] target = {"수", "박"};
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sb.append(target[0]);
			} else {
				sb.append(target[1]);
			}
		}

		answer = sb.toString();

		return answer;
    }
}