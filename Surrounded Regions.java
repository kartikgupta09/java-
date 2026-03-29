class Solution {
    public void dfs(char[][] board, int i, int j, int r, int c){
        
            if(i<0 || j<0 || i>=r || j>=c || board[i][j] != 'O') return;
            
            board[i][j] = '1';

            dfs(board, i+1, j, r, c);
            dfs(board, i-1, j, r, c);
            dfs(board, i, j+1, r, c);
            dfs(board, i, j-1, r, c);
        
    }
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        for(int i=0;i<c;i++){
            dfs(board, 0, i, r, c);
            dfs(board, r-1, i, r, c);
        }

        for(int i=0;i<r;i++){
            dfs(board, i, 0, r, c);
            dfs(board, i, c-1, r, c);
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] =='1'){
                    board[i][j] = 'O';
                }
            }
        }
        return ;
    }
}