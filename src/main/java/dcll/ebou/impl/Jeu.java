package dcll.ebou.impl;

/**
 * Created by anais on 29/03/16.
 */
public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;


    public void lancer () {
        joueur1 = new Joueur ("Joueur1", 1);
        joueur2 = new Joueur ("Joueur2", 2);
    }
}
