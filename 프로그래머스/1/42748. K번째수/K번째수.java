import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};

		answer = new int[commands.length];
		int answerIndex = 0;

		for (int j = 0; j < commands.length; j++) {
			int start = commands[j][0];
			int end = commands[j][1];
			int target = commands[j][2] - 1;

			int arrayLength = end - start + 1;
			int[] splitArray = new int[arrayLength];

			int index = 0;
			for (int k = start - 1; k < end; k++) {
				int value = array[k];
				splitArray[index++] = value;
			}

			Arrays.sort(splitArray);
			int targetValue = splitArray[target];

			answer[answerIndex++] = targetValue;
		}

		return answer;
    }
}