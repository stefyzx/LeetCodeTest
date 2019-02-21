package LinkedList;

/**
 * Created by STEFY on 10/01/2019.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp;
        ListNode current = head;


        if (head == null || head.next == null) return head;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;

    }
}
