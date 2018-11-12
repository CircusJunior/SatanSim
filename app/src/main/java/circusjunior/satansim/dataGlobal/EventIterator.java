package circusjunior.satansim.dataGlobal;

public interface EventIterator {
    Event getNext();
    Boolean hasNext();
    void reset();
}
