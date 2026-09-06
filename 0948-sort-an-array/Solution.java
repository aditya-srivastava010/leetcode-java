class Solution {
    public static void conquer(int arr[], int st, int mid, int en){
        int merge[] = new int[en-st+1];
        int idx1 = st;
        int idx2 = mid+1;
        int mi = 0;
        while(idx1<=mid && idx2<=en){
            if(arr[idx1]<=arr[idx2]){
                merge[mi]=arr[idx1];
                idx1++;
            }
            else{
                merge[mi]=arr[idx2];
                idx2++;
            }
            mi++;
        }
        while(idx1<=mid){
            merge[mi]=arr[idx1];
            mi++;
            idx1++;
        }
        while(idx2<=en){
            merge[mi]=arr[idx2];
            mi++;
            idx2++;
        }
        int j=st;
        for(int i=0;i<merge.length;i++){
            arr[j]=merge[i];
            j++;
        }
    }
    public static void divide(int arr[], int st, int en){
        if(st>=en){
            return;
        }
        int mid = st+(en-st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,en);

        conquer(arr,st,mid,en);
    }

    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
}