class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;
        ListNode mid = middle(head);
        ListNode newh = reverse(mid.next);
        mid.next = null;
        head = merge(head, newh);
        return ;

    }public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode node1, ListNode node2){
        if(node2==null) return node1;
        if(node1==null) return node2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(node1!=null || node2!=null){
            if(node1!=null){
                dummy.next = node1;
                dummy = dummy.next;
                node1 = node1.next;
            }
            if(node2!=null){
                dummy.next = node2;
                dummy = dummy.next;
                node2 = node2.next;
            }
        }
        return temp.next;
    }
}
