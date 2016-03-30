package dcll.ebou.impl;

import dcll.ebou.interfaces.IJoueur;
import dcll.ebou.interfaces.ITour;

/**
 * Created by Responsable on 29/03/2016.
 * Tour d'une partie de bowling d'un joueur
 */
public class Tour implements ITour {

    /**
     * Joueur qui joue le tour on 29/03/2016.
     */
    private IJoueur joueur;

    /**
     * Le joueur a réalisé un spare
     * pendant le tour on 29/03/2016.
     */
    private boolean spare;

    /**
     * Le joueur a réalisé un strike
     * pendant ce tour on 29/03/2016.
     */
    private boolean strike;

    /**
     * Numéro du tour on 29/03/2016.
     */
    private int numero_tour;

    /**
     * Nombre de quilles tombées pendant
     * le tour on 30/03/2016.
     */
    private int nombre_quilles_tombees = 0;

    /**
     * Constructeur Tour on 30/03/2016.
     * @param j
     * @param n
     */
    public Tour(Joueur j, int n) {
        joueur=j;
        numero_tour=n;
    }

    /**
     * Getter du numéro du tour
     */
    @Override
    public int getNumeroTour() {
        return numero_tour;
    }

    /**
     * Getter du joueur du tour
     */
    @Override
    public IJoueur getJoueurDuTour() {
        return joueur;
    }

    /**
     * Getter du numéro d'essai on 29/03/2016.
     */
    @Override
    public int getNumeroEssai() {
        return joueur.getNumero_essai();
    }

    /**
     * Jouer 1 tour donc 1 ou 2 essais on 30/03/2016
     * (faire une classe essai)
     * @return
     * Le nombre de quilles tombées
     */
    @Override
    public int jouerTour() {
        nombre_quilles_tombees=jouerEssai();
        if(nombre_quilles_tombees!=10){
            nombre_quilles_tombees+=jouerEssai();
        }
        return nombre_quilles_tombees;
    }

    /**
     * Jouer 1 essai on 30/03/2016.
     * @return
     * nombre de quilles tombées
     */
    private int jouerEssai() {
        joueur.incrementerNombre_essai();
        if (10 - nombre_quilles_tombees - numero_tour%6+1>=0)
            return numero_tour%6+1;
        else
            return 0;
    }

}
