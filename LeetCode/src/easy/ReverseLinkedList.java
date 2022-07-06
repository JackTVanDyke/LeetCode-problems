package easy;

public class ReverseLinkedList {
    int val;
    ReverseLinkedList next;
    ReverseLinkedList() {}
    ReverseLinkedList(int val) { this.val = val; }
    ReverseLinkedList(int val, ReverseLinkedList next) { this.val = val; this.next = next; }

    public static void main(String[] args) {

    }

    public static ReverseLinkedList reverseList(ReverseLinkedList head) {
        ReverseLinkedList p = null;
        ReverseLinkedList q = null;
        ReverseLinkedList r = head;
        while (r != null) {
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        return q;
    }
}
