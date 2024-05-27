class Solution {
    public int solution(int[][] sizes) {
		int answer = 0;

		int max = 0;
		int min = 0;

		for (int[] size : sizes) {
			int maxWidth = Math.max(size[0], size[1]);
			int minWidth = Math.min(size[0], size[1]);

			max = Math.max(max, maxWidth);
			min = Math.max(min, minWidth);
		}

		answer = max * min;

		return answer;
    }
}