import java.util.Map;

class Solution {
    public int solution(String s) {
		int answer = 0;

		StringBuilder convertWord = new StringBuilder();

		Map<String, Integer> mappingWord = Map.of(
				"zero", 0,
				"one", 1,
				"two", 2,
				"three", 3,
				"four", 4,
				"five", 5,
				"six", 6,
				"seven", 7,
				"eight", 8,
				"nine", 9
		);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 48 && c <= 57) {
				convertWord.append(c);
				continue;
			}

			sb.append(c);

			String word = sb.toString();

			if (mappingWord.containsKey(word)) {
				int mappingNumber = mappingWord.get(word);
				convertWord.append(mappingNumber);
				sb.setLength(0);
			}

		}

		answer = Integer.parseInt(convertWord.toString());

		return answer;
	}
}