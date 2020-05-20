package Problems;

import Utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Problem160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while (headA != null) {
            nodeSeen.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if (nodeSeen.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

}
