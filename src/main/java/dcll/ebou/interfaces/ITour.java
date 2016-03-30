package dcll.ebou.interfaces;

/**
 * Created by Responsable on 10/03/2016.
 */
public interface ITour {

    /**
     * on 30/03/2016.
     * @return
     */
    public int getNumeroTour();

    /**
     * on 30/03/2016.
     * @return
     */
    public IJoueur getJoueurDuTour();

    /**
     * on 30/03/2016.
     * @return
     */
    public int getNumeroEssai();

    /**
     * on 30/03/2016.
     * @return
     */
    public int jouerTour();
    /**
     * Accesseur à spare
     * @return
     */
    public boolean isSpare();


    /**
     * Accesseur à strike
     * @return
     */
    public boolean isStrike();

}
