

//Definition for singly-linked list.
class ListNode_Intersection {
    int val;
    ListNode_Intersection next;

    ListNode_Intersection(int x) {
        val = x;
        next = null;
    }
}


public class IntersectionofTwoLinkedLists_160 {
    public ListNode_Intersection getIntersectionNode(ListNode_Intersection headA, ListNode_Intersection headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode_Intersection a = headA;
        ListNode_Intersection b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return b;

    }
}