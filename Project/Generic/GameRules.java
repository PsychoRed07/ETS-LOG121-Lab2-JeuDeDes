/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: GameRules.java
 Date créé: 2021-06-17
 Date dern. modif. 2021-07-
 Description: Abstract class for template method pattern
 *******************************************************/
package Generic;

public abstract class GameRules {

    /**
     * Abstract method to define player information
     */
    abstract void setPlayerAttributes();
    /**
     * Abstract method to define die information
     */
    abstract void setDieAttributes();
    /**
     * Abstract method to define game information
     */
    abstract void setGameRules();
}
