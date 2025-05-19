import java.util.ArrayList;
import java.util.Arrays;

public class SubStringsRecursive {
    public static void main(String[] args) {
        System.out.println(subStringsRecursiveArrayList("","abs"));
    }
    public static void subStringsRecursive(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subStringsRecursive(processed +ch,unprocessed.substring(1));//arraylist left
        subStringsRecursive(processed,unprocessed.substring(1)); //arraylist right
    }

    public static void skipSubStringsRecursive(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a'){
            skipSubStringsRecursive(processed,unprocessed.substring(1));
        }
        else{
            skipSubStringsRecursive(processed,unprocessed.substring(1));
            skipSubStringsRecursive(processed+ch,unprocessed.substring(1));
        }
    }
    public static ArrayList<String> subStringsRecursiveArrayList(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subStringsRecursiveArrayList(processed + ch,unprocessed.substring(1));
        ArrayList<String> right = subStringsRecursiveArrayList(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;

    }
}
