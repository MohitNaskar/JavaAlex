public class SubString {
    public static void main(String[] args) {
        subString("","abc");
    }
    public static void subString(String s, String k) {
        if (k.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = k.charAt(0);
        subString(s + ch, k.substring(1));
        subString(s, k.substring(1));

    }
}
