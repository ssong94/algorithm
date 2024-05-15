class Solution {
    boolean solution(String s) {
        boolean answer = true;

		int pCount = 0;
		int yCount = 0;

		char p = 'p';
		char y = 'y';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.toLowerCase(c) == p) {
				pCount++;
			} else if (Character.toLowerCase(c) == y) {
				yCount++;
			}
		}

		if (pCount != yCount) {
			return false;
		}
        
return answer;
    }
}