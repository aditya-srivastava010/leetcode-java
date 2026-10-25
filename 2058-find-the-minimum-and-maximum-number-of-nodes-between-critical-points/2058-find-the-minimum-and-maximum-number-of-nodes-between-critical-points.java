class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> critical = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;
        while (curr != null && curr.next != null) {

            if (curr.val > prev.val && curr.val > curr.next.val) {
                critical.add(i);
            }

            if (curr.val < prev.val && curr.val < curr.next.val) {
                critical.add(i);
           }
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (critical.size() < 2) {
            return new int[]{-1, -1};
        }

        int mind = Integer.MAX_VALUE;

        for (int j = 1; j < critical.size(); j++) {
            mind = Math.min(mind, critical.get(j) - critical.get(j - 1));
        }
        int maxd = critical.get(critical.size() - 1) - critical.get(0);
        return new int[]{mind, maxd};
    }
}