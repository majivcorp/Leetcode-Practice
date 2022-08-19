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

/**
 * We can either traverse the tree either by Depth-First Search (DFS) strategy 
 * or Breadth-First Search (BFS) strategy.
*/

//Approach 1: Recursion - Recursive  Depth-First Search (DFS) strategy
class Solution {
    public int maxDepth(TreeNode root) {
        //1. First, we check if the root is None/null. If so, we return 0.
        if  (root == null) {
            return 0;
        }
        //2. If not, we recursively call the maxDepth function on root.left.
        else {
            int left_height = maxDepth(root.left);
            int right_height =maxDepth(root.right); //3. We do the same for root.right.
            //4. We return the larger height plus 1.
            return java.lang.Math.max(left_height, right_height) + 1; 
        }
    }
}


//Approach 2: Iteration - Iterative  Depth-First Search (DFS) strategy
/**
 * start from a stack which contains the root node
 * and the corresponding depth which is 1. 
 * proceed to the iterations: pop the current node out of the stack and push the child nodes.
 * The depth is updated at each step.
*/


/**

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

//Runtime: 4 ms, faster than 8.96% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 44.3 MB, less than 5.65% of Java online submissions for Maximum Depth of Binary Tree.

*/
