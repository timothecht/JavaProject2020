package Phases;

import Interface.Jeux_QCM;
import Interface.Jeux_RC;
import Interface.Jeux_VF;
import Interface.MenuJeu;
import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Questions.Question;
import Questions.Theme;
import Questions.Themes;
import Questions.Type.QCM;
import Questions.Type.VF;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PremierePhase implements Phase {
    private ArrayList<Joueur> inPlay;
    private ArrayList<Joueur> waiting;
    Joueur playing;
    JLabel inPhase;
    JLabel inJoueur;
    JLabel inTheme;
    JComboBox cBox_availableTheme;
    int round = 0;
    Theme curTheme;
    MenuJeu m;

    public PremierePhase(JLabel inPhase, JLabel inJoueur, JLabel inTheme, JComboBox cBox_availableTheme, MenuJeu m) {
        this.inPlay = new ArrayList<>(4);
        this.waiting = new ArrayList<>(4);
        
        this.inPhase = inPhase;
        this.inJoueur = inJoueur;
        this.inTheme = inTheme;
        this.cBox_availableTheme = cBox_availableTheme;
        this.m = m;


        SelectionerJoueurs();
        
        /*
        for(int round = 0; round < 4; round++) {
            PhaseDeJeu();
        }*/

    }

    @Override
    public final void SelectionerJoueurs() {
        Joueur newPlayer;
        EnsJoueurs ej = EnsJoueurs.instance;

        for (int i = 0; i < 4; i++) {
            newPlayer = ej.selectionnerJoueur();
            newPlayer.changerEtat(Joueur.SELECTED);
            inPlay.add(newPlayer);
        }
        inPlay.forEach(Joueur::resetTime);
        System.out.println(inPlay.size());
    }

    @Override
    public boolean PhaseDeJeu() {
        Themes t = Themes.instance;
        curTheme = t.getThemeAt(t.selectionnerTheme());
        if(waiting.isEmpty()) {
            waiting = new ArrayList<>(inPlay);
            round++;
            //curTheme = t.getThemeAt(t.selectionnerTheme());
        }

        if(round < 4) {
            playing = waiting.remove((int) (Math.random() * waiting.size()));
            
            inPhase.setText("1");
            inJoueur.setText(playing.getName());
            inTheme.setText(curTheme.toString());
            
            return true;
        }
        else { return false; }
    }
    
    
    public void doQuestion() {
        Question<?> q = curTheme.getListe().selectionnerQuestion((int) (Math.random()*3) +1);
        
        if(q.getEnonce() instanceof QCM) {
            Jeux_QCM qcm = new Jeux_QCM(playing,q,2,m);
            qcm.setVisible(true);
        } else if(q.getEnonce() instanceof VF){
            Jeux_VF vf = new Jeux_VF(playing,q,2,m);
            vf.setVisible(true);
        } else {
            Jeux_RC rc = new Jeux_RC(playing,q,2,m);
            rc.setVisible(true);
        } 
        
    }
}
