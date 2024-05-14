import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
		int previousNumber = -1;
		Queue<Integer> queue = new LinkedList<>();

		for(int i=0; i< arr.length; i++) {

			if(previousNumber == arr[i]) {
				continue;
			}

			previousNumber = arr[i];
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