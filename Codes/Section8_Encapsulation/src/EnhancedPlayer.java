public class EnhancedPlayer {
    private String name;
    private int healthPercent;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"Sword");
    }

    public EnhancedPlayer(String name, int healthPercent, String weapon) {
        this.name = name;
        if (healthPercent <= 0) {
            this.healthPercent = 1;
        }
        else if (healthPercent > 100) {
            this.healthPercent = 100;
        }
        else {
            this.healthPercent = healthPercent;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercent -= damage;
        if(healthPercent <= 0) {
            System.out.println("Player knocked out of the game");
        }
    }
    public int healthRemaining(){
        return healthPercent;
    }
    public void restoreHealth(int extraHealth) {
        healthPercent += extraHealth;
        if (healthPercent >= 100) {
            System.out.println("Player restored to 100%");
            healthPercent = 100;
        }
    }
}
