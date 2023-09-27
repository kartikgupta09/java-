class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s.length()==1) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }else{
                int temp = i - map.get(ch);
                ans = Math.max(ans, temp-1);
            }
        }
        if(map.size() == s.length()){
            return -1;
        }
        return ans;
    }
}
