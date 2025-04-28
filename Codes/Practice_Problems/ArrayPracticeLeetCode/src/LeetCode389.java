import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode389 {
    //https://leetcode.com/problems/find-the-difference/?envType=problem-list-v2&envId=sorting
    public static void main(String[] args) {
        findTheDifference("abcd","abcde");
    }
    public static char findTheDifference(String s, String t) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list1.add(c);
        }
        for (char c : t.toCharArray()) {
            list2.add(c);
        }
        for (int i = 0; i < list1.size(); i++) {
            char temp = list1.get(i);
            for (int j = 0 ; j < list2.size(); j++) {
                if (temp == list2.get(j)) {
                    list2.remove(j);
                    break;
                }
            }
        }
        return list2.get(0);

    }
}
