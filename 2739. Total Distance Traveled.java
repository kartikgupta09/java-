class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0;
        while(mainTank>0){
            if(mainTank>=5){
                ans+=5;
                mainTank-=5;
                if(additionalTank>=1){
                    mainTank+=1;
                    additionalTank-=1;
                }
            }else{
                ans+=mainTank;
                mainTank=0;
            }
        }
        return ans*10;
    }
}
