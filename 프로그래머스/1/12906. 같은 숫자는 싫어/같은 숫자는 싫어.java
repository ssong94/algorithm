import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
		Deque<Integer> queue = new ArrayDeque<>();

		for (int value : arr) {

			Integer prev = queue.peekLast();

			if (prev != null && prev == value) {
				continue;
			}

			queue.add(value);

		}

		answer = new int[queue.size()];

		int index = 0;
		while (!queue.isEmpty()) {
			answer[index++] = queue.poll();
		}


        return answer;
    }
}