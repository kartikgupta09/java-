
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node curr=loop(head);
        if(curr==null) return;
        Node temp=curr;
        while(temp.next!=curr){
            temp=temp.next;
        }
        temp.next=null;
        return;
    }
    static Node loop(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            slow=slow.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
