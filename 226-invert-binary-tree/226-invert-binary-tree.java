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
//Approach 2: Recursive
class Solution {
    public TreeNode invertTree(TreeNode root) {
        //1. If the root is null, return null.
        if (root == null) {
            return null;
        }
    
        TreeNode right = invertTree(root.right);////2. Recursively invert the left subtree.
        TreeNode left = invertTree(root.left); //3. Recursively invert the right subtree.
        //4. Swap the left and right subtrees.
        root.left = right;
        root.right = left;
        return root;
    }
}