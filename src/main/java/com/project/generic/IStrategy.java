/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: IStrategy.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package main.java.com.project.generic;

public interface IStrategy {

    /**
     * Calculate the score of a player for only 1 turn.
     * @param game Uses the params in game to calculate the score
     */
    void calculateScoreRound(Game game);

    /**
     * Calculate the winner of the game.
     * @param game Uses the params in game to calculate the winner
     */
    void calculateTheWinner(Game game);

    int getCurrentRoundScore();

    int getWinner();

}
