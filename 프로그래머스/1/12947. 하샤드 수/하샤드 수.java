class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
		int sum = 0;

		String[] split = String.valueOf(x).split("");

		for (String s : split) {
			int i = Integer.parseInt(s);
			sum += i;
		}

		answer = x % sum == 0 ? true : false;        
              
        return answer;
    }
}