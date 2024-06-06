class Solution {
    public int solution(int a, int b, int n) {
		int answer = 0;

		final int requiredColaBottleCount = a;
		final int exchangedColaCount = b;
		int ownedColaBottleCount = n;

		while (ownedColaBottleCount >= requiredColaBottleCount) {
			answer += exchangedColaCount;
			ownedColaBottleCount += exchangedColaCount;
			ownedColaBottleCount -= requiredColaBottleCount;
		}

		return answer;
	}
}