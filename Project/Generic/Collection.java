/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Creator.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 Description: "Fabrique" class
 *******************************************************/
package Generic;

import java.util.Arrays;
import java.util.Collections;

public class Collection implements ICollection{
    //attributes
    private int max_objects = 0;
    private int pos = 0;
    Object[] objects = new Object[max_objects];

    public class Iterable implements Iterator {


        public Iterable() {
        }

        /**
         * Returns true if the iteration contains an object after the current one.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            if(pos < objects.length && objects[pos] != null){
                return true;
            }else{
                reset();
                return false;
            }
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return
         */
        @Override
        public Object next() {
            Object Object = objects[pos];
            pos += 1;
            return Object;
        }

        /**
         * Reset the iterator to the first element of the iteration,
         */
        @Override
        public void reset() {
            pos = 0;
        }

    }

    //getters and setters
    public Object[] getCollection() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public Object getFirst(){
        if(objects[0] != null)
            return objects[0];
        else
            return null;
    }

    public int size(){
        return objects.length;
    }

    public void sort(){
        Arrays.sort(objects);
    }

    public void addObject(Object object) {
        if(objects.length >= max_objects){
            max_objects += 1;
            objects = Arrays.copyOf(objects, max_objects);
        }

        for (int i = 0; i < objects.length; i++) {
            if(objects[i] == null){
                objects[i] = object;
                return;
            }
        }
    }

    /**
     * die collection is created in creator class
     */
    public Collection() {
    }

    public Collection(Object[] Collection) {
        this.objects = Collection;
    }


    /**
     * Method to initiate an iterator.
     *
     * @return returns an iterator.
     */
    @Override
    public Iterator createIterator() {
        return new Iterable();
    }

}
