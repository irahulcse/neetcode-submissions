class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    sum *= nums[j];
                }
            }
            res.add(sum);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}  
