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
