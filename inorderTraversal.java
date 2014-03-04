/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (root == null) return result;
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode p = root;
        while (!myStack.empty() || p != null) {
            if (p != null) {
                myStack.push(p);
                p = p.left;
            } else {
                TreeNode node = myStack.pop();
                result.add(node.val);
                p = node.right;
            }
        }
        return result;
    }
}