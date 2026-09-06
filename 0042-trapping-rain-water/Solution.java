class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int lm=0;
        int rm=0;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            if(height[l]>lm){
                lm=Math.max(lm,height[l]);
            }
            if(height[r]>rm){
                rm=Math.max(rm,height[r]);
            }
            if(lm<rm){
                ans=ans+lm-height[l];
                l++;
            }
            else{
                  ans=ans+rm-height[r];
                r--;
            }
        }
        return ans;
    }
}