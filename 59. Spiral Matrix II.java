class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int direction =0;
        int curr=1;
        int l=0,r=n-1;
        int t=0,b=n-1;
        while(l<=r && t<=b && curr<= n*n){
            if(direction==0){
                for(int i=l;i<=r;i++){
                    mat[t][i]=curr;
                    curr++;
                }
                t++;
                direction=1;
            }else if(direction==1){
                for(int i=t;i<=b;i++){
                    mat[i][r]=curr;
                    curr++;
                }
                r--;
                direction = 2;
            }else if(direction==2){
                for(int i=r;i>=l;i--){
                    mat[b][i]=curr;
                    curr++;
                }
                b--;
                direction=3;
            }else if(direction==3){
                for(int i=b;i>=t;i--){
                    mat[i][l] = curr;
                    curr++;
                }
                l++;
                direction=0;
            }
        }
        return mat;
    }
}
