package dcll.ebou.impl;

import dcll.ebou.interfaces.IJoueur;

/**
 * Created by anais on 10/03/16.
 */
public class Joueur implements IJoueur {

    private String name;
    private int number;
    private int score;

    public Joueur (String nom, int num) {
        this.name = nom;
        this.number = num;
        this.score = 0;
    }

    public String getName (){
        return name;
    }

    public int getNumber (){
        return number;
    }

}
