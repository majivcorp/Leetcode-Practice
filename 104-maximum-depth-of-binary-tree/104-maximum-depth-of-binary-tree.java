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
    public int maxDepth(TreeNode root) {
        //1. We initialize a stack with the root node and a depth of 1.
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> depths = new LinkedList<>();
        if (root == null) return 0;

        stack.add(root);
        depths.add(1);
        //2. We initialize a depth variable to keep track of the maximum depth.
        int depth = 0, current_depth = 0; //3. We initialize a current_depth variable to keep track of the current depth.

        //4. We loop while the stack is not empty.
        while(!stack.isEmpty()) {
          root = stack.pollLast(); //5. We pop the last element from the stack and store it in root.
          current_depth = depths.pollLast(); //6. We pop the last element from the depths list and store it in current_depth.
            //7. If root is not null, we update the depth variable with the maximum depth.
            if (root != null) {
            //8. We add the left and right children of root to the stack and depths list.
            depth = Math.max(depth, current_depth);
            stack.add(root.left);
            stack.add(root.right);
            depths.add(current_depth + 1);
            depths.add(current_depth + 1);
          }
        }
        return depth; //9. We return the depth variable.
    }
};
