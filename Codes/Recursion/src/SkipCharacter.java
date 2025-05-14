public class SkipCharacter {
    public static void main(String[] args) {
        skipCharacter("","baccd");
    }
    public static void skipCharacter(String s, String k) { //s is the result and k is the set of character
        if (k.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = k.charAt(0);
        if (ch == 'a') {
            skipCharacter(s, k.substring(1)); //this slices the the string and makes a substring from 1
        }
        else{
            skipCharacter(s + ch, k.substring(1));
        }
    }
}
