/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author lilian
 */
public class CreationQST_qcm extends javax.swing.JFrame {
    private final String qst;
    private final String theme;
    private final int difficulte;

    public CreationQST_qcm(String q, String t, int d) {
        qst = q;
        theme = t;
        difficulte = d;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_reponses = new javax.swing.JLabel();
        lbl_a = new javax.swing.JLabel();
        lbl_b = new javax.swing.JLabel();
        lbl_c = new javax.swing.JLabel();
        lbl_d = new javax.swing.JLabel();
        txtF_addREP1 = new javax.swing.JTextField();
        txtF_addREP2 = new javax.swing.JTextField();
        txtF_addREP3 = new javax.swing.JTextField();
        txtF_addREP4 = new javax.swing.JTextField();
        checkBox_repA = new javax.swing.JCheckBox();
        checkBox_repC = new javax.swing.JCheckBox();
        checkBox_repD = new javax.swing.JCheckBox();
        checkBox_repB = new javax.swing.JCheckBox();
        btn_ajouterQST = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_reponses.setText("Choisir les réponses possibles");

        lbl_a.setText("a )");

        lbl_b.setText("b )");

        lbl_c.setText("c )");

        lbl_d.setText("d )");

        txtF_addREP1.setText("une réponse...");

        txtF_addREP2.setText("une réponse...");
        txtF_addREP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_addREP2ActionPerformed(evt);
            }
        });

        txtF_addREP3.setText("une réponse...");

        txtF_addREP4.setText("une réponse...");
        txtF_addREP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_addREP4ActionPerformed(evt);
            }
        });

        checkBox_repA.setText("a est la bonne réponse");
        checkBox_repA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox_repAMouseClicked(evt);
            }
        });

        checkBox_repC.setText("c est la bonne réponse");
        checkBox_repC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox_repCMouseClicked(evt);
            }
        });

        checkBox_repD.setText("d est la bonne réponse");
        checkBox_repD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox_repDMouseClicked(evt);
            }
        });

        checkBox_repB.setText("b est la bonne réponse");
        checkBox_repB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox_repBMouseClicked(evt);
            }
        });

        btn_ajouterQST.setText("Ajouter la question");
        btn_ajouterQST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ajouterQSTMouseClicked(evt);
            }
        });

        lbl_error.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lbl_reponses))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btn_ajouterQST))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_a, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtF_addREP2)
                            .addComponent(txtF_addREP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF_addREP1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF_addREP3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(checkBox_repC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBox_repB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBox_repA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBox_repD, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_reponses)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_b)
                        .addGap(14, 14, 14)
                        .addComponent(lbl_c)
                        .addGap(16, 16, 16)
                        .addComponent(lbl_d))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtF_addREP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBox_repA)
                            .addComponent(lbl_a))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtF_addREP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBox_repB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBox_repC)
                            .addComponent(txtF_addREP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBox_repD)
                            .addComponent(txtF_addREP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_ajouterQST)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtF_addREP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_addREP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_addREP2ActionPerformed

    private void txtF_addREP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_addREP4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_addREP4ActionPerformed

    private void btn_ajouterQSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajouterQSTMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_ajouterQSTMouseClicked

    private void checkBox_repAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox_repAMouseClicked
        checkBox_repB.setSelected(false);
        checkBox_repC.setSelected(false);
        checkBox_repD.setSelected(false);
    }//GEN-LAST:event_checkBox_repAMouseClicked

    private void checkBox_repBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox_repBMouseClicked
        checkBox_repA.setSelected(false);
        checkBox_repC.setSelected(false);
        checkBox_repD.setSelected(false);
    }//GEN-LAST:event_checkBox_repBMouseClicked

    private void checkBox_repCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox_repCMouseClicked
        checkBox_repA.setSelected(false);
        checkBox_repB.setSelected(false);
        checkBox_repD.setSelected(false);
    }//GEN-LAST:event_checkBox_repCMouseClicked

    private void checkBox_repDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox_repDMouseClicked
        checkBox_repA.setSelected(false);
        checkBox_repB.setSelected(false);
        checkBox_repC.setSelected(false);
    }//GEN-LAST:event_checkBox_repDMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajouterQST;
    private javax.swing.JCheckBox checkBox_repA;
    private javax.swing.JCheckBox checkBox_repB;
    private javax.swing.JCheckBox checkBox_repC;
    private javax.swing.JCheckBox checkBox_repD;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_b;
    private javax.swing.JLabel lbl_c;
    private javax.swing.JLabel lbl_d;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_reponses;
    private javax.swing.JTextField txtF_addREP1;
    private javax.swing.JTextField txtF_addREP2;
    private javax.swing.JTextField txtF_addREP3;
    private javax.swing.JTextField txtF_addREP4;
    // End of variables declaration//GEN-END:variables
}
