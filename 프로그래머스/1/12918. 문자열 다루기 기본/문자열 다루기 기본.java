class Solution {
    public boolean solution(String s) {
		boolean answer = true;

		int length = s.length();

		if (length != 4 && length != 6) {
			return false;
		}

		for (int i = 0; i < length; i++) {
			int number = s.charAt(i);

			if (number <= 47 || number >= 58) {
				return false;
			}
		}

		return answer;
	}
}