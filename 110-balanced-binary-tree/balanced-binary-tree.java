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
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) !=-1;


    }
    private int dfsHeight (TreeNode node){
        if( node == null) return 0;

        int llen = dfsHeight(node.left);
        if(llen ==-1) return -1;

        int rlen = dfsHeight(node.right);
        if(rlen ==-1) return -1;

        if(Math.abs(llen -rlen)>1){
            return -1;
        }

        return 1+ Math.max(llen, rlen);

    }
}