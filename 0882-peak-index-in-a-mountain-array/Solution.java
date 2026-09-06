class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int end=arr.length-1;
        int st=0;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}