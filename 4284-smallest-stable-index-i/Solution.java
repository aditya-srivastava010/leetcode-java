class Solution {

    static int mini(int arr[], int i, int n) {
        int min = arr[i];

        for (int j = i; j < n; j++) {
            min = Math.min(min, arr[j]);
        }

        return min;
    }

    public int firstStableIndex(int[] nums, int k) {
        int pref = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pref = Math.max(pref, nums[i]);

            int mini = mini(nums, i, nums.length);

            if (pref - mini <= k) {
                return i;
            }
        }

        return -1;
    }
}