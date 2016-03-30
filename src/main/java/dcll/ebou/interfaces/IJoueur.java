package dcll.ebou.interfaces;

/**
 * Created by anais on 10/03/16.
 */
public interface IJoueur {
    /**
     * Retourne le nom du joueur
     * @return
     */
    public String getName ();

    /**
     * Retourne le numéro du joueur
     * @return
     */
    public int getNumber ();

    /**
     * Retourne le score du joueur
     * @return
     */
    public int getScore ();

    /**
     *
     * @return
     */
    public int getNumero_essai();

    public void initialiserNombre_essai();

    public void incrementerNombre_essai();


}
