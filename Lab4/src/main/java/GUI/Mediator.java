package GUI;

import Game.Items;
import Character.Player;
import Character.Enemy;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mediator {

    private JDialog DialogCantUseItem;
    private JDialog DialogItemsBag;
    private JDialog DialogRoundResult;
    private JDialog DialogWinNoRecord;
    private JDialog DialogWinWithRecord;
    private JDialog DialogLevelUP;
    private JFrame FrameFight;
    private JLabel LabelEnemyDamageNumber;
    private JLabel LabelEnemyHealth;
    private JLabel LabelEnemyLevel;
    private JLabel LabelEnemyName;
    private JLabel LabelExperienceNumber;
    private JLabel LabelGameName;
    private JLabel LabelLastAction;
    private JLabel LabelPlayerDamageNumber;
    private JLabel LabelPlayerHealth;
    private JLabel LabelPlayerLevel;
    private JLabel LabelPointsNumber;
    private JLabel LabelStunnInfo;
    private JLabel LabelWhoseMotion;
    private JLabel LabelWinNoRecord;
    private JLabel LabelWinWithRecord;
    private JProgressBar ProgressBarEnemyHealthLevel;
    private JProgressBar ProgressBarPlayerHealthLevel;
    private JRadioButton RadioButtonBigPotion;
    private JRadioButton RadioButtonCrossOfRebirth;
    private JRadioButton RadioButtonSmallPotion;
    private JTable TableRecord;
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

    public void MoveInfo(String lastAction, String stunInfo) {
        LabelLastAction.setText(lastAction);
        LabelStunnInfo.setText(stunInfo);
    }

    public void Respawn() {
        LabelStunnInfo.setText("Вы воскресли");
    }

    public void EndRoundInfo(String resultText) {
        DialogRoundResult.setVisible(true);
        DialogRoundResult.setBounds(300, 150, 700, 600);
        LabelRoundResult.setText(resultText);
    }
    
    public void EndRoubdLevelUpInfo(){
        DialogLevelUP.setVisible(true);
        DialogLevelUP.setBounds(300, 150, 700, 600);
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
    
    
    
    
     public void setDialogCantUseItem(JDialog DialogCantUseItem) {
        this.DialogCantUseItem = DialogCantUseItem;
    }

    public void setDialogItemsBag(JDialog DialogItemsBag) {
        this.DialogItemsBag = DialogItemsBag;
    }

    public void setDialogRoundResult(JDialog DialogRoundResult) {
        this.DialogRoundResult = DialogRoundResult;
    }

    public void setDialogWinNoRecord(JDialog DialogWinNoRecord) {
        this.DialogWinNoRecord = DialogWinNoRecord;
    }

    public void setDialogWinWithRecord(JDialog DialogWinWithRecord) {
        this.DialogWinWithRecord = DialogWinWithRecord;
    }
    
    public void setDialogLevelUP(JDialog DialogLevelUP) {
        this.DialogLevelUP = DialogLevelUP;
    }

    public void setFrameFight(JFrame FrameFight) {
        this.FrameFight = FrameFight;
    }

    public void setLabelEnemyDamageNumber(JLabel LabelEnemyDamageNumber) {
        this.LabelEnemyDamageNumber = LabelEnemyDamageNumber;
    }

    public void setLabelEnemyHealth(JLabel LabelEnemyHealth) {
        this.LabelEnemyHealth = LabelEnemyHealth;
    }

    public void setLabelEnemyLevel(JLabel LabelEnemyLevel) {
        this.LabelEnemyLevel = LabelEnemyLevel;
    }

    public void setLabelEnemyName(JLabel LabelEnemyName) {
        this.LabelEnemyName = LabelEnemyName;
    }

    public void setLabelExperienceNumber(JLabel LabelExperienceNumber) {
        this.LabelExperienceNumber = LabelExperienceNumber;
    }

    public void setLabelGameName(JLabel LabelGameName) {
        this.LabelGameName = LabelGameName;
    }

    public void setLabelLastAction(JLabel LabelLastAction) {
        this.LabelLastAction = LabelLastAction;
    }

    public void setLabelPlayerDamageNumber(JLabel LabelPlayerDamageNumber) {
        this.LabelPlayerDamageNumber = LabelPlayerDamageNumber;
    }

    public void setLabelPlayerHealth(JLabel LabelPlayerHealth) {
        this.LabelPlayerHealth = LabelPlayerHealth;
    }

    public void setLabelPlayerLevel(JLabel LabelPlayerLevel) {
        this.LabelPlayerLevel = LabelPlayerLevel;
    }

    public void setLabelPointsNumber(JLabel LabelPointsNumber) {
        this.LabelPointsNumber = LabelPointsNumber;
    }

    public void setLabelStunnInfo(JLabel LabelStunnInfo) {
        this.LabelStunnInfo = LabelStunnInfo;
    }

    public void setLabelWhoseMotion(JLabel LabelWhoseMotion) {
        this.LabelWhoseMotion = LabelWhoseMotion;
    }

    public void setLabelWinNoRecord(JLabel LabelWinNoRecord) {
        this.LabelWinNoRecord = LabelWinNoRecord;
    }

    public void setLabelWinWithRecord(JLabel LabelWinWithRecord) {
        this.LabelWinWithRecord = LabelWinWithRecord;
    }

    public void setProgressBarEnemyHealthLevel(JProgressBar ProgressBarEnemyHealthLevel) {
        this.ProgressBarEnemyHealthLevel = ProgressBarEnemyHealthLevel;
    }

    public void setProgressBarPlayerHealthLevel(JProgressBar ProgressBarPlayerHealthLevel) {
        this.ProgressBarPlayerHealthLevel = ProgressBarPlayerHealthLevel;
    }

    public void setRadioButtonBigPotion(JRadioButton RadioButtonBigPotion) {
        this.RadioButtonBigPotion = RadioButtonBigPotion;
    }

    public void setRadioButtonCrossOfRebirth(JRadioButton RadioButtonCrossOfRebirth) {
        this.RadioButtonCrossOfRebirth = RadioButtonCrossOfRebirth;
    }

    public void setRadioButtonSmallPotion(JRadioButton RadioButtonSmallPotion) {
        this.RadioButtonSmallPotion = RadioButtonSmallPotion;
    }

    public void setTableRecord(JTable TableRecord) {
        this.TableRecord = TableRecord;
    }

    public void setLabelRoundResult(JLabel LabelRoundResult) {
        this.LabelRoundResult = LabelRoundResult;
    }
}
