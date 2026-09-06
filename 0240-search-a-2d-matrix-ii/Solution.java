class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totr=matrix.length;
        int totc=matrix[0].length;
        int row=0;
        int col=totc-1;
        while(row<totr && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}