class Solution {
    public long solution(long n) {
        long answer = 0;
        
        		String[] arr = String.valueOf(n).split("");
		StringBuilder sb = new StringBuilder();

		sortToDesc(arr);
		for (String s : arr) {
			sb.append(s);
		}

		answer = Long.parseLong(sb.toString());
        
        return answer;
    }
    
	private void sortToDesc(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int compareValue = Integer.parseInt(arr[j]);

				if (Integer.parseInt(arr[i]) < compareValue) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}