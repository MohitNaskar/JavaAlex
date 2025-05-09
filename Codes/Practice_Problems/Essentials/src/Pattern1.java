public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4,0);
    }
    public static String pattern1(int row,int col) {

        while (row > col) {
            System.out.print("*");
            col++;
        }
        System.out.println();
        return (row == 0) ? "" : pattern1(row-1,0);
    }
}
