import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
		String answer = "";

		String[] split = s.split("");
		Arrays.sort(split, Collections.reverseOrder());

		StringBuilder sb = new StringBuilder(split.length);

		for (String str : split) {
			sb.append(str);
		}

		answer = sb.toString();

		return answer;
    }
}