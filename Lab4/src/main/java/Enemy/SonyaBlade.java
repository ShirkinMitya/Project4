package Enemy;

import Character.Enemy;

public class SonyaBlade extends Enemy {

    public SonyaBlade(int level, int health, int damage) {
        super("SonyaBlade", level, health, damage, "/Pictures/Sonya.Blade.jpg", new int[]{25, 25, 50, 0, 0, 0});
    }

}
