public class LeetCode268 {
    //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    static int function(int[] arr){
        //here in sorted version index == element

        //case 1: when element is not present in its correct index
        //case 2: when n not available
        int i = 0;
            while(i < arr.length) { // ending index or till where the i would run
                int corrrect = arr[i]; //the correct index would be always i - 1 that is if the element is 3 correct index for that is 2
                if(arr[i] < arr.length && arr[i] != arr[corrrect]) { // check if arr[i] is at the correct index then swap
                    SelectionSort.swap(arr, i, corrrect);
                }
                else {
                    i++; // if its at correct index increament i;
                }
            }
        //find the missing index
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        return i;
    }

    //this is the solution
    public int missingNumber(int[] nums) {
        int i = 0;
        //case 1 : the element must be equal to their index that is element = index
        // case 2 :when n is not available
        while (i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){ // checking if nums[i] < length because so that it doesn't give index out of bound error
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length; //when n is not available
    }
}
