class Solution {
    public String[] solution(String[] strings, int n) {
		String[] answer = {};

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {

				String str = strings[i];
				char charAt = str.charAt(n);

				String nextStr = strings[j];
				char compareCharAt = nextStr.charAt(n);

				if (charAt > compareCharAt) {
					strings[i] = nextStr;
					strings[j] = str;
				}
			}
		}

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {

				String str = strings[i];
				char charAt = str.charAt(n);

				String nextStr = strings[j];
				char compareCharAt = nextStr.charAt(n);

				boolean isSameAlphabet = charAt == compareCharAt;

				if (isSameAlphabet) {
					boolean isWordGreater = str.compareTo(nextStr) > 0;
					if (isWordGreater) {
						strings[i] = nextStr;
						strings[j] = str;
					}
				}
			}
		}

		answer = strings;

		return answer;
	}
}