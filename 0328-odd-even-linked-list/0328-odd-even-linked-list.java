class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddtail = head;
        ListNode evenhead = head.next;
        ListNode eventail = head.next;

        while (eventail != null && eventail.next != null) {
            oddtail.next = eventail.next;   // link odd to next odd
            oddtail = oddtail.next;         // advance odd

            eventail.next = oddtail.next;   // link even to next even
            eventail = eventail.next;       // advance even
        }

        oddtail.next = evenhead;            // attach even list after odd list
        return head;
    }
}