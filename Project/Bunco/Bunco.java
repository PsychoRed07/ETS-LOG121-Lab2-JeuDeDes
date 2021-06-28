/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Bunco.java
 Date créé: 2021-06-17
 Date dern. modif. 2021-07-
 *******************************************************/
package Bunco;

import Generic.*;

import java.util.Arrays;
import java.util.Collections;

public class Bunco {

    public static void main(String[] args) {

        //TODO - Remove tests
        //TEST - CREATOR
        Creator creator = new Creator();

        //Collection + iterator vibes
        Collection collection = creator.createPlayers(3);
        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()){
          Player player = (Player) iterator.next();
            System.out.println(player.getID());
        }

        //Collection + iterator vibes
        Collection collection2 = creator.createDice(6,3);
        Iterator iterator2 = collection2.createIterator();

        while (iterator2.hasNext())
        {
            Die die = (Die) iterator2.next();
            die.rollDie();
            System.out.println(die.faceRolled);
        }


    }

}
