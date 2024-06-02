package Game;

import Character.Player;
import Character.Character;
import Character.Enemy;
import Enemy.ShaoKahn;
import FightAction.ChooseAction;
import FightAction.FightActionType;
import GUI.Mediator;
import java.util.ArrayList;

public class Fight {
    
    public int roundNumber = 1;
    Mediator mediator;
    ChooseAction chooseAction;
    
    public Fight(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void Move(Character p1, Character p2) {
        chooseAction.MoveAction(p1, p2, mediator);
        p1.NewMotion();
        p2.NewMotion();
    }
    
    public void Hit(Player player, Enemy enemy, FightActionType playerAction, CharacterAction action, ArrayList<Result> results, Items[] items) {
        player.setAction(playerAction);
        enemy.setAction(enemy.GetAction());
        if (roundNumber % 2 == 1) {
            Move(player, enemy);
        } else {
            Move(enemy, player);
        }
        roundNumber++;
        if (player.getHealth() <= 0 & items[2].getCount() > 0) {
            player.setNewHealth((int) (player.getMaxHealth() * 0.05));
            items[2].setCount(-1);
            mediator.Respawn();
        }
        if (player.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (((Player) player).getWin() == 11) {
                EndFinalRound(((Player) player), action, results);
            } else {
                EndRound(player, enemy, action, items);
            }
        }
        mediator.UpdateNewRound(player, enemy, roundNumber, items);
    }
    
    public void EndRound(Player player, Enemy enemy, CharacterAction action, Items[] items) {
        if (player.getHealth() > 0) {
            mediator.EndRoundInfo("You win");
            (player).addWin();
            enemy.AddItem(items);
            if (enemy instanceof ShaoKahn) {
                action.AddPointsBoss(player, action.getEnemyes());
            } else {
                
                action.AddPoints(player, action.getEnemyes());
            }
        } else {
            mediator.EndRoundInfo(enemy.getName() + " win");
        }
        roundNumber = 1;
    }
    
    public void EndFinalRound(Player player, CharacterAction action, ArrayList<Result> results) {
        String text = "Победа не на вашей стороне";
        if (player.getHealth() > 0) {
            player.addWin();
            action.AddPoints(player, action.getEnemyes());
            text = "Победа на вашей стороне";
        }
        boolean ifRecord = false;
        if (results == null) {
            ifRecord = true;
        } else {
            int i = 0;
            for (int j = 0; j < results.size(); j++) {
                if (player.getPoints() < results.get(j).getPoints()) {
                    i++;
                }
            }
            if (i < 10) {
                ifRecord = true;
            }
        }
        mediator.EndFinalRoundInfo(text, ifRecord);
    }
    
    public int[] ResetAttack() {
        int a[] = {0};
        return a;
    }
    
    public Enemy NewRound(Player player, CharacterAction action) {
        Enemy enemy = null;
        if (player.getWin() == 6 | player.getWin() == 11) {
            enemy = action.ChooseBoss();
        } else {
            enemy = action.ChooseEnemy();
        }
        mediator.UpdateEnemy(enemy);
        mediator.UpdatePlayer(player);
        return enemy;
    }
    
    public int getRoundNumber() {
        return roundNumber;
    }
    
}
