package dcll.ebou.impl;

import dcll.ebou.interfaces.IEssai;
import dcll.ebou.interfaces.ITour;

/**
 * Created by Responsable on 30/03/2016.
 */
public class Essai implements IEssai {
    /**
     * Jouer l'essai on 30/03/2016.
     *
     * @return le nombre de quilles tombées
     */
    public int jouerEssai(ITour tour) {

        tour.getJoueurDuTour().incrementerNombre_essai();

        if (tour.getJoueurDuTour().getNumber() == 1) {
            if (10 - tour.getNombre_quilles_tombees() - tour.getNumeroTour()%5 + 1 >= 0)
                return tour.getNumeroTour()%5+1;
            else
                return 0;
        }
        else
        {
            if (10 - tour.getNombre_quilles_tombees() - tour.getNumeroTour()%4 + 2 >= 0)
                return tour.getNumeroTour()%4+2;
            else
                return 0;
        }
    }
}
