class Solution {
    public String solution(String s, int n) {
		String answer = "";

		StringBuilder sb = new StringBuilder(s.length());
		final int alphabetSize = 25 + 1;
		final char empty = ' ';

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == empty) {
				sb.append(empty);
				continue;
			}

			char plusChar = (char) (c + n);

			boolean isAlphabetOverflow =
					(Character.isUpperCase(c) && plusChar > 'Z')
					|| (Character.isLowerCase(c) && plusChar > 'z');


			if (isAlphabetOverflow) {
				plusChar = (char) (plusChar - alphabetSize);
			}

			sb.append(plusChar);
		}

		answer = sb.toString();

		return answer;
	}
}