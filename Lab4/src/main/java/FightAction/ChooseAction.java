package FightAction;

import GUI.Mediator;
import Character.Character;
import static FightAction.FightActionType.ATTACK;
import static FightAction.FightActionType.DEFEND;
import static FightAction.FightActionType.HILL;
import static FightAction.FightActionType.WEAKEN;

public class ChooseAction {

    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        FigthAction figthAction = null;
        String lastAction = "";
        String stunnInfo = "";
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
                        break;
                    case HILL:
                        break;
                    case WEAKEN:
                        break;
                }
                break;
            case DEFEND:
                switch (p2.getAction()) {
                    case ATTACK:
                        break;
                    case DEFEND:
                        break;
                    case HILL:
                        break;
                    case WEAKEN:
                        break;
                }
                break;
            case SKIPMOVE:
                switch (p2.getAction()) {
                    case ATTACK:
                        break;
                    case DEFEND:
                        break;
                    case HILL:
                        break;
                    case WEAKEN:
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
                    case WEAKEN:
                        break;
                }
                break;
            case WEAKEN:
                switch (p2.getAction()) {
                    case ATTACK:
                        break;
                    case DEFEND:
                        break;
                    case HILL:
                        break;
                    case WEAKEN:
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
    */

