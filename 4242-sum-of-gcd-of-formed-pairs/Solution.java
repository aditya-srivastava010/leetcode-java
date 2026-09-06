class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;

        int[] prefixGcd = new int[n];

        int max = 0;

        // Step 1: prefixGcd banana
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            prefixGcd[i] = gcd(nums[i], max);
        }

        // Step 2: sort
        Arrays.sort(prefixGcd);

        // Step 3: smallest-largest pair
        long ans = 0;

        for (int i = 0; i < n / 2; i++) {
            ans += gcd(prefixGcd[i], prefixGcd[n - i - 1]);
        }

        return ans;
    }

    // Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}