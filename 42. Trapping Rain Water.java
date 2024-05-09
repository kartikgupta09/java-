class Solution {
    public int trap(int[] height) {
        int[] left = helper1(height);
        int[] right = helper2(height);
        int ans =0;
        for(int i=0;i<height.length;i++){
            int tt = Math.min(left[i], right[i]) - height[i];
            ans+=tt;
        }
        return ans;

    }public int[] helper1(int[] height){
        int n = height.length;
        int[] temp = new int[n];
        temp[0] = height[0];
        for(int i=1;i<n;i++){
            temp[i] = Math.max(temp[i-1], height[i]);
        }
        return temp;
    }
    public int[] helper2(int[] height){
        int n= height.length;
        int[] temp = new int[n];
        temp[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            temp[i] = Math.max(temp[i+1], height[i]);
        }
        return temp;
    }
}
