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
package main.java.com.project.generic;

public class Die implements Comparable<Die>{

    //attributes
    private int facesCount;
    private int faceRolled;

    public Die(int facesCount) {
        this.facesCount = facesCount;
    }

    //getters and setters
    public int getFacesCount() {
        return facesCount;
    }

    /**
     * This method sets the amount of faces on a die to the input if it is > 0 or to 6 by default
     * @param facesCount number of faces on one die
     */
    public void setFacesCount(int facesCount)
    {
        if(facesCount>0)
            this.facesCount = facesCount;
        else
            this.facesCount = 6;
    }

    public int getFaceRolled() { return faceRolled; }

    public void setFaceRolled(int faceRolled) { this.faceRolled = faceRolled; }

    /**
     * Method that sets the face rolled with a random int between 1 and the number of faces
     */
    public void rollDie()
    {
        int min = 1;
        int max = this.getFacesCount();
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        this.setFaceRolled(random_int);
    }

    /**
     * This method overrides the compareTo method to sort the dice score from biggest to lowest roll
     * @param d: die to compare
     * @return
     * score > 0 --> second die has a higher roll
     * score == 0 --> score is equal
     * score < 0 --> first die has a higher roll
     */
    @Override
    public int compareTo(Die d) {
        return d.faceRolled - this.faceRolled ;
    }

    /**
     * This method pieces the die current roll
     * @return string of player ID and score
     */
    @Override
    public String toString() {
        return "Die{" +
                "faceRolled=" + faceRolled +
                '}';
    }
}