public class LeetCode1572 {
    //https://leetcode.com/problems/matrix-diagonal-sum/
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int res = 0;
        for(int i = 0; i < mat.length; i++){

            for (int j = 0; j <mat[i].length; j++){
                if(i == j){
                    res+=mat[i][j];
                }
            }
            if ( i == mat.length-1-i){
                continue;
            }
            else{
                res+= mat[i][mat.length-1-i];
            }
//            for (int k = mat[i].length - 1; k >= 0; k--){
//                if ( i == k){
//                    continue;
//                }
//                else{
//                    res+= mat[i][mat.length-1-i];
//                }
//            }
        }
        return res;
    }
}
