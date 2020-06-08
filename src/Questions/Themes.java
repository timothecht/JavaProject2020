/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author remyc
 */
public class Themes {
    public static Theme[] themes = new Theme[10];
    private int prev;   //index of current theme


    public Themes () {
        themes[0] = new Theme("Biologie");
        themes[1] = new Theme("Sport");
        themes[2] = new Theme("Histoire");
        themes[3] = new Theme("Informatique");
        themes[4] = new Theme("Aérospatial");
        themes[5] = new Theme("Aéronautique");
        themes[6] = new Theme("Literature");
        themes[7] = new Theme("Musique");
        themes[8] = new Theme("Films");
        themes[9] = new Theme("Culture Générale");
        /* ... à continuer*/
        this.prev = -1; //initial value of prev is -1 so that any theme can be selected
    }
    
    
    
    boolean DEBBUGING = true;
    
    public boolean addQuestion(String theme, Question<?> q)
    {
        int i;
        for (i = 0; i < themes.length; i++) {
            if(themes[i].getNom().equals(theme)) break;
        }
        if(i==themes.length) return false;
        else return themes[i].getListe().ajouterQuestion(q);
    }

    public void modifierTheme(int index, String newTheme) {
        try {
            themes[index] = new Theme(newTheme);
        }
        catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("\nERROR:\t" + aiobe);
            aiobe.printStackTrace();
        }
    }

    public int selectionnerTheme() {
        int newTheme;
        do {   //then new theme is same as previous and need to be changed
            newTheme = (int) (Math.random() * 10);
        } while (newTheme == this.prev);

        this.prev = newTheme;
        return this.prev;
    }

    public int[] selectionnerCinqThemes() {
        int[] selectedThemes = new int[5];
        int newTheme;

        for (int i = 0; i < 5; i++) {    //select 5 differents themes
            if (DEBBUGING) System.out.println("prev = " + prev);

            do{
                newTheme=selectionnerTheme();
            } while (Arrays.asList(selectedThemes).contains(newTheme));

            selectedThemes[i]=newTheme;
            
            if (DEBBUGING) {
                System.out.println();
                for (int test : selectedThemes) System.out.println(test);
            }
        }

        return selectedThemes;
    }

    public void afficher() {
        System.out.println();
        for (int i = 0; i < themes.length; i++) {
            System.out.println(i + " -> " + themes[i]);
        }
        System.out.println("selected theme: " + (this.prev== -1 ? "none" : themes[this.prev]));
    }


}
