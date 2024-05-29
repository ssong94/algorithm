import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
		int[] answer = {};

		Set<Integer> sumNumbers = new TreeSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				sumNumbers.add(sum);
			}
		}

		answer = new int[sumNumbers.size()];

		int i = 0;
		for (Integer value : sumNumbers) {
			answer[i++] = value;
		}

		return answer;
	}
}