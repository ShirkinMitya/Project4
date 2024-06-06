package EnemyFabric;

import Character.Enemy;
import Enemy.ShaoKahn;

public class FabricShaoKahn implements EnemyFabric {

    @Override
    public Enemy create() {

        return new ShaoKahn(3, 100, 30);

    }
}
