// class Solution {
//     public boolean iseat(int nums[], int h, int minh) {
//         long hours = 0;
//         for (int num : nums) {
//             hours += (long) Math.ceil(num / (double) minh);
//             if (hours > h) {
//                 return false;
//             }
//         }
//         return true;
//    }
//     public int minEatingSpeed(int[] piles, int h) {
//         int st = 1;
//         int end = 0;
//         int ans = 0;
//         for (int pile : piles) {
//             end = Math.max(end, pile);
//         }
//         while (st <= end) {
//             int mid = st + (end - st) / 2;
//             if (iseat(piles, h, mid)) {
//                 ans = mid;
//                 end = mid - 1;
//             } 
//             else {
//                 st = mid + 1;
//             }
//         }
//         return ans;
//     }
// }

class Solution {

    public boolean ispossible(int[] piles, int mid, int h) {
        int hour = 0;

        for (int i = 0; i < piles.length; i++) {

            if (piles[i] <= mid) {
                hour++;
            }
            else if (piles[i] % mid == 0) {
                // piles is completely divisible by mid
                hour += piles[i] / mid;
            }
            else {
                // Extra hour needed for remaining bananas
                hour += (piles[i] / mid) + 1;
            }

            if (hour > h) {
                return false;
            }
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > maxi) {
                maxi = piles[i];
            }
        }

        int s = 1;
        int e = maxi;
        int ans = 0;

        while (s <= e) {

            // Assume Koko eats at 'mid' bananas/hour
            int mid = s + (e - s) / 2;

            if (ispossible(piles, mid, h)) {
                ans = mid;
                e = mid - 1;   // Try smaller speed
            }
            else {
                s = mid + 1;   // Need higher speed
            }
        }

        return ans;
    }
}