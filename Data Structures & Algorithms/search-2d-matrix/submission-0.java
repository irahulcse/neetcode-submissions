class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // [0][0]
        //[1][0]

        int startrow = 0;
        int lastrow = matrix.length - 1;
        int rightrow = -1;

        while (startrow <= lastrow) {
            int mid = startrow + (lastrow - startrow) / 2;

            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]) {
                rightrow = mid;
                break;
            } else if (target < matrix[mid][0]) {
                lastrow = mid - 1;
            } else {
                startrow = mid + 1;
            }
        }

        if (rightrow == -1) {
            return false;
        }

        int startMyRow = 0;
        int endMyRow = matrix[0].length - 1;

        while (startMyRow <= endMyRow) {
            int mid = startMyRow + (endMyRow - startMyRow) / 2;

            if (matrix[rightrow][mid] == target) {
                return true;
            } else if (matrix[rightrow][mid] < target) {
                startMyRow = mid + 1;
            } else {
                endMyRow = mid - 1;
            }
        }
        return false;
    }
}
