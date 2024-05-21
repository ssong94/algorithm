class Solution {
    public String solution(String phone_number) {
		String answer = "";

		int length = phone_number.length();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			if (i < length - 4) {
				sb.append("*");
			} else {
				char c = phone_number.charAt(i);
				sb.append(c);
			}
		}

		answer = sb.toString();

		return answer;
    }
}