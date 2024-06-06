package FightAction;

import Character.Character;
import GUI.Mediator;

public class DefendDefend implements FigthAction {

    @Override
    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        if (Math.random() <= 0.5) {
            p2.setStun(true);
        }
        mediator.MoveInfo("Both defended themselves", "");
    }

}
