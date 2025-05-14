import java.util.Arrays;

public class LeetCode220 {
    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9},2,3));
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i = 0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)    continue;
                int x = Math.abs(i-j);
                int y = Math.abs(nums[i] - nums[j]);
                if (i != j && x <= indexDiff && y <= valueDiff){
                    System.out.println(x);
                    System.out.println(y);

                    return true;
                }
            }
        }
        return false;
    }
}
