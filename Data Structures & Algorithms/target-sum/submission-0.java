class Solution {
     public int findTargetSumWays(int[] nums, int target) {
        return backTrack(0, 0, nums, target);
    }

    private int backTrack(int i, int total, int[] nums, int target) {
        if (i == nums.length) {
            return total == target ? 1 : 0;
        }
        return backTrack(i + 1, total + nums[i], nums, target) + backTrack(i + 1, total - nums[i], nums, target);
    }
}
