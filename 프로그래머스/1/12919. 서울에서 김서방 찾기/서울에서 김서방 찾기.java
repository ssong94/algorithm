class Solution {
    public String solution(String[] seoul) {
		String answer = "";

		String str = "김서방은 %d에 있다";
		String target = "Kim";

		int index = 0;

		for (String value : seoul) {
			if (target.equals(value)) {
				answer = String.format(str, index);
				break;
			}

			index++;
		}

		return answer;
    }
}