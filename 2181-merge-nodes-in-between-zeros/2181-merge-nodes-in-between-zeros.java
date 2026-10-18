class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int sum = 0;

        ListNode temp = head.next;          // skip the leading 0
        while (temp != null) {
            if (temp.val == 0) {
                tail.next = new ListNode(sum);  // close the segment
                tail = tail.next;
                sum = 0;
            } else {
                sum += temp.val;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}