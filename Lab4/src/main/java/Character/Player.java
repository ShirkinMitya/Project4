package Character;

public class Player extends Character {

    private int points;
    private int experience;
    private int win;
    private int nextexperience;

    public Player(int level, int health, int damage) {
        super("You", level, health, damage, ""); 
        this.points = 0;
        this.experience = 0;
        this.nextexperience = 40;
        this.win = 0;
    }

    public int getPoints() {
        return this.points;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getNextExperience() {
        return this.nextexperience;
    }

    public int getWin() {
        return this.win;
    }

    public void addPoints(int p) {
        this.points += p;
    }

    public void addExperience(int e) {
        this.experience += e;
    }

    public void setNextExperience(int e) {
        this.nextexperience = e;
    }

    public void addWin() {
        this.win++;
    }

}
