class Solution {
    public int[] solution(String s) {
		int[] answer = {};

		answer = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int duplicateChar = -1;

			for (int j = i - 1; j >= 0; j--) {
				char prevChar = s.charAt(j);
				if (prevChar == c) {
					duplicateChar = i - j;
					break;
				}
			}

			answer[i] = duplicateChar;
		}

		return answer;
    }
}