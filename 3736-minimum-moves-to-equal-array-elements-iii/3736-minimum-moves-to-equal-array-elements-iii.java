class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int max=nums[nums.length-1];
        for(int i:nums){
            ans+=(max-i);
        }
        return ans;
    }
}