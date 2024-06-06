
package FightAction;

import Character.Character;
import GUI.Mediator;


public class AttackDefend implements FigthAction{

    @Override
    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        if (Math.random() < p1.getProbabilityToBrakeBlock()) {
                    p2.removeHealth((int) (p1.getDamage() * 0.5));
                    mediator.MoveInfo("Your block is broken", "");
                } else {
                    p1.removeHealth((int) (p2.getDamage() * 0.5));
                    mediator.MoveInfo(" counterattacked", "");
                                     
                }
    }
    
}
