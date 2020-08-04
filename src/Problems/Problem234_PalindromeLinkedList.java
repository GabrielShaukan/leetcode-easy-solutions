package Problems;

import Utils.ListNode;

public class Problem234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next!=null)  {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        fast = head;
        while (slow!= null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
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
