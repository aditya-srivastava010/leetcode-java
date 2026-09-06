class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            int num=nums[i];
            while(num>0){
                int digit=num%10;
                sum = sum + digit;
                num = num / 10;
            }
            if(sum<min){
                min=sum;
            }
        }
    return min;
    }
}