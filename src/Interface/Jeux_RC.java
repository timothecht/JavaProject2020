/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Phases.Timer;
import Questions.Question;
import Questions.Type.RC;
import Questions.Type.VF;
import javax.swing.table.DefaultTableModel;

public class Jeux_RC extends javax.swing.JFrame {
    Joueur joueur;
    boolean qstRepondue;
    Question<RC> qst;
    String correctReponse;
    int points;
    Timer time;
    DefaultTableModel modelJoueurs;
    MenuJeu m;
    
    public Jeux_RC(Joueur joueur, Question<?> qst, int points,MenuJeu m) {
        this.joueur = joueur;
        this.qst = (Question<RC>) qst;
        this.points = points;
        this.m=m;
        
        initComponents();
        
        StringWrapper enonce = new StringWrapper();
        StringWrapper reponse = new StringWrapper();
        
        this.qst.afficher(new StringWrapper(),new StringWrapper(),enonce,new StringWrapper(),new StringWrapper(),new StringWrapper(),new StringWrapper(),reponse);
        lbl_question.setText(enonce.getText());
        this.correctReponse = reponse.getText();
        qstRepondue = false;
        btn_suivant.setVisible(false);
        btn_valider.setVisible(true);
        
        time = new Timer(lbl_timer);
        Thread thread = new Thread(time);
        thread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_question = new javax.swing.JLabel();
        txtF_reponse = new javax.swing.JTextField();
        btn_valider = new javax.swing.JButton();
        btn_suivant = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();
        lbl_timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_question.setText("Question :");

        txtF_reponse.setText("Votre réponse");

        btn_valider.setText("Valider la réponse");
        btn_valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_validerMouseClicked(evt);
            }
        });

        btn_suivant.setText("Joueur suivant");
        btn_suivant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suivantMouseClicked(evt);
            }
        });

        lbl_error.setForeground(new java.awt.Color(255, 0, 0));

        lbl_timer.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lbl_timer.setText("Timer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_timer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_suivant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_question)
                    .addComponent(txtF_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_timer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_question)
                .addGap(18, 18, 18)
                .addComponent(txtF_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_valider)
                    .addComponent(btn_suivant)
                    .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_validerMouseClicked
        if(!qstRepondue){
            
            if(!"Votre réponse".equals(txtF_reponse.getText()) && !"".equals(txtF_reponse.getText())){
                time.stopTimer();
                joueur.addTime(time.getTime());
                
                if (qst.getEnonce().getAnswer().equals(txtF_reponse.getText())){
                    lbl_error.setText("Bonne réponse !");
                    joueur.majScore(this.points);
                }
                else lbl_error.setText("Mauvaise réponse! Correct: " + this.correctReponse);
                qstRepondue = true;
                btn_suivant.setVisible(true);
                btn_valider.setVisible(false);
                
                m.reload();
                EnsJoueurs.instance.updateJoueur(joueur);
            }
            else {
                lbl_error.setText("Veuillez séléctionner une réponse");
            }
        }

    }//GEN-LAST:event_btn_validerMouseClicked

    private void btn_suivantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suivantMouseClicked
       this.dispose();
    }//GEN-LAST:event_btn_suivantMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suivant;
    private javax.swing.JButton btn_valider;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_question;
    private javax.swing.JLabel lbl_timer;
    private javax.swing.JTextField txtF_reponse;
    // End of variables declaration//GEN-END:variables
}
