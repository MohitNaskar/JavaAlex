import java.util.Arrays;

public class LeetCode436 {
    //https://leetcode.com/problems/find-right-interval/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{3,4},{2,3},{1,2}})));
    }
    public static int[] findRightInterval(int[][] intervals) {
        //if the size of the array is 1
        if(intervals.length == 1)   return new int[] {-1};

        //case 2
        int[] arr = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0){
                arr[0] = -1;
                continue;
            }
            if (intervals[i][0] > intervals[i-1][1]){
                arr[i] = i-1;
            }
            else {
                arr[i] = -1;
            }
        }
        return arr;
    }
}
