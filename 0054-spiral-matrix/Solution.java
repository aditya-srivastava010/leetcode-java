class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int sr = 0, er = m - 1;
        int sc = 0, ec = n - 1;

        while (sr <= er && sc <= ec) {

            // Top row
            for (int col = sc; col <= ec; col++) {
                res.add(matrix[sr][col]);
            }
            sr++;

            // Right column
            for (int row = sr; row <= er; row++) {
                res.add(matrix[row][ec]);
            }
            ec--;

            // Bottom row
            if (sr <= er) {
                for (int col = ec; col >= sc; col--) {
                    res.add(matrix[er][col]);
                }
                er--;
            }

            // Left column
            if (sc <= ec) {
                for (int row = er; row >= sr; row--) {
                    res.add(matrix[row][sc]);
                }
                sc++;
            }
        }

        return res;
    }
}