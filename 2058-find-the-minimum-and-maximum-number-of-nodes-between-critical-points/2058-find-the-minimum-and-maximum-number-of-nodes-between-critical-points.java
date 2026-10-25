class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1, last = -1;
        int mind = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;

        while (curr != null && curr.next != null) {
            boolean isCritical =
                (curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val);

            if (isCritical) {
                if (first == -1) {
                    first = i;
                } else {
                    mind = Math.min(mind, i - last);
                }
                last = i;
            }

            prev = curr;
            curr = curr.next;
            i++;
        }

        if (first == last) { // zero or one critical point
            return new int[]{-1, -1};
        }
        return new int[]{mind, last - first};
    }
}