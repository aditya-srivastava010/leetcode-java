class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
        }
        Arrays.sort(nums);
        long ans=0;
        for(int x:nums){
            ans+=x-min;
        }
        return (int) ans;
    }
}