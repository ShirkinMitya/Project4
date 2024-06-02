package Game;

import Character.Player;
import Character.Enemy;
import EnemyFabric.FabricBaraka;
import EnemyFabric.FabricLiuKang;
import EnemyFabric.FabricShaoKahn;
import EnemyFabric.FabricSonyaBlade;
import EnemyFabric.FabricSubZero;
import GUI.Mediator;
import static Game.ItemType.CROSS_REBIRTH;

public class CharacterAction {

    private final int[] experienceForNextLevel = {40, 90, 180, 260, 410, 1000};
    private Enemy[] enemyList = new Enemy[5];
    Mediator mediator;

    public CharacterAction(Mediator mediator) {
        setEnemyes();
        this.mediator = mediator;
    }

    public void setEnemyes() {
        enemyList[0] = new FabricSubZero().create();
        enemyList[1] = new FabricSonyaBlade().create();
        enemyList[2] = new FabricLiuKang().create();
        enemyList[3] = new FabricBaraka().create();
        enemyList[4] = new FabricShaoKahn().create();
    }

    public Enemy[] getEnemyes() {
        return this.enemyList;
    }

    public Enemy ChooseEnemy() {
        int i = (int) (Math.random() * 4);
        return enemyList[i];
    }

    public Enemy ChooseBoss() {
        return enemyList[4];
    }

    public void AddPoints(Player player, Enemy[] enemyes) {
        switch (player.getLevel()) {
            case 0:
                player.addExperience(20);
                player.addPoints(25 + player.getHealth() / 4);
                break;
            case 1:
                player.addExperience(25);
                player.addPoints(30 + player.getHealth() / 4);
                break;
            case 2:
                player.addExperience(30);
                player.addPoints(35 + player.getHealth() / 4);
                break;
            case 3:
                player.addExperience(40);
                player.addPoints(45 + player.getHealth() / 4);
                break;
            case 4:
                player.addExperience(50);
                player.addPoints(55 + player.getHealth() / 4);
                break;
        }
        for (int i = 0; i < 5; i++) {
            if (experienceForNextLevel[i] == player.getExperience()) {
                player.addLevel();
                player.setNextExperience(experienceForNextLevel[i + 1]);
                NewHealthHuman(player);
                for (int j = 0; j < 4; j++) {
                    NewHealthEnemy(enemyes[j], player);
                }
            }
        }
    }

    public void AddPointsBoss(Player player, Enemy[] enemyes) {
        switch (player.getLevel()) {
            case 2:
                player.addExperience(30);
                player.addPoints(45 + player.getHealth() / 2);
                break;
            case 4:
                player.addExperience(50);
                player.addPoints(65 + player.getHealth() / 2);
                break;
        }
        for (int i = 0; i < 5; i++) {
            if (experienceForNextLevel[i] == player.getExperience()) {
                player.addLevel();
                player.setNextExperience(experienceForNextLevel[i + 1]);
                NewHealthHuman(player);
                for (int j = 0; j < 4; j++) {
                    NewHealthEnemy(enemyes[j], player);
                }
            }
        }
    }

    public void NewHealthHuman(Player player) {
        int hp = 0;
        int damage = 0;
        switch (player.getLevel()) {
            case 1:
                hp = 25;
                damage = 3;
                break;
            case 2:
                hp = 30;
                damage = 3;
                break;
            case 3:
                hp = 30;
                damage = 4;
                break;
            case 4:
                hp = 40;
                damage = 6;
                break;
        }
        player.addMaxHealth(hp);
        player.addDamage(damage);
    }

    public void NewHealthEnemy(Enemy enemy, Player player) {
        int hp = 0;
        int damage = 0;
        switch (player.getLevel()) {
            case 1:
                hp = 32;
                damage = 25;
                break;
            case 2:
                hp = 30;
                damage = 20;
                break;
            case 3:
                hp = 23;
                damage = 24;
                break;
            case 4:
                hp = 25;
                damage = 26;
                break;
        }
        enemy.addMaxHealth((int) enemy.getMaxHealth() * hp / 100);
        enemy.addDamage((int) enemy.getDamage() * damage / 100);
        enemy.addLevel();
    }

    public void UseItem(Player player, Items[] items, ItemType itemType) {
        if (itemType == CROSS_REBIRTH || items[itemType.getInventoryIndex()].getCount() > 0) {
            mediator.CannotUseUtem();
            return;
        }
        switch (itemType) {
            case SMALL_POTION:
                player.removeHealth((int) (player.getMaxHealth() * 0.25));
                items[0].setCount(-1);
                break;
            case BIG_POTION:
                player.removeHealth((int) (player.getMaxHealth() * 0.5));
                items[1].setCount(-1);
                break;
        }
        mediator.CloseItems();
        mediator.BagText(items);
    }
}
