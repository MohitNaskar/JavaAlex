import java.util.Arrays;

public class LeetCode832 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] arr2 = new int[arr.length][];
        arr2 = flipAndInvertImage(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < image.length; i++) {
            int q = image[i].length-1;
            for (int j = 0; j < image[i].length; j++) {
                while(j <= q){
                    int temp = image[i][j];
                    image[i][j] = image[i][q];
                    image[i][q] = temp;
                    j++;
                    q--;
                }
            }
        }
        return image;
    }
}
