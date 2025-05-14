public class CheckSortedRecursive {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(checkSorted(nums,0));
    }
    static boolean checkSorted(int[] nums,int index) {
        if(index == nums.length-1) {
            return true;
        }
        return nums[index] < nums[index+1] && checkSorted(nums,index+1);
    }

}
