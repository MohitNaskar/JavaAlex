public class LeetCode1672 {
    //https://leetcode.com/problems/richest-customer-wealth/

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i = 0;i< accounts.length;i++){
            int max = 0;
            for (int j = 0; j< accounts[i].length;j++){
                max += accounts[i][j];
            }
            if(max > wealth){
                wealth = max;
            }
        }
        return wealth;
    }
}
