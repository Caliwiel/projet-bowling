package dcll.ebou.impl;

import dcll.ebou.interfaces.IJoueur;

/**
 * Created by anais on 10/03/16.
 */
public class Joueur implements IJoueur {

    private String name;
    private int number;

    public String getName (){
        return name;
    }

    public int getNumber (){
        return number;
    }

}
