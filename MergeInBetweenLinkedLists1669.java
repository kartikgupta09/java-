class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode midstart = null;
        ListNode midlast = null;
        int idx = 0;
        while(temp!=null){
            if(idx == a-1) midstart = temp;
            else if(idx==b+1) midlast = temp;
            temp = temp.next;
            idx++;
        }
        midstart.next = list2;
        ListNode tail = gettail(list2);
        tail.next = midlast;
        return list1;
    }
    public ListNode gettail(ListNode t){
        ListNode tt = t;
        while(tt.next!=null){
            tt = tt.next;
        }
        return tt;
    }
}