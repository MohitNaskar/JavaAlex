public class RecursiveBubbleSort {
    public static void main(String[] args) {}
    public void bubbleSort(int[] nums,int high,int low) {
        if (high == 0)
            return;
        if (low < high){
            if (nums[low] > nums[low + 1]){
                int temp = nums[low];
                nums[low] = nums[low + 1];
                nums[low + 1] = temp;
            }
            bubbleSort(nums,high,low+1);
        }
        else {
            bubbleSort(nums,high -1,low);
        }
    }
}
