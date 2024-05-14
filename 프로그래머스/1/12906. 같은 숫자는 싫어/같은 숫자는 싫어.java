import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
		Deque<Integer> queue = new LinkedList<>();

		for(int i=0; i< arr.length; i++) {

			Integer prev = queue.peekLast();

			if(prev != null && prev == arr[i]) {
				continue;
			}

			queue.add(arr[i]);

		}

		int size = queue.size();
		answer = new int[size];

		for (int i=0; i < size; i++) {
			answer[i] = queue.poll();
		}


        return answer;
    }
}