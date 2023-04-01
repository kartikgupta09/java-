class Solution {
    public void sortColors(int[] nums) {
---FIRST---
    //     int[] arr = new int[3];
    //     for(int i=0;i<nums.length;i++){
    //         arr[nums[i]] += 1;
    //     }
    //     int temp=0;
    //     for(int key:arr){
    //         for(int i=0;i<key;i++){
    //             nums[i]=temp;
    //         }
    //         temp+=1;
    //     }
    //    return ;
---SECOND---
 TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int count=0;
        for(int key:map.keySet()){
            for(int i=0;i<map.get(key);i++){
                a[count]=key;
                count++;
            }        
        }
        return ;

--- THIRD---
    int n = nums.length;
    int low = 0;
    int high = n-1;
    int mid = 0;
    while(mid<=high){
        if(nums[mid]==0){
            swap(low,mid,nums);
            
            mid++;
            low++;
        }else if(nums[mid]==1){
            mid++;
        }else{
            swap(mid,high,nums);
            high--;
        }
    }
    return;
    }
    public void swap(int i, int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return ;
    }


}
