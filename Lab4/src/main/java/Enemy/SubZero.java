package Enemy;

import Character.Enemy;

public class SubZero extends Enemy {

    public SubZero(int level, int health, int damage) {
        super("SubZero", level, health, damage, "Pictures/Sub-Zero.jpg", new int[]{20, 20, 0, 40, 20, 0});
    }

}
