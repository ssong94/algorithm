class Solution {
    public int solution(int[] number) {
		int answer = 0;

		for (int i =0; i < number.length; i++) {
			for (int l = i +1; l < number.length; l++) {
				for (int j = l + 1; j < number.length; j++) {
					int sum = number[i] + number[l] + number[j];
					if(sum == 0) {
						answer ++;
					}
				}
			}
		}

		return answer;
    }
}