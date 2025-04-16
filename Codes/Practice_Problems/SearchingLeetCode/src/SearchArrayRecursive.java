public class SearchArrayRecursive {
    public static void main(String[] args) {
        System.out.println(searchArray(new int[]{1,2,3,4,5},3,0));
    }
    public static int searchArray(int[] arr, int target,int index) {
        if(index == arr.length -1) {
            return arr[index];
        }
        return arr[index] == target ? index: searchArray(arr, target, index+1);
    }
}
