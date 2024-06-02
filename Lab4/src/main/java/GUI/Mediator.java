package GUI;

import Game.Items;
import Character.Player;
import Character.Enemy;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Mediator {

    private JButton ButtonAttack;
    private JButton ButtonCloseRecordTable;
    private JButton ButtonFinishNoRecord;
    private JButton ButtonFinishWithRecord;
    private JButton ButtonItems;
    private JButton ButtonNextInRoundResult;
    private JButton ButtonOKinWindowCantUseItem;
    private JButton ButtonProtection;
    private JButton ButtonShowResultTable;
    private JButton ButtonStartNewGame;
    private JButton ButtonUseSelectedItem;
    private JDialog DialogCantUseItem;
    private JDialog DialogItemsBag;
    private JDialog DialogRecordTable;
    private JDialog DialogRoundResult;
    private JDialog DialogWinNoRecord;
    private JDialog DialogWinWithRecord;
    private JFrame FrameFight;
    private JLabel LabelBagItems;
    private JLabel LabelCantUseItem;
    private JLabel LabelCantUseItemSecondRow;
    private JLabel LabelEnemyDamage;
    private JLabel LabelEnemyDamageNumber;
    private JLabel LabelEnemyHealth;
    private JLabel LabelEnemyImage;
    private JLabel LabelEnemyLevel;
    private JLabel LabelEnemyName;
    private JLabel LabelExperience;
    private JLabel LabelExperienceNumber;
    private JLabel LabelFight;
    private JLabel LabelForMainPicture;
    private JLabel LabelGameName;
    private JLabel LabelLastAction;
    private JLabel LabelPlayerDamage;
    private JLabel LabelPlayerDamageNumber;
    private JLabel LabelPlayerHealth;
    private JLabel LabelPlayerImage;
    private JLabel LabelPlayerLevel;
    private JLabel LabelPlayerName;
    private JLabel LabelPoints;
    private JLabel LabelPointsNumber;
    private JLabel LabelRecordTable;
    private JLabel LabelStunnInfo;
    private JLabel LabelWhoseMotion;
    private JLabel LabelWinNoRecord;
    private JLabel LabelWinNotRecordSecondRow;
    private JLabel LabelWinWithRecord;
    private JLabel LabelWriteNameYourCharacter;
    private JLabel LabelWriteNameYourCharacterSecondRow;
    private JPanel PaneFight;
    private JPanel PaneWinWithRecord;
    private JPanel PanelCantUseItem;
    private JPanel PanelFirstMenu;
    private JPanel PanelItemsBag;
    private JPanel PanelRecordTable;
    private JPanel PanelRoundResult;
    private JPanel PanelWinNoRecord;
    private JProgressBar ProgressBarEnemyHealthLevel;
    private JProgressBar ProgressBarPlayerHealthLevel;
    private JRadioButton RadioButtonBigPotion;
    private JRadioButton RadioButtonCrossOfRebirth;
    private JRadioButton RadioButtonSmallPotion;
    private JScrollPane ScrollPaneRecordTable;
    private JTable TableRecord;
    private JTextField TextFieldNameForRecord;
    private ButtonGroup buttonGroup1;
    private JLabel LabelRoundResult;

    public void UpdatePlayer(Player player) {
        ProgressBarPlayerHealthLevel.setMaximum(player.getMaxHealth());
        ProgressBarEnemyHealthLevel.setValue(player.getHealth());
        LabelPointsNumber.setText(Integer.toString(player.getPoints()));
        LabelExperienceNumber.setText((player.getExperience() + "/" + player.getNextExperience()));
        LabelPlayerLevel.setText(player.getLevel() + " level");
        LabelPlayerHealth.setText(player.getMaxHealth() + "/" + player.getMaxHealth());
        LabelPlayerDamageNumber.setText(Integer.toString(player.getDamage()));
    }

    public void UpdateEnemy(Enemy enemy) {
        ProgressBarEnemyHealthLevel.setMaximum(enemy.getMaxHealth());
        ProgressBarEnemyHealthLevel.setValue(enemy.getHealth());
        LabelEnemyName.setText(enemy.getName());
        LabelEnemyDamageNumber.setText(Integer.toString(enemy.getDamage()));
        LabelEnemyHealth.setText(enemy.getHealth() + "/" + enemy.getMaxHealth());
        ImageIcon icon = new ImageIcon(enemy.getImagePath());
        LabelGameName.setIcon(icon);
        LabelEnemyLevel.setText(enemy.getLevel() + " level");
    }

    public void UpdateRecordTable(DefaultTableModel model) {
        TableRecord.setModel(model);
    }

    public void UpdateNewRound(Player player, Enemy enemy, int round, Items[] itoms) {
        UpdatePlayer(player);
        UpdateEnemy(enemy);
        BagText(itoms);
        if (round % 2 == 1) {
            LabelWhoseMotion.setText("Your turn");
        } else {
            LabelWhoseMotion.setText(enemy.getName() + "'s turn");
        }
        //jLabel9.setText("");
    }

    public void BagText(Items[] items) {
        RadioButtonSmallPotion.setText(items[0].getName() + ", " + items[0].getCount() + " шт");
        RadioButtonBigPotion.setText(items[1].getName() + ", " + items[1].getCount() + " шт");
        RadioButtonCrossOfRebirth.setText(items[2].getName() + ", " + items[2].getCount() + " шт");
    }

    public void MoveInfo(String lastAction, String stunnInfo) {
        LabelLastAction.setText(lastAction);
        LabelStunnInfo.setText(stunnInfo);
    }

    public void Respawn() {
        LabelStunnInfo.setText("Вы воскресли");
    }

    public void EndRoundInfo(String resultText) {
        DialogRoundResult.setVisible(true);
        DialogRoundResult.setBounds(300, 150, 700, 600);
        LabelRoundResult.setText("You win");
    }

    public void EndFinalRoundInfo(String text, boolean ifRecord) {
        if (ifRecord) {
            DialogWinWithRecord.setVisible(true);
            DialogWinWithRecord.setBounds(150, 150, 600, 500);
            LabelWinWithRecord.setText(text);
        } else {
            DialogWinNoRecord.setVisible(true);
            DialogWinNoRecord.setBounds(150, 150, 470, 360);
            LabelWinNoRecord.setText(text);
        }
        FrameFight.dispose();
    }

    public void CloseItems() {
        DialogItemsBag.dispose();
    }

    public void CannotUseUtem() {
        DialogCantUseItem.setVisible(true);
        DialogCantUseItem.setBounds(300, 200, 400, 300);
    }
}
