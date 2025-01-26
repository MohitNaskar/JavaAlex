public class MethodOverloading   {
    public static void main(String[] args) {
        System.out.println(calculateScore(500));
        System.out.println(calculateScore("Mohit",1500));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player name: " + playerName+ " score: " + score);
        return score;
    }
    public static int calculateScore(int score){
        return score;
    }
}
