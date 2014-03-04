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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (root == null) return result;
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        
        myStack.push(root);
        while(!myStack.isEmpty()) {
            TreeNode node = myStack.pop();
            result.add(node.val);
            if (node.right != null) 
              myStack.push(node.right);
            if (node.left != null)
              myStack.push(node.left);
        }
        
        return result;
    }
}