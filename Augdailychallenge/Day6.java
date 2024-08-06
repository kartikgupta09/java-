class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), 1);
            }else{
                int key = map.get(word.charAt(i));
                map.put(word.charAt(i), key+1);
            }
        }
        List<Integer> ls = new ArrayList<>();
        for(char ch : map.keySet()){
            int kk = map.get(ch);
            ls.add(kk);
        }
        Collections.sort(ls);
        int n = ls.size();
        int count = 1;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            if(count<=8){
                int temp = ls.get(i)*1;
                ans += temp;
            }else if(count<=16){
                int temp = ls.get(i)*2;
                ans += temp;
            }else if( count<=24){
                int temp = ls.get(i)*3;
                ans += temp;
            }else{
                int temp = ls.get(i)*4;
                ans += temp;
            }
            count++;
        }
        return ans;
    }
}