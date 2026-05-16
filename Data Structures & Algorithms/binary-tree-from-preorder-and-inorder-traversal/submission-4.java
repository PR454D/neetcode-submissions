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
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            index.put(inorder[i], i);
        }
        preIndex = 0;
        return dfs(0, inorder.length - 1, preorder, index);
    }

    private TreeNode dfs(int l, int r, int[] preorder, Map<Integer, Integer> index) {
        if (l > r) {
            return null;
        }
        int rootVal = preorder[preIndex];
        preIndex++;
        TreeNode root = new TreeNode(rootVal);
        int mid = index.get(rootVal);
        root.left = dfs(l, mid - 1, preorder, index);
        root.right = dfs(mid + 1, r, preorder, index);

        return root;
    }
}
