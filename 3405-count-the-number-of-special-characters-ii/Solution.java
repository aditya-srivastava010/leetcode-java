class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> lower = new HashMap<>();
        HashMap<Character, Integer> upper = new HashMap<>();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                lower.put(ch, i);
            }
            else {
                char small = Character.toLowerCase(ch);
                if(!upper.containsKey(small)) {
                    upper.put(small, i);
                }
            }
        }
        int count = 0;
        for(char ch : lower.keySet()) {
            if(upper.containsKey(ch)) {
                if(lower.get(ch) < upper.get(ch)) {
                    count++;
                }
            }
        }

    return count;
    }
}