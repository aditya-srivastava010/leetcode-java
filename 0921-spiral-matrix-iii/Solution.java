class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int n=rows*cols;
        int[][] res = new int[n][2];
        int[][] directions = {
                { 0, 1 },
                { 1, 0 },
                { 0, -1 },
                { -1, 0 }
        };
        res[0][0] = rStart;
        res[0][1] = cStart;

        int count = 1;
        int step = 1;
        int dir = 0;

        while (count < n) {

            for (int times = 0; times < 2; times++) {

                int dr = directions[dir % 4][0];
                int dc = directions[dir % 4][1];

                for (int i = 0; i < step; i++) {

                    rStart += dr;
                    cStart += dc;

                    if (rStart >= 0 && rStart < rows &&
                            cStart >= 0 && cStart < cols) {

                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                dir++;
            }
            step++;
        }
        return res;
    }
}