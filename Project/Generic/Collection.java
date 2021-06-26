package Generic;

import java.util.Arrays;
import java.util.Objects;

public class Collection {
    //attributes
    private int max_objects = 1;
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
            return pos < objects.length && objects[pos] != null;
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
    public Iterator createIterator() {
        return new Iterable();
    }

}
