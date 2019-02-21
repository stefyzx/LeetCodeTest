package LinkedList;

/**
 * Created by STEFY on 10/01/2019.
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode1(ListNode head) {
        if (head == null) return null;

        int sizeOnce = 1;

        ListNode nextNode = head;
        while (nextNode.next != null) {
            sizeOnce++;
            nextNode = nextNode.next;
        }
        int sizeHalf = sizeOnce / 2;
        ListNode middle = head;
        for (int n = 0; n < sizeHalf; n++) {
            middle = middle.next;
        }
        return middle;
    }

    public ListNode middleNode2(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null){
            if (fast.next.next != null){
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
            slow = slow.next;
        }

        return slow;

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
