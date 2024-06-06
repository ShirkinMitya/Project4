package FightAction;

import GUI.Mediator;
import Character.Character;
import static FightAction.FightActionType.ATTACK;
import static FightAction.FightActionType.DEFEND;
import static FightAction.FightActionType.HILL;
import static FightAction.FightActionType.DEBUFF;

public class ChooseAction {

    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        FigthAction figthAction = null;
        if (p1.isStun()) {
            p1.setStun(false);
            p1.setAction(FightActionType.SKIPMOVE);
        }
        switch (p1.getAction()) {
            case ATTACK:
                switch (p2.getAction()) {
                    case ATTACK:
                        figthAction = new AttackAtack();
                        break;
                    case DEFEND:
                        figthAction = new AttackDefend();
                        break;
                    case HILL:
                        break;
                    case DEBUFF:
                        break;
                }
                break;
            case DEFEND:
                switch (p2.getAction()) {
                    case ATTACK:
                        figthAction = new DefendAttack();
                        break;
                    case DEFEND:
                        figthAction = new DefendDefend();
                        break;
                    case HILL:
                        break;
                    case DEBUFF:
                        break;
                }
                break;
            case SKIPMOVE:
                switch (p2.getAction()) {
                    case ATTACK:
                        figthAction = new SkipAttack();
                        break;
                    case DEFEND:
                        figthAction = new SkipDefend();
                        break;
                    case HILL:
                        break;
                    case DEBUFF:
                        break;
                }
                break;
            case HILL:
                switch (p2.getAction()) {
                    case ATTACK:
                        break;
                    case DEFEND:
                        break;
                    case HILL:
                        break;
                    case DEBUFF:
                        break;
                }
                break;
            case DEBUFF:
                switch (p2.getAction()) {
                    case ATTACK:
                        break;
                    case DEFEND:
                        break;
                    case HILL:
                        break;
                    case DEBUFF:
                        break;
                }
                break;

        }
        figthAction.MoveAction(p1, p2, mediator);
    }
}

/*switch (Integer.toString(p1.getAction() + Integer.toString(p2.getAttack()))     {
            case "10":
                if (Math.random() < p1.getProbabilityToBrakeBlock()) {
                    p2.removeHealth((int) (p1.getDamage() * 0.5));
                    lastAction = "Your block is broken";
                } else {
                    p1.removeHealth((int) (p2.getDamage() * 0.5));
                    lastAction = p2.getName() + " counterattacked";
                }
                break;
            case "11":
                p2.removeHealth(p1.getDamage());
                lastAction = p1.getName() + " attacked";
                break;
            case "00":
                if (Math.random() <= 0.5) {
                    p2.setStun(true);
                }
                lastAction = "Both defended themselves";
                break;
            case "01":
                lastAction = p1.getName() + " didn't attacked";
                break;
            case "-10":
                lastAction = p1.getName() + " didn't attacked";
                stunnInfo = p2.getName() + " was stunned";
                break;
            case "-11":
                p1.removeHealth(p2.getDamage());
                lastAction = p2.getName() + " attacked";
                stunnInfo = p1.getName() + " was stunned";
                break;
        }
        mediator.MoveInfo(lastAction, stunnInfo);
    }


       } else {
                        p1.damage((int) (p2.getDamage() * 0.5));
                        l2.setText(p2.getName() + " counterattacked");
                    }
                    break;
                case ATTACK:
                    p2.damage(p1.getDamage());
                    l2.setText(p1.getName() + " attacked");
                    break;
                case WEAKEN:
                    p2.damage((int) (1.15 * p1.getDamage()));
                    l2.setText(p2.getName() + " critically damaged");
                    break;
                case HEAL:
                    p2.damage(2 * p1.getDamage());
                    l2.setText(p2.getName() + " critically damaged");
                    break;
            }
            break;
        case DEFENCE:
            switch (p2.getCurrentAction()) {
                case ATTACK:
                    l2.setText(p1.getName() + " didn't attacked");
                    break;
                case DEFENCE:
                    if (Math.random() <= 0.5) {
                        stun = true;
                    }
                    l2.setText("Both defended themselves");
                    break;
                case WEAKEN:
                    if (Math.random() > 0.75) {
                        l2.setText(p2.getName() + " didn't attacked");
                        break;
                    }
                    Debuff d1 = Debuff.WEAKNESS;
                    Debuff d2 = Debuff.VULNERABILITY;
                    d1.setTurns(p2.getLevel());
                    d2.setTurns(p2.getLevel());
                    p1.addDebuff(d1);
                    p1.addDebuff(d2);
                    l2.setText(p2.getName() + " weakened " + p1.getName());
                    break;
                case HEAL:
                    p2.addHealth((int) ((p2.getMaxHealth() - p2.getHealth()) * 0.5));
                    l2.setText(p2.getName() + " healed");
                    break;
            }
            break;
        case WEAKEN:
            switch (p2.getCurrentAction()) {
                case DEFENCE:
                case WEAKEN:
                case HEAL:
                    if (Math.random() > 0.75) {
                        l2.setText(p2.getName() + " didn't attacked");
                        break;
                    }
                    Debuff d1 = Debuff.WEAKNESS;
                    Debuff d2 = Debuff.VULNERABILITY;
                    d1.setTurns(p1.getLevel());
                    d2.setTurns(p1.getLevel());
                    p2.addDebuff(d1);
                    p2.addDebuff(d2);
                    l2.setText(p1.getName() + " weakened " + p2.getName());
                    break;
                case ATTACK:
                    p1.damage((int) (1.15 * p2.getDamage()));
                    l2.setText(p1.getName() + " critically damaged");
                    break;
            }
            if (p2.getCurrentAction() == ActionType.HEAL) {
                p2.addHealth((int) ((p2.getMaxHealth() - p2.getHealth()) * 0.5));
            }
            break;
        case HEAL:
            switch (p2.getCurrentAction()) {
                case DEFENCE:
                case WEAKEN:
                    p1.addHealth((int) ((p1.getMaxHealth() - p1.getHealth()) * 0.5));
                    l2.setText(p1.getName() + " healed");
                    break;
                case ATTACK:
                    p1.damage(2 * p2.getDamage());
                    l2.setText(p1.getName() + " critically damaged");
                    break;
            }
            if (p2.getCurrentAction() == ActionType.WEAKEN) {
                if (Math.random() > 0.75) {
                    break;
                }
                Debuff d1 = Debuff.WEAKNESS;
                Debuff d2 = Debuff.VULNERABILITY;
                d1.setTurns(p2.getLevel());
                d2.setTurns(p2.getLevel());
                p1.addDebuff(d1);
                p1.addDebuff(d2);
                break;
            }
            break;
    }
}
 */
