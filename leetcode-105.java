/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) return null;
        return createTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }
    
    public TreeNode createTree(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend) {
        if(prestart > preend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int inmid = -1;
        for(int i = instart; i<=inend; i++) {
            if (inorder[i] == preorder[prestart]) {
                inmid = i;
                break;
            }
        }
        int len = inmid - instart;
        root.left = createTree(preorder, inorder, prestart+1, prestart+len, instart, inmid-1);
        root.right = createTree(preorder, inorder, prestart+len+1, preend, inmid+1, inend);
        return root;
    }
}