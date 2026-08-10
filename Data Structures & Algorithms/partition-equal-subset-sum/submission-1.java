class Solution {
    
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }
        memo = new Boolean[n][sum / 2 + 1];

        return dfs(nums, 0, sum / 2);
    }


    // whenever we have to make a choice consider doing the recursion
    // DP is the memoized version of the recursion in general where we are breaking the problem into the smaller parts

    public boolean dfs(int[] nums, int i, int target) {
        if (i == nums.length) {
            return target == 0;
        }

        if (target < 0) {
            return false;
        }

        if (memo[i][target] != null) {
            return memo[i][target];
        }
        
        memo[i][target] = dfs(nums, i + 1, target) || dfs(nums, i + 1, target - nums[i]);

        return memo[i][target];
    }
}
