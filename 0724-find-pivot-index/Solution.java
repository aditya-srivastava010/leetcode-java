class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        // int leftarr[]=new int[n];
        // int rightarr[]=new int[n];
        // leftarr[0]=nums[0];
        // for(int i=1;i<n;i++){
        //     leftarr[i]=leftarr[i-1]+nums[i];
        // }
        // rightarr[n-1]=nums[n-1];
        // for(int i=n-2;i>=0;i--){
        //     rightarr[i]=rightarr[i+1]+nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     if(leftarr[i]==rightarr[i]){
        //         return i;
        //     }
        // }
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightsum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rightsum -= nums[i]; 
            if (leftsum == rightsum) {
                return i; 
            }
            leftsum += nums[i]; 
        }
        return -1; 
    }
}