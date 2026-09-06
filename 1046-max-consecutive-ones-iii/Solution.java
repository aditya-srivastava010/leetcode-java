class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int zeroc = 0;
        int max = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                zeroc++;
            }
            while (zeroc > k) {
                if (nums[i] == 0) {
                    zeroc--;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}