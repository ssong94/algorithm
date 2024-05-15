import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
		int[] answer = {};

		List<Long> list = new ArrayList<>();

		while (n != 0) {
			var value = n % 10;
			list.add(value);
			n /= 10;
		}

		answer = new int[list.size()];

		int index = 0;
		for (Long value : list) {
			answer[index] = value.intValue();

			index++;
		}

		return answer;
    }
}