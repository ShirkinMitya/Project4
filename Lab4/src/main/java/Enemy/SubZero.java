package Enemy;

import Character.Enemy;

public class SubZero extends Enemy {

    public SubZero(int level, int health, int damage, int attack) {
        super("SubZero", level, health, damage, attack, "", new int[]{25, 25, 0, 50});
    }

}
