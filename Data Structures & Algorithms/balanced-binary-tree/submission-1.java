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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }
    public int dfs(TreeNode curr){
        if(curr==null)return 0;
        int left=dfs(curr.left);
        int right=dfs(curr.right);

        int diff=Math.abs(left-right);
        if(diff>1)flag=false;
        return(1+Math.max(left,right));
    }
}
