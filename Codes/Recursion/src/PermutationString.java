import java.util.ArrayList;

public class PermutationString {
    public static void main(String[] args) {
        permutationString("","abc");
    }
    public static void permutationString(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 1; i < processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            permutationString(f+ch+s, unprocessed.substring(1));
        }
    }
    public static ArrayList<String> permutationStringReturnList(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i < processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            ans.addAll(permutationStringReturnList(f+ch+s, unprocessed.substring(1)));
        }
        return ans;
    }
}
