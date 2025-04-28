import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode350 {
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=problem-list-v2&envId=sorting
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2);

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    res.add(list1.get(i));
                    list2.remove(j);
                    break;
                }
            }
        }
        int[] resArr = new int[res.size()];
        for (int i = 0; i < list1.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}
