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

public class Bunco {

    public static void main(String[] args) {

        //TODO - Remove tests
        //TEST - CREATOR
        Creator creator = new Creator();

        //Collection + iterator vibes
        Collection collection = new Collection();

        collection.addObject(new Player(1));
        collection.addObject(new Player(2));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()){
          Player player = (Player) iterator.next();
            System.out.println(player.getID());
        }

    }

}
