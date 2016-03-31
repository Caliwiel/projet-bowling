package dcll.ebou.impl;

import dcll.ebou.interfaces.IEssai;
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
     * Le joueur a réalisé un spare
     * pendant le tour supplémentaire on 29/03/2016.
     */
    private boolean spareTourSuplementaire;

    /**
     * Le joueur a réalisé un strike
     * pendant le tour supplémentaire on 29/03/2016.
     */
    private boolean strikeTourSuplementaire;

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
        spareTourSuplementaire = false;
        strikeTourSuplementaire = false;
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
     * Accesseur à spare
     * @return
     */
    public boolean isSpare() {
        return spare;
    }


    /**
     * Accesseur à strike
     * @return
     */
    public boolean isStrike() {
        return strike;
    }

    public int getNombre_quilles_tombees() {
        return nombre_quilles_tombees;
    }

    public boolean isSpareTourSuplementaire() {
        return spareTourSuplementaire;
    }

    public boolean isStrikeTourSuplementaire() {
        return strikeTourSuplementaire;
    }

    /**
     * Jouer 1 tour donc 1 ou 2 essais on 30/03/2016
     * (faire une classe essai)
     * @return
     * Le nombre de quilles tombées
     */
    @Override
    public int jouerTour() {

        joueur.initialiserNombre_essai();
        /*
        nombre_quilles_tombees = jouerEssai();

        if ( nombre_quilles_tombees == 10 )
            strike = true;
        else {

            nombre_quilles_tombees += jouerEssai();
        }

        */

        boolean finTour = false;
        while (!strike && !spare && !finTour) {
            IEssai essai = new Essai();
            nombre_quilles_tombees += essai.jouerEssai(this);

            System.out.println("nb quilles + essai " + nombre_quilles_tombees + "   " + joueur.getNumero_essai());

            //Si il réalise un strike
            if (nombre_quilles_tombees == 10 && joueur.getNumero_essai() == 1) {
                strike = true;
            }
            //Si il réalise un spare
            else if (nombre_quilles_tombees == 10 && joueur.getNumero_essai() == 2){
                spare = true;
            }

            if ( joueur.getNumero_essai() == 2 )
            {
                if (numero_tour == 9)
                    jouerDernierTour();
                finTour = true;
            }
        }
        return nombre_quilles_tombees;
    }

    private int jouerDernierTour() {

        joueur.initialiserNombre_essai();

        int nombre_quilles_sup = 0;
        if (strike || spare){
            IEssai essai = new Essai();
            nombre_quilles_sup = essai.jouerEssai(this);
            if (nombre_quilles_sup != 10 && strike) {
                nombre_quilles_sup += essai.jouerEssai(this);
                if (nombre_quilles_sup == 10) {
                    spareTourSuplementaire = true;
                }
            }
            else if (nombre_quilles_sup == 10 && !strike)
                strikeTourSuplementaire = true;
        }
        System.out.println("tour sup " + nombre_quilles_sup);
        return nombre_quilles_sup;
    }

    public int calculerScoreTour () {
        if (strike || spare )
            return 10;
        return nombre_quilles_tombees;
    }

}
