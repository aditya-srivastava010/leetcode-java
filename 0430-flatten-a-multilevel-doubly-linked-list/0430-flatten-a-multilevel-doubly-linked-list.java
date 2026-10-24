class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node p1 = head;
        while (p1 != null) {
            if (p1.child == null) {
                p1 = p1.next;
            } else {
                
                Node temp = p1.child;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = p1.next;
                if (p1.next != null) {
                    p1.next.prev = temp;
                }
                p1.next = p1.child;
                p1.child.prev = p1;
                p1.child = null;
            }
        }
        return head;
    }
}