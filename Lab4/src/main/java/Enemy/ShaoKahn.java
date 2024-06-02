package Enemy;

import Character.Enemy;

public class ShaoKahn extends Enemy {
    
    public ShaoKahn(int level, int health, int damage) {
        super("ShaoKahn", level, health, damage, "", new int[]{10, 45, 0, 45});
        setItemsProbabilities(new int[]{38, 23, 8,});
        setProbabilityToBrakeBlock(0.15);
        
    }
    
}
