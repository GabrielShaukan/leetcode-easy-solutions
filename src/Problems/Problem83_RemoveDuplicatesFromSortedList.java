package Problems;

import Utils.ListNode;

public class Problem83_RemoveDuplicatesFromSortedList {

    public ListNode solution(ListNode head) {
        ListNode list = new ListNode(0);
        ListNode pointer = list;

        //compare first node with second node
        //if first node and second node is different then add it to the original list
        //dont add from the front(will never work), add from the back
        //example of adding from the front is adding the node to the list first than comparing than ignoring
        //it just doesnt work like that

        while(head != null) {
            pointer.next = head;
            System.out.println(head.val);
            System.out.println(pointer.val);
            if(head.next == null) {
                break;
            }
            if(head.val == head.next.val ) {
                head = head.next;
                System.out.println(head);
            }  else {
                head = head.next;
                pointer = pointer.next;
            }

        }
        return list.next;
    }

}
