package EnemyFabric;

import Character.Enemy;
import Enemy.SonyaBlade;

public class FabricSonyaBlade implements EnemyFabric {

    @Override
    public Enemy create() {

        return new SonyaBlade(1, 80, 16);
    }
}
