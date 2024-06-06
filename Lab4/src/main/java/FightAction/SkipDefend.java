package FightAction;

import Character.Character;
import GUI.Mediator;

public class SkipDefend implements FigthAction {

    @Override
    public void MoveAction(Character p1, Character p2, Mediator mediator) {
        mediator.MoveInfo(p1.getName() + " didn't attacked", p2.getName() + " was stunned");
    }

}
