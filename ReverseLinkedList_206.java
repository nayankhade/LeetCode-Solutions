
class List_Node {
    int val;
    List_Node next;

    List_Node() {
    }

    List_Node(int val) {
        this.val = val;
    }

    List_Node(int val, List_Node next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList_206 {
    public List_Node reverseList(List_Node head) {
        List_Node prev = null;
        while (head != null) {
            List_Node next_Node = head.next;
            head.next = prev;
            prev = head;
            head = next_Node;
        }
        return prev;
    }
}