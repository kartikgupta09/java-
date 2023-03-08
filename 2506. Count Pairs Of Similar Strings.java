class Solution {
    public int similarPairs(String[] words) {
        HashSet<Character> set1,set2;
        int n = words.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            
            set1 = new HashSet<>();
            for(char ch:words[i].toCharArray()){
                set1.add(ch);
            }
            for(int j=i+1;j<n;j++){
                
                set2 = new HashSet<>(); 
                for(char ch:words[j].toCharArray()){
                    set2.add(ch);
                }
                if(set1.equals(set2)){
                    count++;
                }
            }
        }
        return count;
    }
}
