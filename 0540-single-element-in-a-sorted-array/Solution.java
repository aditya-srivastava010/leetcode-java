class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            // mid ko even index par le aao
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair correct hai → single element right side mein hai
            if (nums[mid] == nums[mid + 1]) {
                st = mid + 2;
            } 
            else {
                // Pair break ho raha hai → answer left side mein hai
                end = mid;
            }
        }

        return nums[st];
    }
}