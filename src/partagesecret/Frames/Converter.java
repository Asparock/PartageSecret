package partagesecret.Frames;

import javax.swing.JFrame;
import partagesecret.managers.StringManager;

public class Converter extends javax.swing.JFrame {

    private StringManager sman = new StringManager();
    
    public Converter() {
        initComponents();
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        binArea.setLineWrap(true);
        binArea.setWrapStyleWord(true);
        stringArea.setLineWrap(true);
        stringArea.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toString = new javax.swing.JButton();
        toBin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        binArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        stringArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        toString.setText("<---");
        toString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStringActionPerformed(evt);
            }
        });

        toBin.setText("-->");
        toBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBinActionPerformed(evt);
            }
        });

        binArea.setColumns(20);
        binArea.setRows(5);
        jScrollPane1.setViewportView(binArea);

        stringArea.setColumns(20);
        stringArea.setRows(5);
        jScrollPane2.setViewportView(stringArea);

        jLabel1.setText("String");

        jLabel2.setText("Binaire");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toBin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(toBin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toString)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStringActionPerformed
        if(!this.binArea.getText().equals("")){
            this.stringArea.setText(sman.binToString(this.binArea.getText()));
            this.binArea.setText("");            
        }
    }//GEN-LAST:event_toStringActionPerformed

    private void toBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBinActionPerformed
        if(!this.stringArea.getText().equals("")){
            this.binArea.setText(sman.stringToBin(this.stringArea.getText()));
            this.stringArea.setText("");
        }
    }//GEN-LAST:event_toBinActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea binArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea stringArea;
    private javax.swing.JButton toBin;
    private javax.swing.JButton toString;
    // End of variables declaration//GEN-END:variables
}
