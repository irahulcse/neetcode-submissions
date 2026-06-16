class Solution {
     public int lastStoneWeight(int[] stones) {
        int size = stones.length;

        while (size > 1) {
            Arrays.sort(stones, 0, size);
            int y = stones[size - 1];
            int x = stones[size - 2];

            size--;
            if (y != x) {
                stones[size - 1] = y - x;
            } else {
                size--;
            }
        }
        return size == 0 ? 0 : stones[0];
    }
}
