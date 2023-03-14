class Solution{
    public int workDone(int n, int a[], int cap){
        // Code Here. 
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        int ans =0;
        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
                ans++;
                q.add(a[i]);
                if(q.size()>cap){
                    set.remove(q.element());
                    q.remove();
                }
                set.add(a[i]);
            }
        }
        return ans;
    }
}
