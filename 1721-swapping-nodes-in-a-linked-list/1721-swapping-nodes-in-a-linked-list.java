class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        ListNode first = head;
        ListNode sec = head;

        for (int i = 1; i < k; i++) {        
            first = first.next;
        }
        for (int i = 1; i <= len - k; i++) { 
            sec = sec.next;
        }

        int t = first.val;
        first.val = sec.val;
        sec.val = t;
        return head;
    }
}