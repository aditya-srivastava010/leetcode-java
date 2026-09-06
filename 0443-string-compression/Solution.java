class Solution {
    public int compress(char[] chars) {
        int ri=0;
        int wi=0;
        while(ri<chars.length){
            char cur=chars[ri];
            int count =0;
            while(ri<chars.length&&cur==chars[ri]){
                ri++;
                count++;
            }
            chars[wi]=cur;
            wi++;
            if(count>1){
                String cstr=String.valueOf(count);
                for(char digit: cstr.toCharArray()){
                    chars[wi]=digit;
                    wi++;
                }
            }
        }
        return wi;
    }
}