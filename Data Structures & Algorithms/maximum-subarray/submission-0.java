class Solution {
     public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxsum = Math.max(maxsum, currentSum);
            }
        }
        return maxsum;
    }
}
