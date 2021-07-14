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
package main.java.com.project.generic;

import java.util.Arrays;

public class Collection implements ICollection{
    //attributes
    private int max_objects = 0;
    private Object[] objects = new Object[max_objects];

    public class Iterable implements Iterator {

        private int pos = 0;

        public Iterable() {
        }

        /**
         * Returns true if the iteration contains an object after the current one.
         * @return returns true if it has a next object. returns false if it doesn't have a next object.
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
         * @return return the next object in the collection.
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

    /**
     * This method gets the first object in the collection
     * @return first object of the collection
     */
    public Object getFirst(){
        if(objects[0] != null)
            return objects[0];
        else
            return null;
    }

    /**
     * This method gets the size of the collection
     * @return size of collection as an int
     */
    public int size(){
        return objects.length;
    }

    /**
     * This method sorts the collection in a specific order because of the collection items implementing comparable
     */
    public void sortDescending(){
        Arrays.sort(objects);
    }

    /**
     * This method adds an object to the collection
     * @param object object to add to the collection
     */
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
     * @return returns an iterator.
     */
    @Override
    public Iterator createIterator() {
        return new Iterable();
    }

}
