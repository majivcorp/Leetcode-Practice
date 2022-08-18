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
//Approach 1: Iterative
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) 
        {
            return null;
        }
        //1. We create a queue and add the root node to it.
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        //2. We loop while the queue is not empty.
        while (!queue.isEmpty()) {
            //3. We poll the queue and store the current node in a temporary variable.
            TreeNode current = queue.poll();
            //4. We swap the left and right child nodes.
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            //5. We add the left and right child nodes to the queue if they are not null.
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return root;
    }
}