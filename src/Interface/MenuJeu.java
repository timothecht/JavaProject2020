/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Phases.GameActions;
import Phases.PremierePhase;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class MenuJeu extends javax.swing.JFrame {
    DefaultTableModel modelJoueurs;
    boolean ready;
    PremierePhase p1;
    /**
     * Creates new form MenuJeu
     */
    public MenuJeu() {
        initComponents();
        
        p1= new PremierePhase(inPhase, inJoueur, inTheme, cBox_availableTheme);
        p1.PhaseDeJeu();
        
        modelJoueurs =(DefaultTableModel) JoueurInfo.getModel();
        
        GameActions.getJeuStatus(modelJoueurs);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JoueurInfo = new javax.swing.JTable();
        lbl_Phase = new javax.swing.JLabel();
        lbl_Joueur = new javax.swing.JLabel();
        lbl_Theme = new javax.swing.JLabel();
        inTheme = new javax.swing.JLabel();
        inPhase = new javax.swing.JLabel();
        inJoueur = new javax.swing.JLabel();
        cBox_availableTheme = new javax.swing.JComboBox<>();
        btn_Ready = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JoueurInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Joueur", "Nom", "Status", "Score", "Temps"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JoueurInfo);
        if (JoueurInfo.getColumnModel().getColumnCount() > 0) {
            JoueurInfo.getColumnModel().getColumn(0).setResizable(false);
            JoueurInfo.getColumnModel().getColumn(1).setResizable(false);
            JoueurInfo.getColumnModel().getColumn(2).setResizable(false);
            JoueurInfo.getColumnModel().getColumn(3).setResizable(false);
            JoueurInfo.getColumnModel().getColumn(4).setResizable(false);
        }

        lbl_Phase.setText("Phase :");

        lbl_Joueur.setText("Joueur :");

        lbl_Theme.setText("Theme(s) :");

        inTheme.setText("theme");

        inPhase.setText("X");

        inJoueur.setText("joueur");

        btn_Ready.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_Ready.setText("Ready!");
        btn_Ready.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ReadyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btn_Ready, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Joueur)
                            .addComponent(lbl_Phase)
                            .addComponent(lbl_Theme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inTheme)
                            .addComponent(inPhase)
                            .addComponent(inJoueur)
                            .addComponent(cBox_availableTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Phase)
                    .addComponent(inPhase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Joueur)
                    .addComponent(inJoueur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Theme)
                    .addComponent(inTheme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBox_availableTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_Ready, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReadyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReadyMouseClicked
        GameActions.getJeuStatus(modelJoueurs);
        p1.doQuestion();
    }//GEN-LAST:event_btn_ReadyMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JoueurInfo;
    private javax.swing.JButton btn_Ready;
    private javax.swing.JComboBox<String> cBox_availableTheme;
    private javax.swing.JLabel inJoueur;
    private javax.swing.JLabel inPhase;
    private javax.swing.JLabel inTheme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Joueur;
    private javax.swing.JLabel lbl_Phase;
    private javax.swing.JLabel lbl_Theme;
    // End of variables declaration//GEN-END:variables
}
