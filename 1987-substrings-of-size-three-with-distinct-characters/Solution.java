class Solution {

    public static boolean goodString(int arr[]) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public int countGoodSubstrings(String s) {
        int n = s.length();
        int freq[] = new int[26];

        int i = 0;
        int count = 0;

        for (int j = 0; j < n; j++) {

            char ch = s.charAt(j);
            freq[ch - 'a']++;

            if (j - i + 1 == 3) {

                if (goodString(freq)) {
                    count++;
                }

    
                freq[s.charAt(i) - 'a']--;
                i++;
            }
        }

        return count;
    }
}
