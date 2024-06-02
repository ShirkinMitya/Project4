package GUI;

import FightAction.FightActionType;
import Game.ItemType;
import Service.Manager;

public class GUI extends javax.swing.JFrame {

    Manager manager;

    public GUI() {
        initComponents();
        Mediator mediator = new Mediator();
        manager = new Manager(mediator);
        ButtonGroup.add(RadioButtonSmallPotion);
        ButtonGroup.add(RadioButtonBigPotion);
        ButtonGroup.add(RadioButtonCrossOfRebirth);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameFight = new javax.swing.JFrame();
        PaneFight = new javax.swing.JPanel();
        LabelPlayerImage = new javax.swing.JLabel();
        ButtonAttack = new javax.swing.JButton();
        ButtonProtection = new javax.swing.JButton();
        ProgressBarPlayerHealthLevel = new javax.swing.JProgressBar();
        LabelEnemyImage = new javax.swing.JLabel();
        ProgressBarEnemyHealthLevel = new javax.swing.JProgressBar();
        LabelEnemyName = new javax.swing.JLabel();
        LabelEnemyDamage = new javax.swing.JLabel();
        LabelPlayerDamage = new javax.swing.JLabel();
        LabelPlayerDamageNumber = new javax.swing.JLabel();
        LabelEnemyDamageNumber = new javax.swing.JLabel();
        LabelPlayerLevel = new javax.swing.JLabel();
        LabelFight = new javax.swing.JLabel();
        LabelPlayerHealth = new javax.swing.JLabel();
        LabelEnemyHealth = new javax.swing.JLabel();
        LabelExperience = new javax.swing.JLabel();
        LabelPoints = new javax.swing.JLabel();
        LabelExperienceNumber = new javax.swing.JLabel();
        LabelPointsNumber = new javax.swing.JLabel();
        LabelEnemyLevel = new javax.swing.JLabel();
        LabelWhoseMotion = new javax.swing.JLabel();
        LabelLastAction = new javax.swing.JLabel();
        LabelPlayerName = new javax.swing.JLabel();
        LabelStunnInfo = new javax.swing.JLabel();
        ButtonItems = new javax.swing.JButton();
        DialogRoundResult = new javax.swing.JDialog();
        PanelRoundResult = new javax.swing.JPanel();
        LabelRoundResult = new javax.swing.JLabel();
        ButtonNextInRoundResult = new javax.swing.JButton();
        DialogWinWithRecord = new javax.swing.JDialog();
        PaneWinWithRecord = new javax.swing.JPanel();
        LabelWinWithRecord = new javax.swing.JLabel();
        TextFieldNameForRecord = new javax.swing.JTextField();
        LabelWriteNameYourCharacter = new javax.swing.JLabel();
        LabelWriteNameYourCharacterSecondRow = new javax.swing.JLabel();
        ButtonFinishWithRecord = new javax.swing.JButton();
        DialogRecordTable = new javax.swing.JDialog();
        PanelRecordTable = new javax.swing.JPanel();
        LabelRecordTable = new javax.swing.JLabel();
        ScrollPaneRecordTable = new javax.swing.JScrollPane();
        TableRecord = new javax.swing.JTable();
        ButtonCloseRecordTable = new javax.swing.JButton();
        DialogWinNoRecord = new javax.swing.JDialog();
        PanelWinNoRecord = new javax.swing.JPanel();
        LabelWinNoRecord = new javax.swing.JLabel();
        LabelWinNotRecordSecondRow = new javax.swing.JLabel();
        ButtonFinishNoRecord = new javax.swing.JButton();
        DialogItemsBag = new javax.swing.JDialog();
        PanelItemsBag = new javax.swing.JPanel();
        LabelBagItems = new javax.swing.JLabel();
        RadioButtonSmallPotion = new javax.swing.JRadioButton();
        RadioButtonBigPotion = new javax.swing.JRadioButton();
        RadioButtonCrossOfRebirth = new javax.swing.JRadioButton();
        ButtonUseSelectedItem = new javax.swing.JButton();
        ButtonGroup = new javax.swing.ButtonGroup();
        DialogCantUseItem = new javax.swing.JDialog();
        PanelCantUseItem = new javax.swing.JPanel();
        LabelCantUseItem = new javax.swing.JLabel();
        LabelCantUseItemSecondRow = new javax.swing.JLabel();
        ButtonOKinWindowCantUseItem = new javax.swing.JButton();
        PanelFirstMenu = new javax.swing.JPanel();
        LabelGameName = new javax.swing.JLabel();
        ButtonStartNewGame = new javax.swing.JButton();
        ButtonShowResultTable = new javax.swing.JButton();
        LabelForMainPicture = new javax.swing.JLabel();

        PaneFight.setBackground(new java.awt.Color(255, 255, 255));

        ButtonAttack.setBackground(new java.awt.Color(255, 0, 0));
        ButtonAttack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ButtonAttack.setText("Атаковать");
        ButtonAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAttackActionPerformed(evt);
            }
        });

        ButtonProtection.setBackground(new java.awt.Color(255, 204, 0));
        ButtonProtection.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ButtonProtection.setText("Защититься");
        ButtonProtection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProtectionActionPerformed(evt);
            }
        });

        ProgressBarPlayerHealthLevel.setBackground(new java.awt.Color(204, 204, 204));
        ProgressBarPlayerHealthLevel.setForeground(new java.awt.Color(51, 255, 51));
        ProgressBarPlayerHealthLevel.setMaximum(80);
        ProgressBarPlayerHealthLevel.setMinimum(-1);

        ProgressBarEnemyHealthLevel.setBackground(new java.awt.Color(204, 204, 204));
        ProgressBarEnemyHealthLevel.setForeground(new java.awt.Color(0, 255, 0));
        ProgressBarEnemyHealthLevel.setMinimum(-1);

        LabelEnemyName.setBackground(new java.awt.Color(0, 0, 0));
        LabelEnemyName.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        LabelEnemyDamage.setBackground(new java.awt.Color(255, 255, 255));
        LabelEnemyDamage.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LabelEnemyDamage.setText("Damage");

        LabelPlayerDamage.setBackground(new java.awt.Color(255, 255, 255));
        LabelPlayerDamage.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LabelPlayerDamage.setText("Damage");

        LabelPlayerDamageNumber.setBackground(new java.awt.Color(255, 255, 255));
        LabelPlayerDamageNumber.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LabelPlayerDamageNumber.setForeground(new java.awt.Color(255, 0, 0));
        LabelPlayerDamageNumber.setText("16");

        LabelEnemyDamageNumber.setBackground(new java.awt.Color(255, 255, 255));
        LabelEnemyDamageNumber.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LabelEnemyDamageNumber.setForeground(new java.awt.Color(255, 0, 0));
        LabelEnemyDamageNumber.setText("16");

        LabelPlayerLevel.setBackground(new java.awt.Color(255, 255, 255));
        LabelPlayerLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        LabelPlayerLevel.setText("0 уровень");

        LabelFight.setBackground(new java.awt.Color(255, 255, 255));
        LabelFight.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        LabelFight.setForeground(new java.awt.Color(0, 0, 153));
        LabelFight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFight.setText("FIGHT");
        LabelFight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelPlayerHealth.setBackground(new java.awt.Color(255, 255, 255));
        LabelPlayerHealth.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelPlayerHealth.setForeground(new java.awt.Color(102, 102, 102));
        LabelPlayerHealth.setText("80/80");

        LabelEnemyHealth.setBackground(new java.awt.Color(255, 255, 255));
        LabelEnemyHealth.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelEnemyHealth.setForeground(new java.awt.Color(102, 102, 102));
        LabelEnemyHealth.setText("80/80");

        LabelExperience.setBackground(new java.awt.Color(255, 255, 255));
        LabelExperience.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LabelExperience.setForeground(new java.awt.Color(128, 92, 31));
        LabelExperience.setText("experience");

        LabelPoints.setBackground(new java.awt.Color(255, 255, 255));
        LabelPoints.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LabelPoints.setForeground(new java.awt.Color(128, 92, 31));
        LabelPoints.setText("points");

        LabelExperienceNumber.setBackground(new java.awt.Color(255, 255, 255));
        LabelExperienceNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelExperienceNumber.setForeground(new java.awt.Color(113, 90, 16));
        LabelExperienceNumber.setText("0/40");

        LabelPointsNumber.setBackground(new java.awt.Color(255, 255, 255));
        LabelPointsNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelPointsNumber.setForeground(new java.awt.Color(113, 90, 16));
        LabelPointsNumber.setText("00");

        LabelEnemyLevel.setBackground(new java.awt.Color(255, 255, 255));
        LabelEnemyLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        LabelEnemyLevel.setText("1 уровень");

        LabelWhoseMotion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        LabelWhoseMotion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LabelLastAction.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LabelLastAction.setForeground(new java.awt.Color(204, 0, 0));
        LabelLastAction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LabelPlayerName.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        LabelPlayerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPlayerName.setText("Kitana ");

        LabelStunnInfo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        LabelStunnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ButtonItems.setBackground(new java.awt.Color(174, 183, 106));
        ButtonItems.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ButtonItems.setText("Предметы");
        ButtonItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaneFightLayout = new javax.swing.GroupLayout(PaneFight);
        PaneFight.setLayout(PaneFightLayout);
        PaneFightLayout.setHorizontalGroup(
            PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneFightLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LabelEnemyHealth)
                .addGap(18, 18, 18)
                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaneFightLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelFight, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelExperience))
                        .addContainerGap())
                    .addGroup(PaneFightLayout.createSequentialGroup()
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addComponent(ProgressBarEnemyHealthLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PaneFightLayout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(LabelPoints))
                                            .addGroup(PaneFightLayout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(LabelPointsNumber)
                                                .addGap(108, 108, 108)
                                                .addComponent(LabelExperienceNumber))))
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addComponent(LabelEnemyDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelEnemyDamageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(LabelEnemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addComponent(LabelEnemyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(LabelWhoseMotion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LabelLastAction, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelStunnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneFightLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtonItems, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addComponent(LabelPlayerLevel)
                                .addGap(26, 26, 26))
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addComponent(ProgressBarPlayerHealthLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelPlayerHealth))
                                    .addGroup(PaneFightLayout.createSequentialGroup()
                                        .addComponent(LabelPlayerDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelPlayerDamageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addComponent(LabelPlayerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addComponent(LabelPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addComponent(ButtonAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(ButtonProtection, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))))
            .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaneFightLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(LabelEnemyLevel)
                    .addContainerGap(854, Short.MAX_VALUE)))
        );
        PaneFightLayout.setVerticalGroup(
            PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneFightLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(LabelFight, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PaneFightLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProgressBarPlayerHealthLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ProgressBarEnemyHealthLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(LabelPlayerHealth))
                            .addComponent(LabelEnemyHealth, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PaneFightLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelExperience)
                            .addComponent(LabelPoints))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelExperienceNumber)
                            .addComponent(LabelPointsNumber))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPlayerDamage)
                    .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelEnemyDamage)
                        .addComponent(LabelEnemyDamageNumber)
                        .addComponent(LabelPlayerDamageNumber)))
                .addGap(27, 27, 27)
                .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneFightLayout.createSequentialGroup()
                        .addComponent(LabelEnemyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelEnemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PaneFightLayout.createSequentialGroup()
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(LabelPlayerLevel)
                                .addGap(7, 7, 7)
                                .addComponent(LabelPlayerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PaneFightLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(LabelLastAction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelWhoseMotion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelStunnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(LabelPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonItems, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(ButtonAttack, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(ButtonProtection, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
            .addGroup(PaneFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaneFightLayout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(LabelEnemyLevel)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FrameFightLayout = new javax.swing.GroupLayout(FrameFight.getContentPane());
        FrameFight.getContentPane().setLayout(FrameFightLayout);
        FrameFightLayout.setHorizontalGroup(
            FrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameFightLayout.createSequentialGroup()
                .addComponent(PaneFight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrameFightLayout.setVerticalGroup(
            FrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaneFight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelRoundResult.setBackground(new java.awt.Color(179, 226, 217));

        LabelRoundResult.setBackground(new java.awt.Color(204, 204, 204));
        LabelRoundResult.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        LabelRoundResult.setForeground(new java.awt.Color(204, 0, 0));
        LabelRoundResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelRoundResult.setText("jLabel18");
        LabelRoundResult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ButtonNextInRoundResult.setBackground(new java.awt.Color(114, 218, 142));
        ButtonNextInRoundResult.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ButtonNextInRoundResult.setText("Дальше");
        ButtonNextInRoundResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextInRoundResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRoundResultLayout = new javax.swing.GroupLayout(PanelRoundResult);
        PanelRoundResult.setLayout(PanelRoundResultLayout);
        PanelRoundResultLayout.setHorizontalGroup(
            PanelRoundResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRoundResultLayout.createSequentialGroup()
                .addGroup(PanelRoundResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRoundResultLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(ButtonNextInRoundResult, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRoundResultLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(LabelRoundResult, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PanelRoundResultLayout.setVerticalGroup(
            PanelRoundResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRoundResultLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(LabelRoundResult, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(ButtonNextInRoundResult, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout DialogRoundResultLayout = new javax.swing.GroupLayout(DialogRoundResult.getContentPane());
        DialogRoundResult.getContentPane().setLayout(DialogRoundResultLayout);
        DialogRoundResultLayout.setHorizontalGroup(
            DialogRoundResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogRoundResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelRoundResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DialogRoundResultLayout.setVerticalGroup(
            DialogRoundResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogRoundResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelRoundResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PaneWinWithRecord.setBackground(new java.awt.Color(255, 204, 255));

        LabelWinWithRecord.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        LabelWinWithRecord.setForeground(new java.awt.Color(255, 0, 0));
        LabelWinWithRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelWinWithRecord.setText("Победа на вашей стороне");

        TextFieldNameForRecord.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        TextFieldNameForRecord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldNameForRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameForRecordActionPerformed(evt);
            }
        });

        LabelWriteNameYourCharacter.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelWriteNameYourCharacter.setForeground(new java.awt.Color(102, 102, 102));
        LabelWriteNameYourCharacter.setText("Введите имя своего персонажа для добавления");

        LabelWriteNameYourCharacterSecondRow.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelWriteNameYourCharacterSecondRow.setForeground(new java.awt.Color(102, 102, 102));
        LabelWriteNameYourCharacterSecondRow.setText("результата в таблицу рекордов");

        ButtonFinishWithRecord.setBackground(new java.awt.Color(153, 153, 255));
        ButtonFinishWithRecord.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ButtonFinishWithRecord.setForeground(new java.awt.Color(51, 51, 51));
        ButtonFinishWithRecord.setText("Закончить игру");
        ButtonFinishWithRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinishWithRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaneWinWithRecordLayout = new javax.swing.GroupLayout(PaneWinWithRecord);
        PaneWinWithRecord.setLayout(PaneWinWithRecordLayout);
        PaneWinWithRecordLayout.setHorizontalGroup(
            PaneWinWithRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneWinWithRecordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonFinishWithRecord)
                .addGap(14, 14, 14))
            .addGroup(PaneWinWithRecordLayout.createSequentialGroup()
                .addGroup(PaneWinWithRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneWinWithRecordLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(LabelWriteNameYourCharacterSecondRow))
                    .addGroup(PaneWinWithRecordLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LabelWinWithRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaneWinWithRecordLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(PaneWinWithRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNameForRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelWriteNameYourCharacter))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        PaneWinWithRecordLayout.setVerticalGroup(
            PaneWinWithRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneWinWithRecordLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LabelWinWithRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelWriteNameYourCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelWriteNameYourCharacterSecondRow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(TextFieldNameForRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonFinishWithRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout DialogWinWithRecordLayout = new javax.swing.GroupLayout(DialogWinWithRecord.getContentPane());
        DialogWinWithRecord.getContentPane().setLayout(DialogWinWithRecordLayout);
        DialogWinWithRecordLayout.setHorizontalGroup(
            DialogWinWithRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogWinWithRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaneWinWithRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DialogWinWithRecordLayout.setVerticalGroup(
            DialogWinWithRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogWinWithRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaneWinWithRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelRecordTable.setBackground(new java.awt.Color(204, 204, 255));

        LabelRecordTable.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LabelRecordTable.setForeground(new java.awt.Color(51, 51, 51));
        LabelRecordTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelRecordTable.setText("Таблица рекордов");

        TableRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Имя", "Количество баллов"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPaneRecordTable.setViewportView(TableRecord);

        ButtonCloseRecordTable.setBackground(new java.awt.Color(255, 255, 153));
        ButtonCloseRecordTable.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ButtonCloseRecordTable.setForeground(new java.awt.Color(51, 51, 51));
        ButtonCloseRecordTable.setText("Закрыть");
        ButtonCloseRecordTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseRecordTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRecordTableLayout = new javax.swing.GroupLayout(PanelRecordTable);
        PanelRecordTable.setLayout(PanelRecordTableLayout);
        PanelRecordTableLayout.setHorizontalGroup(
            PanelRecordTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRecordTableLayout.createSequentialGroup()
                .addGroup(PanelRecordTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonCloseRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRecordTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelRecordTableLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(LabelRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelRecordTableLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(ScrollPaneRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanelRecordTableLayout.setVerticalGroup(
            PanelRecordTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRecordTableLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCloseRecordTable, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout DialogRecordTableLayout = new javax.swing.GroupLayout(DialogRecordTable.getContentPane());
        DialogRecordTable.getContentPane().setLayout(DialogRecordTableLayout);
        DialogRecordTableLayout.setHorizontalGroup(
            DialogRecordTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRecordTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogRecordTableLayout.setVerticalGroup(
            DialogRecordTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRecordTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelWinNoRecord.setBackground(new java.awt.Color(255, 204, 255));

        LabelWinNoRecord.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        LabelWinNoRecord.setForeground(new java.awt.Color(255, 0, 0));
        LabelWinNoRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelWinNoRecord.setText("Победа на вашей стороне");

        LabelWinNotRecordSecondRow.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelWinNotRecordSecondRow.setForeground(new java.awt.Color(102, 102, 102));
        LabelWinNotRecordSecondRow.setText("К сожалению, Ваш результат не попал в топ 10");

        ButtonFinishNoRecord.setBackground(new java.awt.Color(153, 153, 255));
        ButtonFinishNoRecord.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ButtonFinishNoRecord.setForeground(new java.awt.Color(51, 51, 51));
        ButtonFinishNoRecord.setText("Закончить игру");
        ButtonFinishNoRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinishNoRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelWinNoRecordLayout = new javax.swing.GroupLayout(PanelWinNoRecord);
        PanelWinNoRecord.setLayout(PanelWinNoRecordLayout);
        PanelWinNoRecordLayout.setHorizontalGroup(
            PanelWinNoRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWinNoRecordLayout.createSequentialGroup()
                .addGroup(PanelWinNoRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWinNoRecordLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(LabelWinNoRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelWinNoRecordLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(LabelWinNotRecordSecondRow, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelWinNoRecordLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(ButtonFinishNoRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        PanelWinNoRecordLayout.setVerticalGroup(
            PanelWinNoRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWinNoRecordLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(LabelWinNoRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(LabelWinNotRecordSecondRow, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ButtonFinishNoRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogWinNoRecordLayout = new javax.swing.GroupLayout(DialogWinNoRecord.getContentPane());
        DialogWinNoRecord.getContentPane().setLayout(DialogWinNoRecordLayout);
        DialogWinNoRecordLayout.setHorizontalGroup(
            DialogWinNoRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelWinNoRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogWinNoRecordLayout.setVerticalGroup(
            DialogWinNoRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelWinNoRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelItemsBag.setBackground(new java.awt.Color(190, 182, 135));

        LabelBagItems.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        LabelBagItems.setForeground(new java.awt.Color(51, 51, 51));
        LabelBagItems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBagItems.setText("Мешок предметов");

        RadioButtonSmallPotion.setBackground(new java.awt.Color(190, 182, 135));
        RadioButtonSmallPotion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        RadioButtonSmallPotion.setText("Малое зелье лечение, 0 шт");
        RadioButtonSmallPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSmallPotionActionPerformed(evt);
            }
        });

        RadioButtonBigPotion.setBackground(new java.awt.Color(190, 182, 135));
        RadioButtonBigPotion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        RadioButtonBigPotion.setText("Большое зелье лечение, 0 шт");
        RadioButtonBigPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonBigPotionActionPerformed(evt);
            }
        });

        RadioButtonCrossOfRebirth.setBackground(new java.awt.Color(190, 182, 135));
        RadioButtonCrossOfRebirth.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        RadioButtonCrossOfRebirth.setText("Крест возрождения, 0 шт");
        RadioButtonCrossOfRebirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonCrossOfRebirthActionPerformed(evt);
            }
        });

        ButtonUseSelectedItem.setBackground(new java.awt.Color(239, 237, 14));
        ButtonUseSelectedItem.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ButtonUseSelectedItem.setText("Использовать");
        ButtonUseSelectedItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUseSelectedItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelItemsBagLayout = new javax.swing.GroupLayout(PanelItemsBag);
        PanelItemsBag.setLayout(PanelItemsBagLayout);
        PanelItemsBagLayout.setHorizontalGroup(
            PanelItemsBagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemsBagLayout.createSequentialGroup()
                .addGroup(PanelItemsBagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelItemsBagLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(PanelItemsBagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RadioButtonBigPotion)
                            .addComponent(RadioButtonCrossOfRebirth, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonSmallPotion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelBagItems, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelItemsBagLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(ButtonUseSelectedItem)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        PanelItemsBagLayout.setVerticalGroup(
            PanelItemsBagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemsBagLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LabelBagItems, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(RadioButtonSmallPotion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButtonBigPotion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButtonCrossOfRebirth)
                .addGap(50, 50, 50)
                .addComponent(ButtonUseSelectedItem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogItemsBagLayout = new javax.swing.GroupLayout(DialogItemsBag.getContentPane());
        DialogItemsBag.getContentPane().setLayout(DialogItemsBagLayout);
        DialogItemsBagLayout.setHorizontalGroup(
            DialogItemsBagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelItemsBag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogItemsBagLayout.setVerticalGroup(
            DialogItemsBagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelItemsBag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelCantUseItem.setBackground(new java.awt.Color(243, 120, 120));

        LabelCantUseItem.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LabelCantUseItem.setForeground(new java.awt.Color(51, 51, 51));
        LabelCantUseItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCantUseItem.setText("Вы не можете использовать ");

        LabelCantUseItemSecondRow.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LabelCantUseItemSecondRow.setForeground(new java.awt.Color(51, 51, 51));
        LabelCantUseItemSecondRow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCantUseItemSecondRow.setText("этот предмет");

        ButtonOKinWindowCantUseItem.setBackground(new java.awt.Color(204, 204, 204));
        ButtonOKinWindowCantUseItem.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ButtonOKinWindowCantUseItem.setForeground(new java.awt.Color(51, 51, 51));
        ButtonOKinWindowCantUseItem.setText("ОК");
        ButtonOKinWindowCantUseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKinWindowCantUseItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCantUseItemLayout = new javax.swing.GroupLayout(PanelCantUseItem);
        PanelCantUseItem.setLayout(PanelCantUseItemLayout);
        PanelCantUseItemLayout.setHorizontalGroup(
            PanelCantUseItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCantUseItemLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(PanelCantUseItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCantUseItemLayout.createSequentialGroup()
                        .addComponent(LabelCantUseItem)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCantUseItemLayout.createSequentialGroup()
                        .addComponent(LabelCantUseItemSecondRow, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(PanelCantUseItemLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(ButtonOKinWindowCantUseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelCantUseItemLayout.setVerticalGroup(
            PanelCantUseItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCantUseItemLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(LabelCantUseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCantUseItemSecondRow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(ButtonOKinWindowCantUseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout DialogCantUseItemLayout = new javax.swing.GroupLayout(DialogCantUseItem.getContentPane());
        DialogCantUseItem.getContentPane().setLayout(DialogCantUseItemLayout);
        DialogCantUseItemLayout.setHorizontalGroup(
            DialogCantUseItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCantUseItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogCantUseItemLayout.setVerticalGroup(
            DialogCantUseItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCantUseItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFirstMenu.setBackground(new java.awt.Color(255, 255, 255));

        LabelGameName.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        LabelGameName.setForeground(new java.awt.Color(204, 204, 0));
        LabelGameName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelGameName.setText("Mortal Kombat");

        ButtonStartNewGame.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ButtonStartNewGame.setText("Начать новую игру");
        ButtonStartNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartNewGameActionPerformed(evt);
            }
        });

        ButtonShowResultTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ButtonShowResultTable.setText("Посмотреть таблицу  результатов");
        ButtonShowResultTable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ButtonShowResultTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowResultTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFirstMenuLayout = new javax.swing.GroupLayout(PanelFirstMenu);
        PanelFirstMenu.setLayout(PanelFirstMenuLayout);
        PanelFirstMenuLayout.setHorizontalGroup(
            PanelFirstMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ButtonShowResultTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(ButtonStartNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(PanelFirstMenuLayout.createSequentialGroup()
                .addGroup(PanelFirstMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFirstMenuLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(LabelGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFirstMenuLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(LabelForMainPicture)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFirstMenuLayout.setVerticalGroup(
            PanelFirstMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstMenuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LabelGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelForMainPicture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(PanelFirstMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonShowResultTable, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonStartNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFirstMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFirstMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonStartNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartNewGameActionPerformed
        FrameFight.setVisible(rootPaneCheckingEnabled);
        FrameFight.setSize(1000, 700);
        manager.NewGame();
    }//GEN-LAST:event_ButtonStartNewGameActionPerformed

    private void ButtonAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAttackActionPerformed
        manager.Hit(FightActionType.ATTACK);
    }//GEN-LAST:event_ButtonAttackActionPerformed

    private void ButtonProtectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProtectionActionPerformed
        manager.Hit(FightActionType.DEFEND);
    }//GEN-LAST:event_ButtonProtectionActionPerformed

    private void ButtonNextInRoundResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextInRoundResultActionPerformed
        manager.NewRound();
        DialogRoundResult.dispose();
    }//GEN-LAST:event_ButtonNextInRoundResultActionPerformed

    private void TextFieldNameForRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameForRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameForRecordActionPerformed

    private void ButtonFinishWithRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinishWithRecordActionPerformed
        manager.EndGameWithRecord(TextFieldNameForRecord.getText());
        DialogWinWithRecord.dispose();
        TextFieldNameForRecord.setText("");
    }//GEN-LAST:event_ButtonFinishWithRecordActionPerformed

    private void ButtonCloseRecordTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCloseRecordTableActionPerformed
        DialogRecordTable.dispose();
    }//GEN-LAST:event_ButtonCloseRecordTableActionPerformed

    private void ButtonShowResultTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowResultTableActionPerformed
        DialogRecordTable.setVisible(true);
        DialogRecordTable.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_ButtonShowResultTableActionPerformed

    private void ButtonFinishNoRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinishNoRecordActionPerformed
        DialogWinNoRecord.dispose();
    }//GEN-LAST:event_ButtonFinishNoRecordActionPerformed

    private void RadioButtonSmallPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSmallPotionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonSmallPotionActionPerformed

    private void RadioButtonBigPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonBigPotionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonBigPotionActionPerformed

    private void ButtonUseSelectedItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUseSelectedItemActionPerformed
        if (RadioButtonSmallPotion.isSelected()) {
            manager.UseItem(ItemType.SMALL_POTION);
        }
        if (RadioButtonBigPotion.isSelected()) {
            manager.UseItem(ItemType.BIG_POTION);
        }
        if (RadioButtonCrossOfRebirth.isSelected()) {
            manager.UseItem(ItemType.CROSS_REBIRTH);
        }
    }//GEN-LAST:event_ButtonUseSelectedItemActionPerformed

    private void ButtonItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonItemsActionPerformed
        DialogItemsBag.setVisible(true);
        DialogItemsBag.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_ButtonItemsActionPerformed

    private void ButtonOKinWindowCantUseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKinWindowCantUseItemActionPerformed
        DialogCantUseItem.dispose();
    }//GEN-LAST:event_ButtonOKinWindowCantUseItemActionPerformed

    private void RadioButtonCrossOfRebirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonCrossOfRebirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonCrossOfRebirthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAttack;
    private javax.swing.JButton ButtonCloseRecordTable;
    private javax.swing.JButton ButtonFinishNoRecord;
    private javax.swing.JButton ButtonFinishWithRecord;
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JButton ButtonItems;
    private javax.swing.JButton ButtonNextInRoundResult;
    private javax.swing.JButton ButtonOKinWindowCantUseItem;
    private javax.swing.JButton ButtonProtection;
    private javax.swing.JButton ButtonShowResultTable;
    private javax.swing.JButton ButtonStartNewGame;
    private javax.swing.JButton ButtonUseSelectedItem;
    private javax.swing.JDialog DialogCantUseItem;
    private javax.swing.JDialog DialogItemsBag;
    private javax.swing.JDialog DialogRecordTable;
    private javax.swing.JDialog DialogRoundResult;
    private javax.swing.JDialog DialogWinNoRecord;
    private javax.swing.JDialog DialogWinWithRecord;
    private javax.swing.JFrame FrameFight;
    private javax.swing.JLabel LabelBagItems;
    private javax.swing.JLabel LabelCantUseItem;
    private javax.swing.JLabel LabelCantUseItemSecondRow;
    private javax.swing.JLabel LabelEnemyDamage;
    private javax.swing.JLabel LabelEnemyDamageNumber;
    private javax.swing.JLabel LabelEnemyHealth;
    private javax.swing.JLabel LabelEnemyImage;
    private javax.swing.JLabel LabelEnemyLevel;
    private javax.swing.JLabel LabelEnemyName;
    private javax.swing.JLabel LabelExperience;
    private javax.swing.JLabel LabelExperienceNumber;
    private javax.swing.JLabel LabelFight;
    private javax.swing.JLabel LabelForMainPicture;
    private javax.swing.JLabel LabelGameName;
    private javax.swing.JLabel LabelLastAction;
    private javax.swing.JLabel LabelPlayerDamage;
    private javax.swing.JLabel LabelPlayerDamageNumber;
    private javax.swing.JLabel LabelPlayerHealth;
    private javax.swing.JLabel LabelPlayerImage;
    private javax.swing.JLabel LabelPlayerLevel;
    private javax.swing.JLabel LabelPlayerName;
    private javax.swing.JLabel LabelPoints;
    private javax.swing.JLabel LabelPointsNumber;
    private javax.swing.JLabel LabelRecordTable;
    private javax.swing.JLabel LabelRoundResult;
    private javax.swing.JLabel LabelStunnInfo;
    private javax.swing.JLabel LabelWhoseMotion;
    private javax.swing.JLabel LabelWinNoRecord;
    private javax.swing.JLabel LabelWinNotRecordSecondRow;
    private javax.swing.JLabel LabelWinWithRecord;
    private javax.swing.JLabel LabelWriteNameYourCharacter;
    private javax.swing.JLabel LabelWriteNameYourCharacterSecondRow;
    private javax.swing.JPanel PaneFight;
    private javax.swing.JPanel PaneWinWithRecord;
    private javax.swing.JPanel PanelCantUseItem;
    private javax.swing.JPanel PanelFirstMenu;
    private javax.swing.JPanel PanelItemsBag;
    private javax.swing.JPanel PanelRecordTable;
    private javax.swing.JPanel PanelRoundResult;
    private javax.swing.JPanel PanelWinNoRecord;
    private javax.swing.JProgressBar ProgressBarEnemyHealthLevel;
    private javax.swing.JProgressBar ProgressBarPlayerHealthLevel;
    private javax.swing.JRadioButton RadioButtonBigPotion;
    private javax.swing.JRadioButton RadioButtonCrossOfRebirth;
    private javax.swing.JRadioButton RadioButtonSmallPotion;
    private javax.swing.JScrollPane ScrollPaneRecordTable;
    private javax.swing.JTable TableRecord;
    private javax.swing.JTextField TextFieldNameForRecord;
    // End of variables declaration//GEN-END:variables
}
