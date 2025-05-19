import java.util.ArrayList;

public class KeyPadPhone {
    public static void main(String[] args) {
        System.out.println(keyPadReturnList("","12" ));
    }
    public static void keyPad(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0'; //this is a classic way to convert a string to an integer
        // This gives you the character '5'
        // ASCII value of '5' is 53, '0' is 48
        // This gives you the integer 5
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            keyPad(processed + ch, unprocessed.substring(1));
        }
    }
    public static ArrayList<String> keyPadReturnList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';
        //this is a classic way to convert a string to an integer
        // This gives you the character '5'
        // ASCII value of '5' is 53, '0' is 48
        // This gives you the integer 5
        ArrayList<String> res = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            res.addAll(keyPadReturnList(processed + ch, unprocessed.substring(1)));
        }
        return res;
    }
}
