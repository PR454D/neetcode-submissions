/**
 * Definition for a binary tree cur.
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
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode cur, Integer min, Integer max) {
        if (cur == null) return true;
        if ((min != null && cur.val <= min) || (max != null && cur.val >= max)) return false;
        return dfs(cur.left, min, cur.val) && dfs(cur.right, cur.val, max);
    }
}
