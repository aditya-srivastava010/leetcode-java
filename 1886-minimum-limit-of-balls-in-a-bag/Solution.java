class Solution {

    public  boolean ispossible(int nums[], int maxballs, int maxopr) {

        int opr = 0;

        for (int num : nums) {

            if (num > maxballs) {

                int bags = (int) Math.ceil(num / (double) maxballs);

                opr += bags - 1;
            }

            if (opr > maxopr) {
                return false;
            }
        }

        return true;
    }

    public int minimumSize(int[] nums, int maxOperations) {

        int st = 1;
        int end = 0;
        int res = 0;

        for (int i : nums) {
            end = Math.max(i, end);
        }

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (ispossible(nums, mid, maxOperations)) {

                res = mid;
                end = mid - 1;

            } else {

                st = mid + 1;
            }
        }

        return res;
    }
}