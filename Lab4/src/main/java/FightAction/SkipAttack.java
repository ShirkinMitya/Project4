package FightAction;

import Character.Character;
import GUI.Mediator;

public class SkipAttack implements FigthAction {

    @Override
    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        p1.removeHealth(p2.getDamage());
        mediator.MoveInfo(p2.getName() + " attacked", p1.getName() + " was stunned");
    }

}
