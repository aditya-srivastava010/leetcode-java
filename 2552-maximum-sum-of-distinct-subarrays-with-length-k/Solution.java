class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int left = 0;
        long csum = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {

            while (set.contains(nums[right])) {
                csum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[right]);     
            csum += nums[right];       

            if (right - left + 1 > k) {
                set.remove(nums[left]);
                csum -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {
                ans = Math.max(ans, csum);
            }
        }

        return ans;
    }
}