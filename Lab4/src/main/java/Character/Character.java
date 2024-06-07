package Character;

import FightAction.FightActionType;

public class Character {

    private String name;
    private int level;
    private int health;
    private int maxhealth;
    private int damage;
    private boolean stun;
    private double probabilityToBrakeBlock;
    private String imagePath;
    private FightActionType action;
    private Debuff debuff = null;

    public Character(String name, int level, int health, int damage, String imagePath) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxhealth = health;
        this.damage = damage;
        this.stun = false;
        this.imagePath = imagePath;
        this.action = FightActionType.SKIPMOVE;
        this.probabilityToBrakeBlock = 0;
    }

    public void removeHealth(int health) {
        if (debuff != null) {
            this.health -= health * (1 + debuff.getDefendReduction());
        } else {
            this.health -= health;
        }
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public int getDamage() {
        if (debuff != null) {
            return (int) (this.damage * (1.0 - debuff.getDamageReduction()));
        } else {
            return this.damage;
        }
    }

    public void DebuffTursMinus() {
        if (debuff != null) {
            debuff.MinusNumberOfMotion();
            if (debuff.getNumberOfMotion() == 0) {
                debuff = null;
            }
        }
    }

    public void addLevel() {
        this.level++;
    }

    public void addDamage(int damage) {
        this.damage += damage;
    }

    public void addMaxHealth(int maxhealth) {
        this.maxhealth += maxhealth;
    }

    public void addHealth(int health) {
        this.health += health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMaxHealth() {
        return this.maxhealth;
    }

    public double getProbabilityToBrakeBlock() {
        return probabilityToBrakeBlock;
    }

    public String getImagePath() {
        return imagePath;
    }

    public FightActionType getAction() {
        return action;
    }

    public boolean isStun() {
        return stun;
    }

    public void setNewHealth(int health) {
        this.health = health;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public void setProbabilityToBrakeBlock(double probabilityToBrakeBlock) {
        this.probabilityToBrakeBlock = probabilityToBrakeBlock;
    }

    public void setAction(FightActionType action) {
        this.action = action;
    }

    public void setDebuff(Debuff weaken) {
        this.debuff = weaken;
    }

}
