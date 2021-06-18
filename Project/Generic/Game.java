/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Game.java
 Date créé: 2021-06-18
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

public abstract class Game {
    //TODO - Change this
    Creator c = new Creator();
    private DieCollection dieCollection = c.createDice(0,0);
    private PlayerCollection playerCollection = c.createPlayers(0);

}
