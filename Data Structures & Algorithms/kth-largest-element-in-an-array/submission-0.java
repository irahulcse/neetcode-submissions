class Solution {
     public int findKthLargest(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        Collections.sort(arr);

        return arr.get(arr.size() - k);

    }
}
