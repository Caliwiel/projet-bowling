package dcll.ebou.impl;

import dcll.ebou.interfaces.IJeu;
import dcll.ebou.interfaces.ITour;

/**
 * Created by anais on 29/03/16.
 */
public class Jeu implements IJeu {

    /**
     * Nombre total de frame d'un jeu
     */
    private static final int NOMBRE_FRAME = 10;

    /**
     * Nombre total d'essai par tours
     */
    private static final int NOMBRE_ESSAI_MAX = 2;

    /**
     * Nombre total de quilles
     */
    private static final int NOMBRE_QUILLES = 10;


    /**
     * Joueur n°1
     */
    private Joueur joueur1;

    /**
     * Joueur n°2
     */
    private Joueur joueur2;


    /**
     * on 29/03/2016
     * Méthode de jeu de bowling
     */
    public void jouer () {
        joueur1 = new Joueur ("Joueur1", 1);
        joueur2 = new Joueur ("Joueur2", 2);

        //Il faudra ici une list de tours par joueur quand la classe tour sera
        //La classe tour devrait contenir le score du joueur pour ce tour là, le num du joueur, si il a fait un spare, si il a fait un strike
        /*
        boolean strike;
        int j;
        int nbQuillesTombees;
        for (int i = 0; i < NOMBRE_FRAME * 2; i++){

            System.out.println("C'est au joueur : " + ((i % 2) + 1) + " de jouer.");

            strike = false;
            j = 0;
            nbQuillesTombees = 0;

            while (!strike && j < NOMBRE_ESSAI_MAX) {
                //nbQuillesTombees += tour.lancer ();
                //Si il a fait tomber toutes les quilles, et que c'est son premier essai
                if (nbQuillesTombees == NOMBRE_QUILLES && j == 0)
                    //tour.strike = true;
                    strike = true;

                //Si il a fait tomber toutes les quilles, et que c'est son deuxième essai
                else if (nbQuillesTombees == NOMBRE_QUILLES && j == 1);
                    //tour.spare = true;
                j++;
            }

            System.out.println("Il a fait tomber " + nbQuillesTombees + " quilles, en " + j + " coups.");

            //Calcul des scores en parcourant la liste de tours
        }
        */

        ITour[] toursJ1 = new Tour[10];
        ITour[] toursJ2 = new Tour[10];

        for (int n_frames = 0; n_frames < NOMBRE_FRAME; n_frames++) {
            toursJ1[n_frames]= new Tour(joueur1,n_frames);
            toursJ2[n_frames]= new Tour(joueur2,n_frames);
        }

        int nQuilles;
        for (int n_frames = 0; n_frames < NOMBRE_FRAME; n_frames++) {
            System.out.println("Tour : " + n_frames);

            nQuilles = toursJ1[n_frames].jouerTour();
            System.out.println("Le joueur 1 a fait tombé " + nQuilles + " en " + toursJ1[n_frames].getNumeroEssai() + " essais.");
            if (toursJ1[n_frames].isStrike())
                System.out.println("Le joueur 1 a réalisé un striiiiiiiike");
            nQuilles = toursJ2[n_frames].jouerTour();
            System.out.println("Le joueur 2 a fait tombé " + nQuilles + " en " + toursJ2[n_frames].getNumeroEssai() + " essais.");
            if (toursJ2[n_frames].isStrike())
                System.out.println("Le joueur 2 a réalisé un striiiiiiiike");
        }
    }
}
