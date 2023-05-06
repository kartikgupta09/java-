class Solution {
    public String interpret(String s) {
        String ans  ="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i<=n-1 && s.substring(i,i+1).equals("G")){
                ans += "G";
            }else if(i<=n-2 && s.substring(i,i+2).equals("()")){
                ans += "o";
            }else if(i<=n-4 && s.substring(i,i+4).equals("(al)")){
                ans += "al";
            }
        }
        return ans;
    }
}
