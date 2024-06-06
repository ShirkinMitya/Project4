package Enemy;

import Character.Enemy;

public class ShaoKahn extends Enemy {

    public ShaoKahn(int level, int health, int damage) {
        super("ShaoKahn", level, health, damage, "Pictures/Shao.Kahn.jpg", new int[]{5, 35, 0, 35, 0, 25});
        setItemsProbabilities(new int[]{38, 23, 8,});
        setProbabilityToBrakeBlock(0.15);
        setExperienceMultiolier(2);

    }

}
