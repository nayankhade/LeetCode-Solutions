
//Definition for singly-linked list.
class ListNode_Cycle {
    int val;
    ListNode next;

    ListNode_Cycle(int x) {
        val = x;
        next = null;
    }
}

public class LinkedList_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast== null || fast.next == null) {
                return false;
            }
                slow = slow.next;
                fast = fast.next.next;
        }
        return true;
    }

}