/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
   public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode head1 = p;
        TreeNode head2 = q;

        if (head1 == null && head2 == null) {
            return true;
        }

        if (head1 != null && head2 != null && head1.val == head2.val) {
            return isSameTree(head1.left, head2.left) && isSameTree(head1.right, head2.right);
        } else {
            return false;
        }
    }
}
