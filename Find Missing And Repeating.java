class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans =  new int[2];
        int[] nums = new int[n+1];
        for(int i=0;i<arr.length;i++){
            nums[arr[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[1]=i;
            }else if(nums[i]>1){
                ans[0]=i;
            }
        }
        return ans;
        
    }
}
