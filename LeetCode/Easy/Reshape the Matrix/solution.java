class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Original matrix dimensions
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        // Create new reshaped matrix
        int[][] res = new int[r][c];

        // Copy elements one by one
        for (int i = 0; i < m * n; i++) {
            // Original matrix position
            int oldRow = i / n;
            int oldCol = i % n;

            // New matrix position
            int newRow = i / c;
            int newCol = i % c;

            // Assign value
            res[newRow][newCol] = mat[oldRow][oldCol];
        }

        return res;
    }
}