public class LeetCode744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;// this is done to escape the out of range in integer problem
            if(target < letters[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return letters[low % letters.length]; // this is to satisfy the wrap around condition
    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr, 'c'));
    }
}
