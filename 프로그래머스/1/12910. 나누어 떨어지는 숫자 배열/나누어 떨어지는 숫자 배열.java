import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		List<Integer> list = new ArrayList<>(arr.length);

		for (int value : arr) {
			if (value % divisor == 0) {
				list.add(value);
			}
		}

		if (list.isEmpty()) {
			return new int[]{-1};
		}

		answer = new int[list.size()];

		int index = 0;
		for (Integer i : list) {
			answer[index++] = i;
		}

		for (int i = 0; i < answer.length; i++) {
			for (int l = i + 1; l < answer.length; l++) {
				if (answer[i] > answer[l]) {
					int temp = answer[i];
					answer[i] = answer[l];
					answer[l] = temp;
				}
			}
		}

		return answer;
    }
}