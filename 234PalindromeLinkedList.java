/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode first = head;
        ListNode last = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            last = last.next;
        }

        last = reversed(last);
        first = head;

        while (last != null) {
            if (first.val != last.val) {
                return false;
            }
            first = first.next;
            last = last.next;

        }
        return true;
    }

    public ListNode reversed(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}