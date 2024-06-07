package Service;

import GUI.Mediator;
import Game.CharacterAction;
import Game.Fight;
import Game.Items;
import Character.Player;
import Character.Enemy;
import FightAction.FightActionType;
import Game.ItemType;
import java.io.IOException;

public class Manager {

    Fight fight;
    Enemy enemy;
    Mediator mediator;
    Player player;
    CharacterAction characterAction;
    Items[] items = new Items[3];
    ResultsManager resultsManager = new ResultsManager();

    public Manager(Mediator mediator) {
        this.mediator = mediator;
        this.fight = new Fight(mediator);
        try {
            resultsManager.ReadFromExcel();
        } catch (IOException ex) {
            System.out.println(" Oшибка при чтении Excel " + ex.getMessage());
        }
        mediator.UpdateRecordTable(resultsManager.CreateTableModel());
        items[0] = new Items("Малое зелье лечение", 0);
        items[1] = new Items("Большое зелье лечение", 0);
        items[2] = new Items("Крест возрождения", 0);
    }

    public void NewGame(int numberOfLocations) {
        characterAction = new CharacterAction(mediator, numberOfLocations);
        player = new Player(0, 80, 16);
        enemy = characterAction.ChooseEnemy(player);
        mediator.UpdateNewRound(player, enemy, fight.getRoundNumber(), items);
    }

    public void Hit(FightActionType fightActionType) {
        fight.Hit(player, enemy, fightActionType, characterAction, resultsManager.getResults(), items);
    }

    public void NewRound() {
        enemy = fight.NewRound(player, characterAction);
        mediator.UpdateNewRound(player, enemy, 0, items);
    }

    public void HealthIfLevelUp() {
        player.addMaxHealth(20);
        NewRound();
    }

    public void DamageIfLevelUp() {
        player.addDamage(5);
        NewRound();
    }

    public void EndGameWithRecord(String text) {
        try {
            mediator.UpdateRecordTable(resultsManager.EndGameTop(player, text));
        } catch (IOException e) {
            System.out.println("Oшибка" + e.getMessage());
        }
    }

    public void UseItem(ItemType itemType) {
        characterAction.UseItem(player, items, itemType);
        mediator.UpdatePlayer(player);
    }

}
