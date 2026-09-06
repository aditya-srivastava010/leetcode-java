class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int n=word.length();
        for(char ch='a';ch <='z';ch++){
            if (word.contains(ch + "") &&
                word.contains(Character.toUpperCase(ch) + "")) {
                count++;
            }
        }
        return count;
        }
    }
