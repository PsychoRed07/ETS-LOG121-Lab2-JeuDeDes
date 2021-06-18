/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: DieCollection.java
 Date créé: 2021-06-17
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

import java.util.Arrays;

public class DieCollection {

    //attributes
    Die[] dieArr;

    //getters and setters
    public Die[] getDieArr() {
        return dieArr;
    }

    public void setDieArr(Die[] dieArr) {
        this.dieArr = dieArr;
    }

    /**
     * die collection is created in creator class
     */
    public DieCollection() {
    }

    public DieCollection(Die[] dieCollection) {
        this.dieArr = dieCollection;
    }

    /**
     * Method to add a die to the collection
     * @param d: die to add
     * @param position: position where to add die
     */
    public void addDie(Die d, int position)
    {
        if(dieArr.length > 0)
            dieArr[position] = d;
    }

    /**
     * Method to get the die with the highest roll in the array
     * @return the die with the highest roll
     */
    public Die getHighestRollDie()
    {
        //TODO - remove print tests
        System.out.println("Before sorting: " + Arrays.toString(dieArr));
        Arrays.sort(dieArr);
        System.out.println("After sorting: " + Arrays.toString(dieArr));
        return dieArr[0];
    }

    /**
     * Method to get the sum of all rolls in the collection
     * @return the sum of the dice
     */
    public int getSumOfRolls()
    {
        int sum = 0;
        for(Die d: dieArr)
        {
            sum += d.getFaceRolled();
        }
        return sum;
    }

    //TODO - implement when iterator is done
    /*public DieIterator createIterator()
    {

    }*/
}
