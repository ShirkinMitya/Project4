package EnemyFabric;

import Enemy.LiuKang;
import Character.Enemy;

public class FabricLiuKang implements EnemyFabricInterface {

    @Override
    public Enemy create() {
        return new LiuKang(1, 70, 20);
    }
}
