import java.util.ArrayList;

public class LinearRecursiveSearch {
    public static void main(String[] args) {
        int[] arr ={1,3,2,7,9};
        int target = 9;
        linearRecursiveSearchReturnArrayListParameter(arr,target,0,list);
        System.out.println(list);
    }
    static int linearRecursiveSearch(int[] arr, int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearRecursiveSearch(arr, target, index + 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearRecursiveSearchReturnArrayListParameter(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        linearRecursiveSearchReturnArrayListParameter(arr, target, index + 1, list);
    }
    static ArrayList<Integer> linearRecursiveSearchReturnArrayList(int[] arr, int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        
    }
}

