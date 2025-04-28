import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2248 {
    //https://leetcode.com/problems/intersection-of-multiple-arrays/?envType=problem-list-v2&envId=sorting

    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> list = new ArrayList<>();
        System.out.println(intersection(nums));
    }
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> output = new ArrayList<>();
        nums = sort(nums);
        for (int j = 0; j < nums[0].length; j++) {
            output = checkIntersection(nums,output,nums[0][j]);
        }
        return output;
    }
    public static List<Integer> checkIntersection(int[][] nums,List<Integer> output,int target) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(target == nums[i][j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == nums.length-1) {
            output.add(target);
        }
        return output;
    }
    public static int[][] sort(int[][] nums){
        boolean swap = true;
        for(int i = 0; i< nums.length;i++){
            for(int j = 0; j<nums[i].length;j++){
                for(int k = 1; k < nums.length - j;k++){
                    if(nums[i][k] < nums[i][k-1]){
                        int temp = nums[i][k];
                        nums[i][k] = nums[i][k-1];
                        nums[i][k-1] = temp;
                        swap = true;
                    }
                }
                if(!swap){
                    break;
                }
            }

        }
        return nums;
    }
}
