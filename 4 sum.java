class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long tsum = nums[i];
                    tsum +=nums[j];
                    tsum+=nums[k];
                    tsum+=nums[l];
                    if(tsum==target){
                        List<Integer> curr = new ArrayList<>();
                        curr.add(nums[i]);
                        curr.add(nums[j]);
                        curr.add(nums[k]);
                        curr.add(nums[l]);
                        if(!ans.contains(curr)){
                            ans.add(curr);
                        }
                        k++;
                        l--;
                        if(l<k && nums[k]==nums[k-1]) k++;

                        if(l<k && nums[l]==nums[l+1]) l--;
                    }else if(tsum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}
