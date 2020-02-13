package Problems;


import Utils.ListNode;

public class Problem21_MergeTwoSortedLists {

    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(0);
        ListNode last = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                last.next = l1;
                l1 = l1.next;
            } else {
                last.next = l2;
                l2 = l2.next;
            }
            //This is the most important step, makes it so that the next node is not overwritten
            last = last.next;
        }

        if (l1 == null) {
            last.next = l2;
        } else {
            last.next = l1;
        }
        return prehead.next;

    }

}
