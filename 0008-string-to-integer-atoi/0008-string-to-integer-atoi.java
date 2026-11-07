class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if(n == 0) return 0;
        int sign = 1;
        int i = 0;
        long num = 0;
        if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+') {
            i++;
        }
        while(i < n) {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch)) {
                break;
            }
            num = num * 10 + (ch - '0');
            if(num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(num * sign);
    }
}