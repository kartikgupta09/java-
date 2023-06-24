class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prev = prevsmaller(heights, n);
        int[] next = nextsmaller(heights, n);
        int ans =  Integer.MIN_VALUE;
        for(int i=0;i<n;i+=1){
            if(next[i] == -1){
                next[i] = n;
            }
            int bread = next[i] - prev[i] -1;
            int area = bread * heights[i];
            ans = Math.max(ans, area);
        }
        return ans;

    }
    // prev smaller index
    public int[] prevsmaller(int[] heights, int n){
        Stack<Integer> s = new Stack<>();
        int[] left = new int[n];
        for(int i=0;i<n;i+=1){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = s.peek();
            }
            s.push(i);
        }
        return left;
    }
// next smaller index
    public int[] nextsmaller(int[] heights, int n){
        Stack<Integer> s = new Stack<>();
        int[] right = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                right[i] = -1;
            }else{
                right[i] = s.peek();
            }
            s.push(i);
        }
        return right;
    }

}
