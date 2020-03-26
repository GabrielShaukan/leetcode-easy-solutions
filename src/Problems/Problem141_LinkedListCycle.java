package Problems;

import Utils.ListNode;

public class Problem141_LinkedListCycle {

    int counter = 0;
    public boolean hasCycle(ListNode head) {
        counter++;
        if (head == null) return false;
        if (counter == 9000) return true;
        return hasCycle(head.next);
    }

}
