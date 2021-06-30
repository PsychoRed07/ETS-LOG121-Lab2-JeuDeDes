/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: ICollection.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package main.java.com.project.generic;

public interface ICollection {
    /**
     * Creates the Iterator for a collection.
     * @return returns an Iterator.
     */
    Iterator createIterator();
}
