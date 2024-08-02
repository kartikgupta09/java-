class Solution {
    public int minSwaps(int[] nums) {

        int onecount = 0, zerocount=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==0) zerocount++;
            if(nums[i]==1) onecount++;
        }
        if(onecount==0) return 0;
        int ans = Integer.MAX_VALUE;
        int i=0,j=0;
        int one = 0;
        int n = nums.length;

        while(j<2*n){

            if(nums[j%n]==1) one++;
            if((j-i+1) == onecount){
                ans = Math.min(ans, onecount-one);
                if(nums[i%n]==1){
                    one--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}