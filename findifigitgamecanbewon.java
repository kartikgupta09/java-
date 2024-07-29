class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0,s2=0;
        for( int key: nums){
            if(key<10){
                s1+=key;
            }else{
                s2+=key;
            }
        }
        if(s1==s2) return false;
        return true;
    }
}