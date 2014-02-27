/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        ArrayList<TreeLinkNode> curList = new ArrayList<TreeLinkNode>();
        curList.add(root);
        while (!curList.isEmpty()) {
            ArrayList<TreeLinkNode> nextList = new ArrayList<TreeLinkNode>();
            for (TreeLinkNode tmp : curList) {
                if (tmp.left != null) { 
                    nextList.add(tmp.left);
                    nextList.add(tmp.right);
                }
            }
            for (int i=0; i<curList.size()-1; i++) {
                curList.get(i).next = curList.get(i+1);
            }
            curList = nextList;
        }
    }
}