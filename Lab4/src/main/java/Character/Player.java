package Character;

public class Player extends Character {

    private int points;
    private int experience;
    private int nextExperience;

    public Player(int level, int health, int damage) {
        super("You", level, health, damage, "/Pictures/Kitana.jpg");
        this.points = 0;
        this.experience = 0;
        this.nextExperience = 40;
    }

    public int getPoints() {
        return this.points;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getNextExperience() {
        return this.nextExperience;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addExperience(int experience) {
        this.experience += experience;
    }

    public void setNextExperience(int nextExperience) {
        this.nextExperience = nextExperience;
    }

}
