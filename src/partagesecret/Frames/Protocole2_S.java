package partagesecret.Frames;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import partagesecret.managers.SimpleManager;
import partagesecret.managers.StringManager;
import partagesecret.managers.protocole2.Resolution;

public class Protocole2_S extends javax.swing.JFrame {

    private Resolution resolution = new Resolution();
    private StringManager stringMan = new StringManager();
   
    public Protocole2_S() {
        initComponents();
        this.setTitle("Procole 2 - Secret");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        key.setLineWrap(true);
        key.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        key_1_lab = new javax.swing.JLabel();
        key_1 = new javax.swing.JTextField();
        key_2_lab = new javax.swing.JLabel();
        key_2 = new javax.swing.JTextField();
        rebuild = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        key = new javax.swing.JTextArea();
        Convert = new javax.swing.JButton();
        secretString = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        key_1_lab.setText("Clé 1");

        key_2_lab.setText("Clé 2");

        rebuild.setText("--> Reconstituer");
        rebuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rebuildActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(190, 80));

        key.setEditable(false);
        key.setColumns(20);
        key.setRows(5);
        jScrollPane2.setViewportView(key);

        Convert.setText("Convertir");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        secretString.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(key_1_lab)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(key_2_lab)
                                .addGap(157, 157, 157)
                                .addComponent(rebuild))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(key_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(key_2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Convert)
                                .addGap(59, 59, 59))
                            .addComponent(secretString, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(key_1_lab)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Convert)
                        .addGap(18, 18, 18)
                        .addComponent(secretString, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(key_2_lab)
                            .addComponent(rebuild))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rebuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rebuildActionPerformed
        if(!(this.key_2.getText().equals("")) && !(this.key_1.getText().equals(""))){
            ArrayList<Long> keys = new ArrayList<>();
            keys.add(Long.parseLong(this.key_1.getText().split(" ")[0]));
            keys.add(Long.parseLong(this.key_1.getText().split(" ")[1]));
            keys.add(Long.parseLong(this.key_2.getText().split(" ")[0]));
            keys.add(Long.parseLong(this.key_2.getText().split(" ")[1]));
            this.key.setText(""+resolution.getDecFromKeys(keys));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer les deux clés", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rebuildActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        if(!this.key.getText().equals("")){
            this.secretString.setText(this.stringMan.convertBinaryStringToString(Long.parseLong(this.key.getText())));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Merci d'entrer les deux clés, et de reconstruire", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConvertActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea key;
    private javax.swing.JTextField key_1;
    private javax.swing.JLabel key_1_lab;
    private javax.swing.JTextField key_2;
    private javax.swing.JLabel key_2_lab;
    private javax.swing.JButton rebuild;
    private javax.swing.JTextField secretString;
    // End of variables declaration//GEN-END:variables
}
