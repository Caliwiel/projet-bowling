package dcll.ebou.impl;

import dcll.ebou.interfaces.IJoueur;

/**
 * Created by anais on 10/03/16.
 */
public class Joueur implements IJoueur {

    /**
     * Nom du joueur
     */
    private String name;

    /**
     * Numéro du joueur
     */
    private int number;

    //Je sais pas trop si ça va être utile
    /**
     * Score du joueur
     */
    private int score;

    /**
     * Le numéro de l'essai du joueur pour le tour en
     * cours. A chaque d"but de tour, il est réinitialisé
     * on 29/03/2016

     */
    private int numero_essai = 0;

    /**
     * on 29/03/2016
     * Constructeur
     * @param nom
     * @param num
     */
    public Joueur (String nom, int num) {
        this.name = nom;
        this.number = num;
        this.score = 0;
    }

    /**
     * Retourne le nom du joueur
     * @return
     */
    public String getName (){
        return name;
    }

    /**
     * Retourne le numéro du joueur
     * @return
     */
    public int getNumber (){
        return number;
    }

    /**
     * Retourne le score du joueur
     * @return
     */
    public int getScore ()  { return score; }

    /**
     * Getter du numéro d'essai du joueur on 29/03/2016.
     * @return
     * numéro d'essai du joueur
     */
    public int getNumero_essai() {
        return numero_essai;
    }

    /**
     * Initialiser le nombre d'essai on 29/03/2016.
     */
    public void initialiserNombre_essai() {
        this.numero_essai=0;
    }

    /**
     * Incrémenter le nombre d'essai on 29/03/2016.
     */
    public void incrementerNombre_essai() {
        this.numero_essai++;
    }
}
