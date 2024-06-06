package Enemy;

import Character.Enemy;

public class LiuKang extends Enemy {

    public LiuKang(int level, int health, int damage) {
        super("LuiKang", level, health, damage, "Pictures/Lui.Kang.jpg", new int[]{13, 13, 10, 64, 0, 0});
    }

}
