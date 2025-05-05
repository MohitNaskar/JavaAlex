import java.util.Arrays;

public class LeetCode2217 {
    //https://leetcode.com/problems/find-palindrome-with-fixed-length/
    static int j = 0;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kthPalindrome(new int[]{2,201429812,8,520498110,492711727,339882032,462074369,9,7,6},1)));
    }

    public static long[] kthPalindrome(int[] queries, int intLength) {
        long[] arr = new long[queries.length];
        int count = 1;
        j = (int)Math.round(Math.pow(10,intLength-1));
        int higher = (int)Math.round(Math.pow(10,intLength));
        for(int i = 0; i< queries.length;i++){
            if (queries[i] > higher) {
                arr[i] = -1;
                continue;
            }
            while(j < higher){
                if(isPalindrome(j) != -1){
                    if (count == queries[i]){
                        arr[i] = j;
                        count++;
                        j++;
                        break;
                    }
                    else {
                        count++;
                    }
                }j++;
            }
        }
        return arr;
    }
    public static int isPalindrome(int x) {
        int temp = x;
        if (x < 0) return -1;
        int reverse = 0;
        while(x > 0){
            int local = x % 10;
            reverse = reverse * 10 + local;
            x = x/10;
        }
        if (reverse == temp)    return reverse;
        return -1;
    }
}
