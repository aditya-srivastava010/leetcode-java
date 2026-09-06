class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] starts = new int[n][2];
        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }
        Arrays.sort(starts, (a, b) -> a[0] - b[0]);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int idx = binarySearch(starts, end);
            res[i] = (idx < n) ? starts[idx][1] : -1;
        }
        return res;
    }
    private int binarySearch(int[][] starts, int target) {
        int lo = 0, hi = starts.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (starts[mid][0] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}