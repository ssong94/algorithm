class Solution {
    public String solution(String s) {
		String answer = "";

		final int convertASCIINumber = 32;
		final int spaceASCII = 32;
		final int lowercaseASCII = 94;

		StringBuilder sb = new StringBuilder();

		int wordIndex = 0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			boolean isEven = (wordIndex) % 2 == 0;

			if (c == spaceASCII) {
				sb.append(' ');
				wordIndex = 0;
				continue;
			}

			boolean isUppercase = c < lowercaseASCII;
			boolean isLowercase = c >= lowercaseASCII;

			char uppercase = (char) (c - convertASCIINumber);
			char lowercase = (char) (c + convertASCIINumber);

			char convertChar = c;
			if (isEven) {
				if (isLowercase) {
					convertChar = uppercase;
				}
			} else {
				if (isUppercase) {
					convertChar = lowercase;
				}
			}

			sb.append(convertChar);
			wordIndex++;
		}

		answer = sb.toString();

		return answer;
    }
}