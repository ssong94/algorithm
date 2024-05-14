import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
		int answer = 0;

		Set<Integer> pokemon = new HashSet<>();
		int MAX_COUNT = nums.length / 2;

		for(int i=0; i <= nums.length-1; i++) {
			pokemon.add(nums[i]);
			if(pokemon.size() == MAX_COUNT) {
				break;
			}

		}

		answer = pokemon.size();

		return answer;
    }
}