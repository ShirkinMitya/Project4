package EnemyFabric;

import Character.Enemy;
import Enemy.SubZero;

public class FabricSubZero implements EnemyFabric {

    @Override
    public Enemy create() {

        return new SubZero(1, 60, 16);
    }
}
