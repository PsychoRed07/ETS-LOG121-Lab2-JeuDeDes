/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Context.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package main.java.com.project.generic;

public class Context {

    private IStrategy strategy;
    final Game game;

    public Context(Game game){
        this.game = game;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeCalculateScoreRound(){
        strategy.calculateScoreRound(game);
    }

    public void executeCalculateTheWinner(){
        strategy.calculateTheWinner(game);
    }

    public int getCurrentRoundScore(){
        return strategy.getCurrentRoundScore();
    }

    public int getWinner(){
        return strategy.getWinner();
    }
}
