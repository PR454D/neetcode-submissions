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
    private int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    private void dfs(TreeNode cur, int maxSoFar) {
        if (cur == null) return;
        int newMax = Math.max(cur.val, maxSoFar);
        if (cur.val >= newMax) count++;
        dfs(cur.left, newMax);
        dfs(cur.right, newMax);
    }
}
