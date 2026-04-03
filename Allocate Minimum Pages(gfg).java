class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        int min = max(arr);
        int max = sum(arr);
        int ans = 0;
        if(n<k) return -1;
        
        while(min<=max){
            int mid = (min+max)/2;
            
            if(isvalid(arr, mid, k)){
                max = mid -1;
                ans = mid;
            }else{
                min = mid +1;
            }
        }
        
        return ans;
        
        
    }
    public boolean isvalid(int[] arr, int range, int k){
        int sum = 0;
        int stu = 1;
        
        for(int i=0;i<arr.length;i++){
            if(sum + arr[i] > range){
                stu ++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }
        
        return stu<=k;
    }
    public int max(int[] arr){
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            ans = Math.max(ans, arr[i]);
        }
        
        return ans;
    }
    public int sum(int[] arr){
        int ans = 0;
        
        for(int i=0;i<arr.length;i++){
            ans += arr[i];
        }
        return ans;
    }
}