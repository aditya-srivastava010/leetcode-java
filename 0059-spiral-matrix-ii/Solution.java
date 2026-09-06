class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int sr= 0;
        int er =n - 1;
        int sc = 0;
        int ec = n - 1;
        int num = 1;
        while(sr<=er && sc<=ec){
            for(int col=sc;col<=ec;col++){
                matrix[sr][col]=num++;
            }
            sr++;
            for(int row=sr;row<=er;row++){
                matrix[row][ec]=num++;
            }
            ec--;
            if(sr<=er){
                for(int col=ec;col>=sc;col--){
                  matrix[er][col]=num++;  
                }
            }
            er--;
            if(sc<=ec){
                for(int row=er;row>=sr;row--){
                  matrix[row][sc]=num++;  
                }
            }
            sc++;
        }
        return matrix;
    }
}