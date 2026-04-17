class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] temp : prerequisites){
            graph.get(temp[1]).add(temp[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(st, visited, graph, i, path)){
                    return new int[]{};
                }
            }
        }
        int[] ans = new int[numCourses];
        int i=0;
        while(!st.isEmpty() && i<numCourses){
            ans[i++] = st.pop();
            
        }

        return ans;
    }
    public boolean dfs(Stack<Integer> st, boolean[] visited, List<List<Integer>> graph, int node, boolean[] path){
        visited[node] = true;
        path[node] = true;

        for(int nei: graph.get(node)){
            if(!visited[nei]){
                if(dfs(st, visited, graph, nei, path)){
                    return true;
                }
            }else if(path[nei]){
                return true;
            }
        }

        path[node] = false;
        st.push(node);
        return false;
    }
}