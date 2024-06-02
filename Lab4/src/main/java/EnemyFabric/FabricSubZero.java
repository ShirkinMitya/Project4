package EnemyFabric;

import Character.Enemy;
import Enemy.SubZero;

public class FabricSubZero implements EnemyFabricInterface {

    @Override
    public Enemy create() {

        return new SubZero(1, 60, 16, 1);
    }
}
