package circusjunior.satansim.dataGlobal;

public interface EntityIterator {
    Entity getNext();
    Boolean hasNext();
    void reset();
}
