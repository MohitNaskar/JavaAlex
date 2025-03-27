public class MaxWealth {
    public static int maxWealth(int[][] a) {
        int maxWealth = 0;
        int wealth = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                wealth += a[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
                wealth = 0;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][] a = {{2,3},{4,4}};
        System.out.println(maxWealth(a));
    }
}
