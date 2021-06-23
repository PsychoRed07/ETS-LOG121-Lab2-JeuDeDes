package Generic;

public class PlayerIterator implements Iterator {

    private Player[] playerArr;
    int pos = 0;

    public PlayerIterator(){}

    public PlayerIterator(Player[] playerArr){
        this.playerArr = playerArr.clone();
    }

    /**
     * Returns true if the iteration contains an object after the current one.
     * @return
     */
    @Override
    public boolean hasNext() {
        return pos < playerArr.length && playerArr[pos] != null;
    }

    /**
     * Returns the next element in the iteration.
     * @return
     */
    @Override
    public Player next() {
        Player player = playerArr[pos];
        pos += 1;
        return player;
    }

    /**
     * Reset the iterator to the first element of the iteration,
     */
    @Override
    public void reset() {
        pos = 0;
    }
}
