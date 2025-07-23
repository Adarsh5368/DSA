public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each pair of elements
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair adds up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution found (but question guarantees one)
        return new int[] {};
    }
}
