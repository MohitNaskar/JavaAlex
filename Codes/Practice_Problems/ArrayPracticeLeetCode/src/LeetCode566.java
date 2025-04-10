public class LeetCode566 {
    //https://leetcode.com/problems/reshape-the-matrix/
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Get the number of rows (m) and columns (n) of the input matrix
        int m = mat.length, n = mat[0].length;

        // If the total number of elements in the input and output matrices don't match,
        // return the original matrix
        if (m * n != r * c) {
            return mat;
        }

        // Initialize the reshaped matrix with the desired number of rows and columns
        int[][] reshapedMatrix = new int[r][c];

        // Loop through each element of the input matrix in row-major order
        for (int i = 0; i < m * n; ++i) {
            // Calculate the new row index for the current element in the reshaped matrix
            int newRow = i / c;
            // Calculate the new column index for the current element in the reshaped matrix
            int newCol = i % c;

            // Calculate the original row index for the current element in the input matrix
            int originalRow = i / n;
            // Calculate the original column index for the current element in the input matrix
            int originalCol = i % n;

            // Assign the element from the original position to the new position
            reshapedMatrix[newRow][newCol] = mat[originalRow][originalCol];
        }

        // Return the reshaped matrix
        return reshapedMatrix;
    }
}
