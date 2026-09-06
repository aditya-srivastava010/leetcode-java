class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int k=0;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[k]=nums[i];
                k++;
            }
        }
        return ans;
    }
}