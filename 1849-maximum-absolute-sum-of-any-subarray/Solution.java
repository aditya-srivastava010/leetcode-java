class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = 0;

            sum += nums[i];
            max = Math.max(max, sum);
        }
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0)
                sum = 0;

            sum += nums[i];
            min = Math.min(min, sum);
        }
       return Math.max(max, Math.abs(min));
    }
}