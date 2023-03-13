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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        helper(list,"",root);
        return list;
    }
    public void helper(List<String> list, String s , TreeNode root){
        s+=root.val;
        if(root.left ==null && root.right==null){
            list.add(s);
        }
        if(root.left!=null){
            helper(list,s+"->",root.left);
        }
        if(root.right!=null){
            helper(list,s+"->",root.right);
        }
    }
}
