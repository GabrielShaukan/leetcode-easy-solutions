package Problems;

import Utils.ListNode;

public class Problem206_ReverseLinkedList {


    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null) {
            ListNode nextnode = head.next;
            head.next = prev;
            prev = head;
            head = nextnode;
        }

        return prev;
    }

}
