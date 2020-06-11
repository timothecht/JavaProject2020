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
import Questions.Type.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lilian
 */
public class Jeux_QCM extends javax.swing.JFrame {
    Joueur joueur;
    boolean qstRepondue;
    Question<QCM> qst;
    String correctReponse;
    int points;
    Timer time;
    DefaultTableModel modelJoueurs;
    /**
     * Creates new form Jeux
     */
    public Jeux_QCM(Joueur joueur, Question<?> qst, int points) {
        this.joueur = joueur;
        this.qst = (Question<QCM>) qst;
        this.points = points;
        
        initComponents();
        
        StringWrapper enonce = new StringWrapper();
        StringWrapper r1 = new StringWrapper();
        StringWrapper r2 = new StringWrapper();
        StringWrapper r3 = new StringWrapper();
        StringWrapper r4 = new StringWrapper();
        StringWrapper reponse = new StringWrapper();
        
        this.qst.afficher(new StringWrapper(),new StringWrapper(),enonce,r1,r2,r3,r4,reponse);
        lbl_question.setText(enonce.getText());
        lbl_rep1.setText(r1.getText());
        lbl_rep2.setText(r2.getText());
        lbl_rep3.setText(r3.getText());
        lbl_rep4.setText(r4.getText());
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

        reponses = new javax.swing.ButtonGroup();
        btn_valider = new javax.swing.JButton();
        btn_suivant = new javax.swing.JButton();
        lbl_a = new javax.swing.JLabel();
        lbl_b = new javax.swing.JLabel();
        lbl_c = new javax.swing.JLabel();
        lbl_d = new javax.swing.JLabel();
        lbl_question = new javax.swing.JLabel();
        lbl_rep1 = new javax.swing.JLabel();
        lbl_rep2 = new javax.swing.JLabel();
        lbl_rep4 = new javax.swing.JLabel();
        lbl_rep3 = new javax.swing.JLabel();
        lbl_error = new javax.swing.JLabel();
        lbl_timer = new javax.swing.JLabel();
        checkBox_repA = new javax.swing.JRadioButton();
        checkBox_repC = new javax.swing.JRadioButton();
        checkBox_repB = new javax.swing.JRadioButton();
        checkBox_repD = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lbl_a.setText("a )");

        lbl_b.setText("b )");

        lbl_c.setText("c )");

        lbl_d.setText("d )");

        lbl_question.setText("Question :");

        lbl_rep1.setText("Rep1");

        lbl_rep2.setText("Rep2");

        lbl_rep4.setText("Rep4");

        lbl_rep3.setText("Rep3");

        lbl_error.setForeground(new java.awt.Color(204, 0, 0));

        lbl_timer.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lbl_timer.setText("Timer");

        reponses.add(checkBox_repA);
        checkBox_repA.setText("A");

        reponses.add(checkBox_repC);
        checkBox_repC.setText("C");
        checkBox_repC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_repCActionPerformed(evt);
            }
        });

        reponses.add(checkBox_repB);
        checkBox_repB.setText("B");

        reponses.add(checkBox_repD);
        checkBox_repD.setText("D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_b, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_a, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_rep1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_rep2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_rep4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_rep3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBox_repA)
                            .addComponent(checkBox_repC)
                            .addComponent(checkBox_repB)
                            .addComponent(checkBox_repD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_question))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_suivant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(lbl_timer)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_b)
                                    .addComponent(lbl_rep2)
                                    .addComponent(checkBox_repB))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_c)
                                    .addComponent(lbl_rep3)
                                    .addComponent(checkBox_repC))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_d)
                                    .addComponent(lbl_rep4)
                                    .addComponent(checkBox_repD)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_a)
                                    .addComponent(lbl_rep1)
                                    .addComponent(checkBox_repA))
                                .addGap(92, 92, 92)))
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_timer)
                        .addComponent(lbl_question)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_valider)
                    .addComponent(btn_suivant))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suivantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suivantMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_btn_suivantMouseClicked

    private void btn_validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_validerMouseClicked
        if(!qstRepondue){
            int questionChoisie = 0;

            int cpt = 0;
            if(checkBox_repA.isSelected()){
                cpt++;
                questionChoisie = 0;
            }
            if(checkBox_repB.isSelected()){
                cpt++;
                questionChoisie = 1;
            }
            if(checkBox_repC.isSelected()){
                cpt++;
                questionChoisie = 2;
            }
            if(checkBox_repD.isSelected()){
                cpt++;
                questionChoisie = 3;
            }

            if(cpt!=1){
                lbl_error.setText("Veuillez choisir une réponse");
            }
            else {
                time.stopTimer();
                joueur.addTime(time.getTime());
                
                for(int i=0 ;i<4; i++ )
                {
                    System.out.println(qst.getNumber());
                    if (qst.getEnonce().getAnswer() == i){
                    System.out.println("god");
                    lbl_error.setText("Bonne réponse !");
                    joueur.majScore(this.points);
                    }
                }
                /*
                if (joueur.saisir(qst, questionChoisie)){
                    lbl_error.setText("Bonne réponse !");
                    joueur.majScore(this.points);
                }
                else lbl_error.setText("Mauvaise réponse! Correct: " + this.correctReponse); */
                qstRepondue = true;
                btn_suivant.setVisible(true);
                btn_valider.setVisible(false);
                
                EnsJoueurs.instance.updateJoueur(joueur);
            }
        }
        
        
    }//GEN-LAST:event_btn_validerMouseClicked

    private void checkBox_repCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_repCActionPerformed
        
    }//GEN-LAST:event_checkBox_repCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suivant;
    private javax.swing.JButton btn_valider;
    private javax.swing.JRadioButton checkBox_repA;
    private javax.swing.JRadioButton checkBox_repB;
    private javax.swing.JRadioButton checkBox_repC;
    private javax.swing.JRadioButton checkBox_repD;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_b;
    private javax.swing.JLabel lbl_c;
    private javax.swing.JLabel lbl_d;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_question;
    private javax.swing.JLabel lbl_rep1;
    private javax.swing.JLabel lbl_rep2;
    private javax.swing.JLabel lbl_rep3;
    private javax.swing.JLabel lbl_rep4;
    private javax.swing.JLabel lbl_timer;
    private javax.swing.ButtonGroup reponses;
    // End of variables declaration//GEN-END:variables
}
