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
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CharacterAction {

    Mediator mediator;
    private Queue<Enemy> location = new LinkedList<>();
    private int remainingLocations;
    private Enemy[] enemyList = new Enemy[5];
    private final int[] experienceForNextLevel = {40, 90, 180, 260, 410, 1000};

    public CharacterAction(Mediator mediator, int remainingLocations) {
        setEnemyes();
        this.mediator = mediator;
        this.remainingLocations = remainingLocations;
    }

    public void setEnemyes() {
        enemyList[0] = new FabricSubZero().create();
        enemyList[1] = new FabricSonyaBlade().create();
        enemyList[2] = new FabricLiuKang().create();
        enemyList[3] = new FabricBaraka().create();
        enemyList[4] = new FabricShaoKahn().create();
    }
    
   

    public boolean AddPoints(Player player, Enemy enemy) {
        boolean nextLevel = false;
        double experience = 0;
        double points = 0;
        switch (player.getLevel()) {
            case 0:
                experience = 20;
                points = 25 + player.getHealth() / 4;             
                break;
            case 1:
                experience = 25;
                points = 30 + player.getHealth() / 4;   
                break;
            case 2:
                experience = 30;
                points = 35 + player.getHealth() / 4;
                break;
            case 3:
                experience = 40; 
                points = 45 + player.getHealth() / 4;
                break;
            case 4:
                experience = 50;
                points = 55 + player.getHealth() / 4;
                break;
        }
        player.addExperience((int)(experience * enemy.getExperienceMultiolier()));
        player.addPoints((int)(points * enemy.getExperienceMultiolier()));
        for (int i = player.getLevel(); i < 5; i++) {
            if (experienceForNextLevel[i] <= player.getExperience()) {
                player.addLevel();
                nextLevel = true;
                player.setNextExperience(experienceForNextLevel[i + 1]); 
                for (int j = 0; j < 4; j++) {
                    NewHealthEnemy(enemyList[j], player);
                }
                break;
            }
        }
        return nextLevel;
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
                items[0].addCount(-1);
                break;
            case BIG_POTION:
                player.removeHealth((int) (player.getMaxHealth() * 0.5));
                items[1].addCount(-1);
                break;
        }
        mediator.CloseItems();
        mediator.BagText(items);
    }
    
    public void CreateLocation(Player player){
       Random random = new Random();
       int numberOfEnemies = player.getLevel() + random.nextInt(3) + 1;
       for(int i =0; i < numberOfEnemies; i++){
           location.add(enemyList[random.nextInt(4)]);
       }
       location.add(enemyList[4]);
       remainingLocations --;
    }
    

    public Enemy ChooseEnemy(Player player) {
        if(location.isEmpty()){
            CreateLocation(player);
        }
        return location.poll();
    }
    
    public boolean IfLastRound(){
        return location.isEmpty() && remainingLocations == 0;
    }
    
    public Enemy[] getEnemyList() {
        return this.enemyList;
    }
}
