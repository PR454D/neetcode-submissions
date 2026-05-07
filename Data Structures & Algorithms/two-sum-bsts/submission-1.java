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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Set<Integer> seen = new HashSet<>();
        collect(root1, seen);
        return search(root2, target, seen);
    }

    private void collect(TreeNode curr, Set<Integer> seen) {
        if (curr == null) {
            return;
        }
        seen.add(curr.val);
        collect(curr.left, seen);
        collect(curr.right, seen);
    }

    private boolean search(TreeNode curr, Integer target, Set<Integer> seen) {
        if (curr == null) {
            return false;
        }
        int compliment = target - curr.val;
        if (seen.contains(compliment)) {
            return true;
        }
        return search(curr.left, target, seen) || search(curr.right, target, seen);
    }

}
