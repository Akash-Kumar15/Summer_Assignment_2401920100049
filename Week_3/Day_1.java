// Linked List Cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}


// Reverse Linked List
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode newHead=reverseList(head.next);
       head.next.next=head;
       head.next=null;
       return newHead;
    }
    }


// Middle of the Linked List
class Solution {
    public ListNode middleNode(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
    }
}    
