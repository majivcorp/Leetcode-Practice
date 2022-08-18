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

/*
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
//Runtime: 0 ms - Memory Usage: 39.7 MB
*/