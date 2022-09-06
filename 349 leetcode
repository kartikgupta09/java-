# java-
# 349
leet code 

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> Set = new HashSet<Integer>();
      for(int i: nums1){
        Set.add(i);
      }
      HashSet<Integer> inter = new HashSet<Integer>();
      for(int i: nums2){
        if(Set.contains(i)){
          inter.add(i);
        }
      }
      int[] result = new int[inter.size()];
      int point = 0;
      for(int i: inter){
        result[point++] = i;
      }
      return result;
    }
}
