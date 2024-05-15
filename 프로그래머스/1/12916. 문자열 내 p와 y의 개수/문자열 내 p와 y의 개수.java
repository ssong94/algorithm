class Solution {
    boolean solution(String s) {
        boolean answer = true;

		int pCount = 0;
		int yCount = 0;

		s = s.toLowerCase();

		char p = 'p';
		char y = 'y';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == p) {
				pCount++;
			} else if (c == y) {
				yCount++;
			}
		}

		if (pCount != yCount) {
			return false;
		}
        
return answer;
    }
}