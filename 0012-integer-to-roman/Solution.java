class Solution {
    static final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static final String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        int i=0;
           StringBuilder sb = new StringBuilder();
        while(i<values.length){
            while(num>=values[i]){
                num-=values[i];
                sb.append(roman[i]);
            }
            i++;
        }
        return sb.toString();
    }
}