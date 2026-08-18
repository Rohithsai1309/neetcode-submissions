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
    int max;
    public int maxDepth(TreeNode root) {
        max=0;
        count(root,max+1);
    return max;
    }
    public void count(TreeNode root,int count){
        if(root==null){
            return;
        }
        max=Math.max(count,max);
        if(root.left!=null)count(root.left,count+1);
        if(root.right!=null)count(root.right,count+1);
    }
}
