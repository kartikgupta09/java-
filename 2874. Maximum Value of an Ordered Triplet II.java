class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        
        
        long curprefix = nums[0];
        for(int i=0;i<n;i+=1){
            curprefix = Math.max(curprefix, nums[i]);
            prefix[i] = curprefix;
        }
        long cursuffix = nums[n-1];
        for(int i=n-1;i>=0;i--){
            cursuffix = Math.max(cursuffix, nums[i]);
            suffix[i] = cursuffix;
        }
        long ans = 0;
        
        for(int j=1;j<n-1;j++){
            long temp = (prefix[j-1] - nums[j]) * suffix[j+1];
            ans = Math.max(ans, temp);
        }
        
        return ans;
    }
}
