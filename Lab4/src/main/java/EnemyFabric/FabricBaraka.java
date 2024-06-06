package EnemyFabric;

import Enemy.Baraka;
import Character.Enemy;

public class FabricBaraka implements EnemyFabric {

    @Override
    public Enemy create() {
        return new Baraka(1, 100, 12);
    }
}
