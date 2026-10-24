class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (len < k) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < k; i++) {   
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        ListNode rechead = reverseKGroup(curr, k);
        head.next = rechead;
        return prev;
    }
}