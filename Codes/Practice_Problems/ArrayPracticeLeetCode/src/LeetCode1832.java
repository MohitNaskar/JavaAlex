import java.util.ArrayList;
import java.util.List;

public class LeetCode1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        List<Character> arr = new ArrayList<Character>();
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        List<Character> arr = new ArrayList<Character>();
        int i = 0;
        while (i < sentence.length()){
            if(!arr.contains(sentence.charAt(i))){
                arr.add(sentence.charAt(i));
            }
            i++;
            if(arr.size() == 26)
                return true;
        }
        return false;
    }
}
