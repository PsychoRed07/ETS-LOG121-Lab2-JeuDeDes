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

public class DieCollection {

    //attributes
    Die[] dieArr;

    public DieCollection() {
    }

    public DieCollection(Die[] dieCollection) {
        this.dieArr = dieCollection;
    }

    public void addDie(Die d, int position)
    {
        if(dieArr.length > 0)
            dieArr[position] = d;
    }

    //TODO - implement when iterator is done
    /*public DieIterator createIterator()
    {

    }*/
}
