class Solution {

    public boolean ispossible(int arr[], int hind) {

        int count = 0;

        for (int num : arr) {

            if (num >= hind) {
                count++;
            }

            if (count >= hind) {
                return true;
            }
        }

        return false;
    }

    public int hIndex(int[] citations) {

        int n = citations.length;

        int st = 0;
        int end = n;

        int ans = 0;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (ispossible(citations, mid)) {

                ans = mid;
                st = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return ans;
    }
}