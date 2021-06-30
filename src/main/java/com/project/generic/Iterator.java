/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Iterator.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package main.java.com.project.generic;

public interface Iterator {

   /**
    * Returns true if the iteration contains an object after the current one.
    * @return returns true if it has a next object. returns false if it doesn't have a next object.
    */
   boolean hasNext();

   /**
    * Returns the next element in the iteration.
    * @return return the next object in the collection.
    */
   Object next();

   /**
    * Reset the iterator to the first element of the iteration,
    */
   void reset();
}
