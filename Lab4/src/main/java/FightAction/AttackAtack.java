package FightAction;

import Character.Character;
import GUI.Mediator;

public class AttackAtack implements FigthAction {

    @Override
    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        p2.removeHealth(p1.getDamage());
        mediator.MoveInfo(p1.getName() + " attacked", "");

    }

}
