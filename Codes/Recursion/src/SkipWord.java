public class SkipWord {
    public static void main(String[] args) {

    }
    static String skipWords(String word) {
        if (word.isEmpty()){
            return "";
        }
        if(word.startsWith("apple")){
            return skipWords(word.substring("apple".length()));
        }
        else{
            return word.charAt(0) + skipWords(word.substring(1));
        }
    }
}
