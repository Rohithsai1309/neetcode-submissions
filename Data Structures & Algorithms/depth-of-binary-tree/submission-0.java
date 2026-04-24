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
     ArrayList<Integer> x=new ArrayList<>();
     maxDept(root,0,x);
    return Collections.max(x);
    }
    public TreeNode maxDept(TreeNode root,int depth,ArrayList x) {
        if(root==null){
            x.add(depth);
            return null;
        }
        maxDept(root.left,depth+1,x);
        maxDept(root.right,depth+1,x);
    return null;
    }
}
