public class Method1Challenge {
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition+ " on the high score list");
    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000)
            return 1;
        else if (score >= 500 ) {
            return 2;
        } else if (score >= 100 ) {
            return 3;
        }
        else
            return 4;
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mohit", highScorePosition);
    }
}
