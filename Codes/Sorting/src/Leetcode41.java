public class Leetcode41 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        BubbleSort.initializeArray(arr);
        BubbleSort.printArray(arr);
        firstMissingPositive(arr);
        BubbleSort.printArray(arr);
    }
    public static int firstMissingPositive(int[] nums) {
        //since it's an unsorted array and we have to find the smallest +ve integer we have 2 ways
        // case 1: we apply linear search and search for the number accordingly
        // case 2: we apply cyclic search which follows the indexing with o(n) and o(1)
        /*
        Understanding the problem : if we use the cyclic sort method the positive integers will get sorted and the negative integers will be kept at last.
        So if we find that arr[i] != value + 1;
        we return that
         */

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i]<= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0;index < nums.length; index++){
            if (nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
}
