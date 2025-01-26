public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
    }
    public static boolean isCatPlaying(boolean summer,int temperature) {
        if (summer) {
            return temperature > 24 && temperature < 46;
        }
        else if (temperature > 24 && temperature < 36 ) {
            return true;
        }
        return false;
    }
}
