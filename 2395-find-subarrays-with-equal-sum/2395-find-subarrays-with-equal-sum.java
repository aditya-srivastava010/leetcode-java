class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];

            if (map.containsKey(sum)) {
                return true;
            }
            map.put(sum, 1);
        }
        return false;
    }
}