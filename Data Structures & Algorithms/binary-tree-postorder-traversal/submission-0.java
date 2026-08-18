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
    public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list=new ArrayList<>();
        trav(list,root);
    return list;
    }
    public void trav(List<Integer> l,TreeNode root){
        if(root==null)return;
        
        trav(l,root.left);
        trav(l,root.right);
        l.add(root.val);
        
    }
}