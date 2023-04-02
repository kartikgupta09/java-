class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),vals[i]);
        }
        int[] ans = new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                ans[i]=map.get(curr);
            }
            else{
                ans[i]=curr - 'a' +1;
            }
        }
        int max  = 0;
        int curr = 0;
        for(int i=0;i<ans.length;i++){
            curr+=ans[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
               return max;
        
    }
}
