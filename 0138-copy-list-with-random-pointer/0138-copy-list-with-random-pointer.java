class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: har node ke baad uski clone daalo
        Node temp = head;
        while (temp != null) {
            Node clone = new Node(temp.val);
            clone.next = temp.next;
            temp.next = clone;
            temp = clone.next;
        }

        // Step 2: random pointers set karo
        temp = head;
        while (temp != null) {
            Node old = temp;
            Node newn = temp.next;
            if (old.random != null) {
                newn.random = old.random.next;
            }
            temp = newn.next;
        }

        // Step 3: dono lists alag karo
        temp = head;
        Node ansHead = head.next;
        while (temp != null) {
            Node clone = temp.next;
            Node old = temp;
            old.next = clone.next;
            if (clone.next != null) {
                clone.next = clone.next.next;
            }
            temp = temp.next;
        }

        return ansHead;   
    }
}