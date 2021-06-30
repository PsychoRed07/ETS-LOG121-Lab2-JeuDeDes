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
package Generic;

public interface Iterator {

   /**
    * Returns true if the iteration contains an object after the current one.
    * @return
    */
   boolean hasNext();

   /**
    * Returns the next element in the iteration.
    * @return
    */
   Object next();

   /**
    * Reset the iterator to the first element of the iteration,
    */
   void reset();
}
