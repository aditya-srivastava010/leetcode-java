class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int st = 0;
        int end = n - 1;
        char ans = letters[0];
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                end = mid - 1;
            } 
            else {
                st = mid + 1;
            }
        }

        return ans;
    }
}