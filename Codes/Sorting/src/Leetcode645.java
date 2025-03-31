public class Leetcode645 {
    public static void main(String[] args) {
        int[] arr = findErrorNums(new int[]{2,1,2,4});
        System.out.println(arr.toString());
    }
    public static int[] findErrorNums(int[] nums) {
        //since given a set of integer which contains all the numbers from [1,n] we use cylic sort
        // since the range is [1,n] we use index = value - 1
        int[] arr = new int[2];
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length;index++){
            if (nums[index] != index+1) // since 1 is present at 0 th index 2 is present at 1 index and so on
            {
                arr[0] = nums[index];
                arr[1] = index + 1;
            }
        }
        return arr;
    }
}
