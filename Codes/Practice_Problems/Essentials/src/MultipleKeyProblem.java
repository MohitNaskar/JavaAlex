import java.util.ArrayList;

public class MultipleKeyProblem {
    //use linear search to find all the index of the provided key
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        findKey(new int[]{1,5,3,1,2},1,0);
        System.out.println(list);
    }
    public static void findKey(int[] arr, int k,int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == k) {
            list.add(index);
        }
        findKey(arr, k, index+1);
    }
}
