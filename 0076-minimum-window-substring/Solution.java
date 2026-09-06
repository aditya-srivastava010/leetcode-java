class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int unique = freq.size();
        int ws = 0;
        int we = 0;
        int st = -1;
        int minl = Integer.MAX_VALUE;
        int n = s.length();
        while(we < n){
            char ch = s.charAt(we);
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) - 1);

                if(freq.get(ch) == 0){
                    unique--;
                }
            }
            while(unique == 0){
                int len = we - ws + 1;
                if(len < minl){
                    minl = len;
                    st = ws;
                }
                char leftChar = s.charAt(ws);
                if(freq.containsKey(leftChar)){
                    freq.put(leftChar, freq.get(leftChar) + 1);

                    if(freq.get(leftChar) > 0){
                        unique++;
                    }
                }
                ws++;
            }
            we++;
        }
        return st == -1 ? "" : s.substring(st, st + minl);
    }
}