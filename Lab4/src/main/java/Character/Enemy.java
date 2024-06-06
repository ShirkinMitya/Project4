package Character;

import FightAction.FightActionType;
import Game.Items;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Enemy extends Character {

    private int[] behaviorsProbabilities;
    private double experienceMultiolier = 1;
    private int[] itemsProbabilities = new int[]{25, 15, 5};
    private Queue<FightActionType> enemyActions = new LinkedList<>();
    private final FightActionType kindFight[][] = 
            {{FightActionType.ATTACK, FightActionType.DEFEND},
            {FightActionType.ATTACK, FightActionType.ATTACK, FightActionType.DEFEND},
            {FightActionType.DEFEND, FightActionType.ATTACK, FightActionType.DEFEND},
            {FightActionType.ATTACK, FightActionType.ATTACK, FightActionType.ATTACK, FightActionType.ATTACK},
            {FightActionType.DEBUFF},
            {FightActionType.HILL}};

    public Enemy(String name, int level, int health, int damage, String imagePath, int[] behaviorsProbabilities) {
        super(name, level, health, damage, imagePath);
        enemyActions.add(FightActionType.DEFEND);
        this.behaviorsProbabilities = behaviorsProbabilities;
    }

    public FightActionType GetAction() {
        if (enemyActions.isEmpty()) {
            Random random = new Random();
            int behavior = 0;
            for (int i = 1; i < behaviorsProbabilities.length; i++) {
                int randomNumber = random.nextInt(100);
                if (randomNumber < behaviorsProbabilities[i]) {
                    behavior = i;
                    break;
                }
            }
            for (int j = 0; j < kindFight[behavior].length; j++) {
                enemyActions.add(kindFight[behavior][j]);
            }
        }
        return enemyActions.poll();
    }

    public void AddItem(Items items[]) {
        Random random = new Random();
        for (int i = 1; i < itemsProbabilities.length; i++) {
            int randomNumber = random.nextInt(100);
            if (randomNumber < itemsProbabilities[i]) {
                items[i].addCount(1);
                break;
            }
        }
    }

    public void setItemsProbabilities(int[] itemsProbabilities) {
        this.itemsProbabilities = itemsProbabilities;
    }

    public void setExperienceMultiolier(double experienceMultiolier) {
        this.experienceMultiolier = experienceMultiolier;
    }

    public double getExperienceMultiolier() {
        return experienceMultiolier;
    }

}
