class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    public static int upperBound(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static int lowerBound(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}