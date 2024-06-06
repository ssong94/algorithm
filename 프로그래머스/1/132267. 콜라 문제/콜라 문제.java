class Solution {
    public int solution(int a, int b, int n) {
		int answer = 0;

		while (n >= a) {
			int changedCola = n / a;
			int remainColaBottle = (n % a);

			answer += changedCola * b;

			n = remainColaBottle + (changedCola * b);
		}

		return answer;
	}
}