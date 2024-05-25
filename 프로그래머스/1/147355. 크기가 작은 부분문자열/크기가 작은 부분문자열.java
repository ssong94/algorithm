class Solution {
    public int solution(String t, String p) {
		int answer = 0;

		var pLength = p.length();
		var pNumber = Long.parseLong(p);

		for (int i = 0; i <= t.length() - pLength; i++) {
			String str = t.substring(i, i + pLength);

			var tNumber = Long.parseLong(str);

			if (tNumber <= pNumber) {
				answer++;
			}

		}

		return answer;
    }
}