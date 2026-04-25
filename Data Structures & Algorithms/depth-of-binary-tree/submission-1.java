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
        return max(root,0);
    }
    public int max(TreeNode root,int curr){
        if(root==null)return 0;
        int left=max(root.left,curr+1);
        int right=max(root.right,curr+1);
        return 1+Math.max(left,right);
    }
}
