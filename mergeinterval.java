

class Solution
{
    public int[][] overlappedInterval(int[][] mat)
    {
        // Code here // Code here
        if(mat.length<=1) return mat;
        Arrays.sort(mat, (a,b) -> Integer.compare(a[0],b[0]));
        
        Stack<int[]> s = new Stack<>();
        s.push(mat[0]);
        
        for(int i=1;i<mat.length;i++){
            
            int[] popped=s.pop();
            int popend=popped[1];
            
            
            int currend=mat[i][1];
            int currstart=mat[i][0];
            
            if(currstart<=popend){
                   int[] temp=new int[]{popped[0],Math.max(currend,popend)};
                   s.push(temp);
            }
            else{
                s.push(popped);
                s.push(mat[i]);
            }
        }
        
        int[][] ans =new int[s.size()][2];
        for(int i=ans.length-1;i>=0;i--){
            int[] pp = s.pop();
            ans[i][0]=pp[0];
            ans[i][1]=pp[1];
        }
        
        return ans;
    }
}
