class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        int bs = n / k;
        int extra = n % k;
        ListNode curr = head;
        ListNode prev = null;
        int idx = 0;
        while (curr != null) {
            ans[idx++] = curr;
            int width = bs + (extra > 0 ? 1 : 0);
            extra--;
            for (int i = 0; i < width; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
        return ans;
    }
}