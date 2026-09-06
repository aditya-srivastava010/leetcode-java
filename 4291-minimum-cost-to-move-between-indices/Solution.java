class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] closest = new int[n];
        closest[0] = 1;
        closest[n - 1] = n - 2;
        for (int i = 1; i < n - 1; i++) {
            int left = nums[i] - nums[i - 1];
            int right = nums[i + 1] - nums[i];
            if (right < left) {
                closest[i] = i + 1;
            } else {
                closest[i] = i - 1;
            }
        }
        long[] pre = new long[n];
        for (int i = 1; i < n; i++) {
            long cost;
            if (closest[i - 1] == i) {
                cost = 1;
            } else {
                cost = nums[i] - nums[i - 1];
            }
            pre[i] = pre[i - 1] + cost;
        }
        long[] suf = new long[n];
        for (int i = n - 2; i >= 0; i--) {
            long cost;
            if (closest[i + 1] == i) {
                cost = 1;
            } else {
                cost = nums[i + 1] - nums[i];
            }
            suf[i] = suf[i + 1] + cost;
        }
        int[] ans = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int x = queries[k][0];
            int y = queries[k][1];
            if (x < y) {
                ans[k] = (int) (pre[y] - pre[x]);
            } else {
                ans[k] = (int) (suf[y] - suf[x]);
            }
        }
        return ans;
    }
}