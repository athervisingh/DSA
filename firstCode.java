import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the needed number

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return indices
            }

            map.put(nums[i], i); // Store the current number and its index
        }
        return new int[] { -1, -1 }; // If no pair is found
    }
}
