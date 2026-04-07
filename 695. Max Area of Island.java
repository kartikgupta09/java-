class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    int curr = helper(i, j, n, m, grid);
                    ans = Math.max(ans, curr);
                }
            }
        }
        return ans;
    }
    public int helper(int i, int j, int n, int m, int[][] grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;

        int area = 1;

        area += helper(i+1, j, n, m, grid);
        area += helper(i-1, j, n, m, grid);
        area += helper(i, j+1, n, m, grid);
        area += helper(i, j-1, n, m, grid);

        return area;
    }
}
