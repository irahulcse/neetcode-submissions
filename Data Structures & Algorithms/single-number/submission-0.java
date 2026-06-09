class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> rahul = new HashMap<>();

        for (int num : nums) {
            rahul.put(num, rahul.getOrDefault(num, 0) + 1);
        }


        for (int num : nums) {
            if (rahul.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
