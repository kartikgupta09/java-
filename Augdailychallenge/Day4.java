class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        List<Integer> ls = new ArrayList<>();

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                ls.add(sum);
            }
        }
        Collections.sort(ls);
        
        long ans = 0; 
        int mod = (int) 1e9 + 7;

        for(int i=left-1;i<right;i++){
            ans = (ans + ls.get(i)) % mod;
        }
        return (int) ans;
    }
}