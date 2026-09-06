class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totrow=matrix.length;
        int totcol=matrix[0].length;
        int n=totrow*totcol;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int rowi=mid/totcol;
            int coli=mid%totcol;
            if(matrix[rowi][coli]==target){
                return true;
            }
           else if(matrix[rowi][coli]>target){
                end=mid-1;
            }
           else {
                st=mid+1;
            }
        }
        return false;
    }
}