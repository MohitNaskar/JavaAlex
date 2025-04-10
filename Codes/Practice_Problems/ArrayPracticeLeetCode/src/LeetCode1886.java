import java.util.Arrays;

public class LeetCode1886 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(arr);
        System.out.println("-----------------");
        System.out.println(Arrays.deepToString(rotate(arr)));
        System.out.println(compare(arr,rotate(arr)));
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (compare(mat, target)) {
                return true;
            }
            mat = rotate(mat); // Rotate mat 90 degrees clockwise
        }
        return false;
    }

    public static boolean compare(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];

        // Transpose and reverse rows to rotate 90 degrees clockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }
        return res;
    }
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
