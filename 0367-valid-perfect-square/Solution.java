class Solution {
    public boolean isPerfectSquare(int num) {
        long st = 1;
        long end = num;
        while (st <= end) {
            long mid = st + (end - st) / 2;
            long sq=mid*mid;
            if (sq == num) {
                return true;
            } else if (sq > num) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
}