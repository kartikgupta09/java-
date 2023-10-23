class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k = n-1;
            while(j<k){
                long temp = arr[i]+arr[j]+arr[k];
                if(temp<sum){
                    count+=(k-j);
                    j++;
                }else{
                    k--;
                }
            }
        }
        return count;
    }
}
