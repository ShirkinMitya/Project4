package Enemy;

import Character.Enemy;

public class Baraka extends Enemy {

    public Baraka(int level, int health, int damage) {
        super("Вaraka", level, health, damage, "", new int[]{15, 15, 60, 10});
    }

}
