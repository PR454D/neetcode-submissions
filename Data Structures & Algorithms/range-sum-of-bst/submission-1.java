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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root, low, high);
    }

    private int dfs(TreeNode current, int low, int high) {
        if (current == null) return 0;
        int sum = 0;
        if (current.val >= low && current.val <= high) {
            sum += current.val;
        }
        sum += dfs(current.left, low, high);
        sum += dfs(current.right, low, high);
        return sum;
    } 
}