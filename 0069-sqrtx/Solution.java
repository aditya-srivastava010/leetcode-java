class Solution {
    public int mySqrt(int x) {
        int st=1;
        int end=x;
        int ans=-1;
        if(x==0){
            return 0;
        }
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mid==(x/mid)){
                return mid;
            }
            else if(mid>(x/mid)){
                end=mid-1;
            }
            else{
                ans=mid;
                st=mid+1;
            }
        }
        return ans;
    }
}