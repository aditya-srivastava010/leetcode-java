class Solution {

    public static boolean istime(int[] dist, double minhour, int speed) {
        double time = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            time += Math.ceil((double) dist[i] / speed);
        }
        time += (double) dist[dist.length - 1] / speed;

        // if (time <= minhour) {
        //     return true;
        // }
        // return false;
        return time<= minhour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {

        int st = 1;
        int end = 10_000_000;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (istime(dist, hour, mid)) {
                ans = mid;
                end = mid - 1; // minimum speed chahiye
            } else {
                st = mid + 1; // speed badhao
            }
        }

        return ans;
    }
}