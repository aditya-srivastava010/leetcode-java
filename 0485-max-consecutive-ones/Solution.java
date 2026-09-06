class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int max = 0;
        int count = 0;

        while (i < n) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            max = Math.max(max, count);
            i++;
        }

        return max;
    }
}