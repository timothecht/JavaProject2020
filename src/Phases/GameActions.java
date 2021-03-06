package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

public class GameActions {
    public static ArrayList<Joueur> eliminateLast(ArrayList<Joueur> inJoueurs, int eliminationRound) {
        if(eliminationRound>2) {
            int randJ = (int) (Math.random() * inJoueurs.size());
            inJoueurs.get(randJ).changerEtat(Joueur.ELIMINATED);
            inJoueurs.remove(randJ);
        } else {
            Joueur lastJoueur= inJoueurs.stream().min(Joueur::compareTo).get();

            ArrayList<Joueur> allLast = inJoueurs.stream().filter(j -> j.getScore() == lastJoueur.getScore()).collect(Collectors.toCollection(ArrayList::new));
            if(allLast.size() != 1) {
                TieBreak tieBreak = new TieBreak(allLast, eliminationRound);
                tieBreak.PhaseDeJeu();
                inJoueurs = new ArrayList<>(EnsJoueurs.instance.getSelected());
            } else {
                lastJoueur.changerEtat(Joueur.ELIMINATED);
                inJoueurs.remove(lastJoueur);
            }
        }
        inJoueurs.forEach(Joueur::resetTime);
        return inJoueurs;
    }
    
    public static String parseTimer(int time)
    {
        NumberFormat nf = new DecimalFormat("00");
        
        int m = (time - (time % 6000))/6000;
        time -= m * 6000;
        int s = (time - (time % 100))/100;
        time -= s*100;
        
        return nf.format(m) + ":" + nf.format(s) + "." + nf.format(time); 
    }
    
    public static void getJeuStatus(DefaultTableModel modelJoueurs) {
        ArrayList<Joueur> chosen = EnsJoueurs.instance.getChosen();
        Collections.sort(chosen);
        
        modelJoueurs.setRowCount(0);
        EnsJoueurs.instance.afficher(modelJoueurs);
    }
}
