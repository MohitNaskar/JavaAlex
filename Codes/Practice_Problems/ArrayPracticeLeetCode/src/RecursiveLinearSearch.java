import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EnumSet;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9,10};
        System.out.println(search(arr,11,0));
//        searchAllIndex(arr,9,0);
//        System.out.println(list);
        ArrayList<Integer> ans = searchAllIndexList(arr,9,0,new ArrayList<>());
        System.out.println(ans);
    }
    public static boolean search(int[] nums, int target,int index) {
        if (index == nums.length-1 && target != nums[index]) {
            return false;
        }
         if (nums[index] == target) {
             return true;
         }
         else{
             return search(nums, target, index+1);
         }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void searchAllIndex(int[] nums, int target,int index) {
        if (index == nums.length) {
            return;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        searchAllIndex(nums, target, index+1);
    }


    //returning an arraylist while passing it in the argument
    public static ArrayList<Integer> searchAllIndexList(int[] nums, int target,int index,ArrayList<Integer> list) {
        if (index == nums.length) {
            return list;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        return searchAllIndexList(nums, target, index+1,list);
    }
}
