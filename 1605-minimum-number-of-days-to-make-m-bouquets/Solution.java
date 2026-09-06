class Solution {

    public int[] findrange(int bloomDay[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : bloomDay) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return new int[]{min, max};
    }

    public boolean ispossible(int minday, int k, int m, int bloomDay[]) {

        int count = 0;
        int total = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= minday) {
                count++;
            } else {
                count = 0;
            }

            if (count == k) {
                total++;
                count = 0;
            }

            if (total >= m) {
                return true;
            }
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int range[] = findrange(bloomDay);

        int st = range[0];
        int end = range[1];
        int ans = -1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (ispossible(mid, k, m, bloomDay)) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                st = mid + 1;
            }
        }

        return ans;
    }
}