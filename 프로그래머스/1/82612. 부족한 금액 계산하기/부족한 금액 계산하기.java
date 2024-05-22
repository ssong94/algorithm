class Solution {
    public long solution(int price, int money, int count) {
		long answer = -1;

		long increasedPrice = 0;

		for (long i = 1; i <= count; i++) {
			increasedPrice += (price * i);
		}

		if (money >= increasedPrice) {
			return 0;
		}

		answer = increasedPrice - money;

		return answer;
    }
}