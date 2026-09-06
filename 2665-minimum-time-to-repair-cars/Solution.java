class Solution {

    public boolean isreparied(long mintime, int ranks[], int carstoberep) {

        long carsrepaired = 0;

        for (int rank : ranks) {

            carsrepaired += (long) Math.sqrt((1.0 * mintime) / rank);

            if (carsrepaired >= carstoberep) {
                return true;
            }
        }

        return false;
    }

    public long repairCars(int[] ranks, int cars) {

        long minRank = Long.MAX_VALUE;
        long maxRank = Long.MIN_VALUE;

        for (int i : ranks) {
            minRank = Math.min(minRank, i);
            maxRank = Math.max(maxRank, i);
        }

        long st = 1;
        long end = maxRank * (long) cars * cars;

        long ans = 0;

        while (st <= end) {

            long mid = st + (end - st) / 2;

            if (isreparied(mid, ranks, cars)) {

                ans = mid;
                end = mid - 1;

            } else {

                st = mid + 1;
            }
        }

        return ans;
    }
}