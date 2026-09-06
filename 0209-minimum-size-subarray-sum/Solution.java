class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum >= target) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                }

                currSum -= nums[left];
                left++;
            }
        }

        if (min != Integer.MAX_VALUE) {
            return min;
        } else {
            return 0;
        }
    }
}