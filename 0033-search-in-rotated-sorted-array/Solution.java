class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int n=nums.length;
        int end=n-1;
        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[left]){
                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(target<=nums[right] && target>nums[mid]){
                    left=mid+1;
                    
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}