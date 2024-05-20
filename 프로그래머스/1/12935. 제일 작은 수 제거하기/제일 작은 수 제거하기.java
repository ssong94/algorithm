class Solution {
    public int[] solution(int[] arr) {
		int[] answer = {};

		if (arr.length <= 1) {
			return new int[]{-1};
		}

		answer = new int[arr.length - 1];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}

		int index = 0;
		for (int i : arr) {
			if (i != min) {
				answer[index++] = i;
			}
		}

		return answer;
    }
}