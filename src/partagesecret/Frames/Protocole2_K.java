package partagesecret.Frames;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import partagesecret.managers.SimpleManager;
import partagesecret.managers.StringManager;
import partagesecret.managers.protocole2.Repartition;

public class Protocole2_K extends javax.swing.JFrame {

    private StringManager stringMan = new StringManager();
    private Repartition rep = new Repartition();

    public Protocole2_K() {
        initComponents();
        this.setTitle("Procole 2 - Clés");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Key_2.setLineWrap(true);
        Key_2.setWrapStyleWord(true);
        Key_1.setLineWrap(true);
        Key_1.setWrapStyleWord(true);
        secretDec.setLineWrap(true);
        secretDec.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secretString = new javax.swing.JTextField();
        Convert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Key_1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Key_2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        createKeys = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        secretDec = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Convert.setText("Convertir");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(190, 80));

        Key_1.setEditable(false);
        Key_1.setColumns(20);
        Key_1.setRows(5);
        jScrollPane2.setViewportView(Key_1);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(190, 80));

        Key_2.setEditable(false);
        Key_2.setColumns(20);
        Key_2.setRows(5);
        jScrollPane1.setViewportView(Key_2);

        jLabel1.setText("Clé 1 :");

        jLabel2.setText("Clé 2 :");

        jLabel3.setText("Entrer le Secret");

        createKeys.setText("--> Clés");
        createKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createKeysActionPerformed(evt);
            }
        });

        jScrollPane3.setPreferredSize(new java.awt.Dimension(190, 80));

        secretDec.setEditable(false);
        secretDec.setColumns(20);
        secretDec.setRows(5);
        jScrollPane3.setViewportView(secretDec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secretString, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Convert)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(createKeys)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(159, 159, 159)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(159, 159, 159)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(secretString, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Convert)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(createKeys)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        if(!this.secretString.getText().equals("")){
            if(this.secretString.getText().length() <= 5){
                this.secretDec.setText(""+stringMan.BinaryToDecimal(stringMan.StringToBinary(this.secretString.getText())));   
            }   else {
                javax.swing.JOptionPane.showMessageDialog(this, "Le secret doit être < à 5 caractères", "Erreur", JOptionPane.ERROR_MESSAGE);
            }                       
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer un secret", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ConvertActionPerformed

    private void createKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createKeysActionPerformed
        if(!this.secretDec.getText().equals("")){
            ArrayList<Long> keys = this.rep.getKeys(Long.parseLong(this.secretDec.getText().trim()));
            this.Key_1.setText(""+keys.get(0)+" "+keys.get(1));
            this.Key_2.setText(""+keys.get(2)+" "+keys.get(3));           
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer et de convertir un secret", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_createKeysActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JTextArea Key_1;
    private javax.swing.JTextArea Key_2;
    private javax.swing.JButton createKeys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea secretDec;
    private javax.swing.JTextField secretString;
    // End of variables declaration//GEN-END:variables
}
