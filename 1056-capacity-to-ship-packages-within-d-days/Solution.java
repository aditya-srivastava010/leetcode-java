class Solution {

    public boolean ispossible(int[] weights, int mid, int days) {
        int day = 1;
        int ship_load = 0;

        for (int i = 0; i < weights.length; ) {

            if (ship_load + weights[i] <= mid) {
                ship_load += weights[i];
                i++;
            } 
            else {
                day++;
                ship_load = 0;
            }

            // deadline cross ho gaya
            if (day > days) {
                return false;
            }
        }

        return true;
    }

    public int shipWithinDays(int[] weights, int days) {

        int ans = 0;

        int total = 0;

        for (int i = 0; i < weights.length; i++) {
            total += weights[i];
        }

        int start = 1;
        int end = total;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // mid capacity possible hai?
            if (ispossible(weights, mid, days)) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}