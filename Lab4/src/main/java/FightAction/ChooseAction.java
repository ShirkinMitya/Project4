package FightAction;

import GUI.Mediator;
import Character.Character;
import Character.Debuff;
import static FightAction.FightActionType.ATTACK;
import static FightAction.FightActionType.DEFEND;
import static FightAction.FightActionType.DEBUFF;
import static FightAction.FightActionType.HEAL;

public class ChooseAction {

    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        if (p1.isStun()) {
            p1.setStun(false);
            p1.setAction(FightActionType.SKIPMOVE);
        }
        switch (p1.getAction()) {
            case ATTACK:
                switch (p2.getAction()) {
                    case ATTACK:
                        p2.removeHealth(p1.getDamage());
                        mediator.MoveInfo(p1.getName() + " attacked", "");
                        break;
                    case DEFEND:
                        if (Math.random() < p1.getProbabilityToBrakeBlock()) {
                            p2.removeHealth((int) (p1.getDamage() * 0.5));
                            mediator.MoveInfo("Your block is broken", "");
                        } else {
                            p1.removeHealth((int) (p2.getDamage() * 0.5));
                            mediator.MoveInfo(" counterattacked", "");
                        }
                        break;
                    case HEAL:
                        p2.removeHealth((int) (2 * p1.getDamage()));
                        mediator.MoveInfo(p2.getName() + "critically damaged", "");
                        break;
                    case DEBUFF:
                        p2.removeHealth((int) (1.15 * p1.getDamage()));
                        mediator.MoveInfo(p2.getName() + "critically damaged", "");
                        break;
                }
                break;

            case DEFEND:
                switch (p2.getAction()) {
                    case ATTACK:
                        mediator.MoveInfo(p1.getName() + " didn't attacked", "");
                        break;
                    case DEFEND:
                        if (Math.random() <= 0.5) {
                            p2.setStun(true);
                        }
                        mediator.MoveInfo("Both defended themselves", "");
                        break;
                    case HEAL:
                        p2.addHealth((int) ((p2.getMaxHealth() - p2.getHealth()) * 0.5));
                        mediator.MoveInfo(p2.getName() + " healed", "");
                        break;
                    case DEBUFF:
                        if (Math.random() > 0.75) {
                            mediator.MoveInfo(p2.getName() + " didn't attacked", "");
                            break;
                        }
                        Debuff debuff = new Debuff(p2.getLevel());
                        p1.setDebuff(debuff);
                        mediator.MoveInfo(p2.getName() + " debuff " + p1.getName(), "");
                        break;
                }
                break;

            case SKIPMOVE:
                switch (p2.getAction()) {
                    case ATTACK:
                        p1.removeHealth(p2.getDamage());
                        mediator.MoveInfo(p2.getName() + " attacked", p1.getName() + " was stunned");
                        break;
                    case DEFEND:
                        mediator.MoveInfo(p1.getName() + " didn't attacked", p1.getName() + " was stunned");
                        break;
                    case HEAL:
                        p2.addHealth((int)((p2.getMaxHealth() - p2.getHealth()) * 0.5));
                        mediator.MoveInfo(p2.getName() + " healed", p1.getName() + " was stunned");
                        break;
                    case DEBUFF:
                        if (Math.random() > 0.75) {
                            mediator.MoveInfo(p2.getName() + " didn't attacked", p1.getName() + " was stunned");
                            break;
                        }
                        Debuff debuff = new Debuff(p2.getLevel());
                        p1.setDebuff(debuff);
                        mediator.MoveInfo(p2.getName() + " debuffed " + p1.getName(), p1.getName() + " was stunned");
                        break;
                }
                break;

            case HEAL:
                switch (p2.getAction()) {
                    case ATTACK:
                        p1.removeHealth(2 * p2.getDamage());
                        mediator.MoveInfo(p1.getName() + " critically damaged", "");
                        break;
                    case DEFEND:
                    case DEBUFF:
                        p1.addHealth((int) ((p1.getMaxHealth() - p1.getHealth()) * 0.5));
                        mediator.MoveInfo(p1.getName() + " healed", "");
                        break;
                }
                break;

            case DEBUFF:
                switch (p2.getAction()) {
                    case ATTACK:
                        p1.removeHealth((int) (1.15 * p2.getDamage()));
                        mediator.MoveInfo(p1.getName() + " critically damaged", "");
                        break;
                    case DEFEND:
                    case HEAL:
                    case DEBUFF:
                        if (Math.random() > 0.75) {
                            mediator.MoveInfo(p2.getName() + " didn't attacked", "");
                            break;
                        }
                        Debuff debuff = new Debuff(p1.getLevel());
                        p2.setDebuff(debuff);
                        mediator.MoveInfo(p1.getName() + " weakened " + p2.getName(), "");
                        break;
                }
                break;
        }
    }
}
