class Solution {
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();

    public void parent_map(TreeNode root, TreeNode par){
        if(root == null) return;

        parent.put(root, par);

        parent_map(root.left, root);
        parent_map(root.right, root);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parent_map(root, null);

        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(target);
        visited.add(target);

        while(!q.isEmpty() && k > 0){
            int size = q.size();
            k--;

            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();

                if(curr.left != null && !visited.contains(curr.left)){
                    visited.add(curr.left);
                    q.add(curr.left);
                }

                if(curr.right != null && !visited.contains(curr.right)){
                    visited.add(curr.right);
                    q.add(curr.right);
                }

                TreeNode par = parent.get(curr);
                if(par != null && !visited.contains(par)){
                    visited.add(par);
                    q.add(par);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }

        return ans;
    }
}