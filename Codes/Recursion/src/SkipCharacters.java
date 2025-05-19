public class SkipCharacters {
    public static void main(String[] args) {
        skipCharacters("","baccad");
        skipStrings("","appple");
    }
    public static void skipCharacters(String processed,String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a'){
            skipCharacters(processed, unprocessed.substring(1));
        }
        else{
            skipCharacters(processed + ch, unprocessed.substring(1));
        }
    }
    public static void skipStrings(String processed,String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if (unprocessed.startsWith("apple")){
            skipStrings(processed + unprocessed.substring("apple".length()), unprocessed.substring("apple".length()));
        }
        else{
            skipStrings(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }
    public static void skipWordInWords(String processed,String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if (unprocessed.startsWith("app") && unprocessed.startsWith("apple")){
            skipStrings(processed + unprocessed.substring("app".length()), unprocessed.substring("app".length()));
        }
        else{
            skipWordInWords(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }
}
