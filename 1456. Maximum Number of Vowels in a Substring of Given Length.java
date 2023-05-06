class Solution {
    public int maxVowels(String s, int k) {
        int l=0,r=0,res=0,window=0;

        for(;r<k;r++){
            window += isvowel(s.charAt(r));
        }
        res = window;
        while(r<s.length()){
            window -= isvowel(s.charAt(l++));
            window += isvowel(s.charAt(r++));
            res = Math.max(res,window);
        }
        return res;
    }
    private int isvowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u' ) ? 1:0;
    }
}
