package partagesecret.Frames;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import partagesecret.managers.AdvancedManager;
import partagesecret.managers.SimpleManager;
import partagesecret.managers.StringManager;

public class Protocole1_Q extends javax.swing.JFrame {

    private AdvancedManager advancedMan = new AdvancedManager();
    private StringManager stringMan = new StringManager();
    
    private ArrayList<JCheckBox> checkboxes = new ArrayList<>();

    public Protocole1_Q() {
        initComponents();
        this.setTitle("Procole 1 - Question 1");
        
        for( Component comp : this.cb_Panel.getComponents() ) {
            if( comp instanceof JCheckBox ) checkboxes.add( (JCheckBox)comp );
        }      
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secretBin.setLineWrap(true);
        secretBin.setWrapStyleWord(true);
        secretBinKeys.setLineWrap(true);
        secretBinKeys.setWrapStyleWord(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secretString = new javax.swing.JTextField();
        Convert = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        getKey_1 = new javax.swing.JButton();
        getKey_2 = new javax.swing.JButton();
        getKey_3 = new javax.swing.JButton();
        getKey_4 = new javax.swing.JButton();
        getKey_5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        secretBin = new javax.swing.JTextArea();
        totalKeys = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_Panel = new javax.swing.JPanel();
        checkBox_1 = new javax.swing.JCheckBox();
        checkBox_2 = new javax.swing.JCheckBox();
        checkBox_3 = new javax.swing.JCheckBox();
        checkBox_4 = new javax.swing.JCheckBox();
        checkBox_5 = new javax.swing.JCheckBox();
        labelIcon = new javax.swing.JLabel();
        rebuild = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        secretBinKeys = new javax.swing.JTextArea();
        convertF = new javax.swing.JButton();
        secretStringF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Convert.setText("Convertir");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        jLabel3.setText("Entrer le Secret");

        getKey_1.setText("Clés de 1");
        getKey_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getKey_1ActionPerformed(evt);
            }
        });

        getKey_2.setText("Clés de 2");
        getKey_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getKey_2ActionPerformed(evt);
            }
        });

        getKey_3.setText("Clés de 3");
        getKey_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getKey_3ActionPerformed(evt);
            }
        });

        getKey_4.setText("Clés de 4");
        getKey_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getKey_4ActionPerformed(evt);
            }
        });

        getKey_5.setText("Clés de 5");
        getKey_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getKey_5ActionPerformed(evt);
            }
        });

        jScrollPane3.setPreferredSize(new java.awt.Dimension(190, 80));

        secretBin.setEditable(false);
        secretBin.setColumns(20);
        secretBin.setRows(5);
        jScrollPane3.setViewportView(secretBin);

        totalKeys.setEditable(false);

        jLabel4.setText("Total Clés Cochées :");

        checkBox_1.setName("1"); // NOI18N
        checkBox_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_1ActionPerformed(evt);
            }
        });

        checkBox_2.setName("2"); // NOI18N
        checkBox_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_2ActionPerformed(evt);
            }
        });

        checkBox_3.setName("3"); // NOI18N
        checkBox_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_3ActionPerformed(evt);
            }
        });

        checkBox_4.setName("4"); // NOI18N
        checkBox_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_4ActionPerformed(evt);
            }
        });

        checkBox_5.setName("5"); // NOI18N
        checkBox_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cb_PanelLayout = new javax.swing.GroupLayout(cb_Panel);
        cb_Panel.setLayout(cb_PanelLayout);
        cb_PanelLayout.setHorizontalGroup(
            cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cb_PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(checkBox_1)
                .addGap(76, 76, 76)
                .addComponent(checkBox_2)
                .addGap(74, 74, 74)
                .addComponent(checkBox_3)
                .addGap(77, 77, 77)
                .addComponent(checkBox_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkBox_5)
                .addGap(39, 39, 39))
        );
        cb_PanelLayout.setVerticalGroup(
            cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cb_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(checkBox_1)
                        .addComponent(checkBox_3))
                    .addComponent(checkBox_4)
                    .addComponent(checkBox_5)
                    .addComponent(checkBox_2))
                .addContainerGap())
        );

        rebuild.setText("Reconstitution");
        rebuild.setEnabled(false);
        rebuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rebuildActionPerformed(evt);
            }
        });

        jScrollPane4.setPreferredSize(new java.awt.Dimension(190, 80));

        secretBinKeys.setEditable(false);
        secretBinKeys.setColumns(20);
        secretBinKeys.setRows(5);
        jScrollPane4.setViewportView(secretBinKeys);

        convertF.setText("Convertir");
        convertF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertFActionPerformed(evt);
            }
        });

        secretStringF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cb_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(secretString, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Convert)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(getKey_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getKey_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getKey_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getKey_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getKey_5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalKeys, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelIcon)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(rebuild))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(convertF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secretStringF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getKey_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(getKey_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(secretString, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Convert)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getKey_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getKey_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getKey_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalKeys, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rebuild, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(convertF)
                            .addComponent(secretStringF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        if(!this.secretString.getText().equals("")){
            reset();
            this.secretBin.setText(this.stringMan.stringToBin(this.secretString.getText()));            
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ConvertActionPerformed

    private void getKey_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getKey_2ActionPerformed
        
        showKeys(2);
    }//GEN-LAST:event_getKey_2ActionPerformed

    private void getKey_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getKey_1ActionPerformed
        showKeys(1);
    }//GEN-LAST:event_getKey_1ActionPerformed

    private void getKey_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getKey_3ActionPerformed
        showKeys(3);
    }//GEN-LAST:event_getKey_3ActionPerformed

    private void getKey_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getKey_4ActionPerformed
        showKeys(4);
    }//GEN-LAST:event_getKey_4ActionPerformed

    private void getKey_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getKey_5ActionPerformed
        showKeys(5);
    }//GEN-LAST:event_getKey_5ActionPerformed

    private void checkBox_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_1ActionPerformed
        if(!this.secretBin.getText().equals("")){
            updateTotalKey();
        } else {
            this.checkBox_1.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkBox_1ActionPerformed

    private void checkBox_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_2ActionPerformed
        if(!this.secretBin.getText().equals("")){
            updateTotalKey();      
        } else {
            this.checkBox_2.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkBox_2ActionPerformed

    private void checkBox_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_3ActionPerformed
        if(!this.secretBin.getText().equals("")){
            updateTotalKey();      
        } else {
            this.checkBox_3.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkBox_3ActionPerformed

    private void checkBox_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_4ActionPerformed
        if(!this.secretBin.getText().equals("")){
            updateTotalKey();      
        } else {
            this.checkBox_4.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkBox_4ActionPerformed

    private void checkBox_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_5ActionPerformed
        if(!this.secretBin.getText().equals("")){
            updateTotalKey();      
        } else {
            this.checkBox_5.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkBox_5ActionPerformed

    private void rebuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rebuildActionPerformed
        if(!this.secretBin.getText().equals("")){
            ArrayList<HashMap<String,String>> selected = new ArrayList<>();
            for(JCheckBox cb : this.checkboxes){
                if(cb.isSelected()){
                    selected.add(advancedMan.getKeysFromBin(this.secretBin.getText())[Integer.parseInt(cb.getName())-1]);
                }   
            }
            if(selected.size() == 3){
                this.secretBinKeys.setText(this.advancedMan.keysToBin(selected.get(0), selected.get(1), selected.get(2)));            
            }
        } else {
            this.checkBox_5.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_rebuildActionPerformed

    private void convertFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertFActionPerformed
        if(!this.secretBinKeys.getText().equals("")){
            this.secretStringF.setText(this.stringMan.binToString(this.secretBinKeys.getText()));
        } else {
            this.checkBox_5.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_convertFActionPerformed

    public void showKeys(Integer i){
        if(!this.secretBin.getText().equals("")){
            HashMap<String,String> keys = advancedMan.getKeysFromBin(this.secretBin.getText())[i-1];
            String keysString = "";
            for(String key : keys.keySet()){
                keysString += key + " : " + keys.get(key) + "\n";
            }
            javax.swing.JOptionPane.showMessageDialog(null, keysString, "Clés de "+i, JOptionPane.INFORMATION_MESSAGE);         
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret et de le convertir", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void reset(){
        for(JCheckBox cb : this.checkboxes){
            cb.setSelected(false);
            this.updateTotalKey();
        }        
    }
    
    public void updateTotalKey(){        
        HashMap<String,String> keys = new HashMap<>();
        
        for(JCheckBox cb : this.checkboxes){
            if(cb.isSelected()){
                keys.putAll(advancedMan.getKeysFromBin(this.secretBin.getText())[Integer.parseInt(cb.getName())-1]);
            }   
        }
        
        String allLetters = "";
        for(String str : keys.keySet()){
            allLetters += str;
        }
        
        this.totalKeys.setText(allLetters);    
        
        if(allLetters.length() == 10){
            this.labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ok.png")));
            this.rebuild.setEnabled(true);
        } else {
            this.rebuild.setEnabled(false);
            this.labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/notok.png")));            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JPanel cb_Panel;
    private javax.swing.JCheckBox checkBox_1;
    private javax.swing.JCheckBox checkBox_2;
    private javax.swing.JCheckBox checkBox_3;
    private javax.swing.JCheckBox checkBox_4;
    private javax.swing.JCheckBox checkBox_5;
    private javax.swing.JButton convertF;
    private javax.swing.JButton getKey_1;
    private javax.swing.JButton getKey_2;
    private javax.swing.JButton getKey_3;
    private javax.swing.JButton getKey_4;
    private javax.swing.JButton getKey_5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JButton rebuild;
    private javax.swing.JTextArea secretBin;
    private javax.swing.JTextArea secretBinKeys;
    private javax.swing.JTextField secretString;
    private javax.swing.JTextField secretStringF;
    private javax.swing.JTextField totalKeys;
    // End of variables declaration//GEN-END:variables
}
