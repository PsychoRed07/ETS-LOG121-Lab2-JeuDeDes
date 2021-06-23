package Generic;

public class DieIterator implements Iterator{

    private final Die[] dieArr;
    int pos = 0;

    public DieIterator(Die[] dieArr){
        this.dieArr = dieArr.clone();
    }

    /**
     * Returns true if the iteration contains an object after the current one.
     * @return
     */
    @Override
    public boolean hasNext() {
        return pos < dieArr.length && dieArr[pos] != null;
    }

    /**
     * Returns the next element in the iteration.
     * @return
     */
    @Override
    public Die next() {
        Die die = dieArr[pos];
        pos += 1;
        return die;
    }

    /**
     * Reset the iterator to the first element of the iteration,
     */
    @Override
    public void reset() {
        pos = 0;
    }
}
