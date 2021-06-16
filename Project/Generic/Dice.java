/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Dice.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

public class Dice implements Comparable<Dice>{

    //attributes
    public int facesCount;

    public Dice(int facesCount) {
        this.facesCount = facesCount;
    }

    //getters and setters
    public int getFacesCount() {
        return facesCount;
    }

    public void setFacesCount(int facesCount) {
        this.facesCount = facesCount;
    }

    @Override
    public int compareTo(Dice d) {
        return 0;
    }
}