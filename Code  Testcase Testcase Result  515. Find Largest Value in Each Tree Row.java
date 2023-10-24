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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        if(root.left==null && root.right==null){
            ans.add(root.val);
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        List<List<Integer>> list = new ArrayList<>();
        while(!q.isEmpty()){
            int ran = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i=0;i<ran;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                temp.add(q.peek().val);
                q.poll();
            }
            list.add(temp);
        }
        for(int i=0;i<list.size();i++){
            List<Integer> ll = list.get(i);
            Collections.sort(ll);
            int n = ll.size()-1;
            ans.add(ll.get(n));
        }
        return ans;
    }
}
