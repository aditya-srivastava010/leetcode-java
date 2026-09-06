class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                matrix[row][col] += matrix[row][col - 1];
            }
        }
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int sc = 0; sc < cols; sc++) {
            for (int j = sc; j < cols; j++) {
                map.clear();
                map.put(0, 1);
                int csum = 0;
                for (int row = 0; row < rows; row++) {
                    csum += matrix[row][j] - (sc > 0 ? matrix[row][sc - 1] : 0);
                    res += map.getOrDefault(csum - target, 0);
                    map.merge(csum, 1, Integer::sum);
                }
            }
        }
        return res;
    }
}