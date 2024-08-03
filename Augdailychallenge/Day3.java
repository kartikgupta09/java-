class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int n = target.length;
        for(int i=0;i<n;i++){
            if(!map1.containsKey(target[i])){
                map1.put(target[i], 1);
            }else{
                int k = map1.get(target[i]);
                map1.put(target[i], k+1);
            }
             if(!map2.containsKey(arr[i])){
                map2.put(arr[i], 1);
            }else{
                int k = map2.get(arr[i]);
                map2.put(arr[i], k+1);
            }
        }
        return map1.equals(map2);
    }
}