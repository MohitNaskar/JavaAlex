public class LinearSearchRecursion {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,5,3,1,2},5,0));
    }
    public static boolean linearSearch(int[] arr, int key,int index) {
        if (index == arr.length )   return false;
        if (arr[index] == key) {
            return true;
        }
        return linearSearch(arr, key, index+1);
    }
}
