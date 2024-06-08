import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(int k, int[] score) {
		int[] answer = {};

		answer = new int[score.length];
		Queue<Integer> queue = new PriorityQueue<>(k);

		for (int i = 0; i < score.length; i++) {
			int currentValue = score[i];

			if (i < k) {
				queue.add(currentValue);
				answer[i] = queue.peek();
				continue;
			}

			Integer minValue = queue.peek();
			if (currentValue > minValue) {
				queue.remove();
				queue.add(currentValue);
				answer[i] = queue.peek();
			} else {
				answer[i] = minValue;
			}
		}

		return answer;
	}
}