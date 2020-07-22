package Problems;

import Utils.ListNode;

public class Problem203_RemovedLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode preHead = new ListNode();
        ListNode last = preHead;

        while (head != null) {
            if (head.val == val) {
                head = head.next;
                last.next = head;
            }else {
                last.next = head;
                head = head.next;
                last = last.next;
            }

        }
        return preHead.next;
    }

}
