class Solution {
    public int minMoves(int[] nums) {
       
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }
        for(int i:nums){
            ans+=(max-i);
        }
        return ans;
    }
}