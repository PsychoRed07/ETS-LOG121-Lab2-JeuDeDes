/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Die.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

public class Die implements Comparable<Die>{

    //attributes
    public int facesCount;
    public int faceRolled;

    public Die(int facesCount) {
        this.facesCount = facesCount;
    }

    //getters and setters
    public int getFacesCount() {
        return facesCount;
    }

    public void setFacesCount(int facesCount) {
        this.facesCount = facesCount;
    }

    public int getFaceRolled() {
        return faceRolled;
    }

    public void setFaceRolled(int faceRolled) {
        this.faceRolled = faceRolled;
    }


    @Override
    public int compareTo(Die d) {
        return 0;
    }
}