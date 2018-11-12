package circusjunior.satansim.dataGlobal;

import java.util.ArrayList;

public class ActiveEventList implements EventIterator {

    private ArrayList<Event> entityList;
    private static ActiveEventList _instance = null;

    private ActiveEventList(){
        entityList = new ArrayList<Event>() {
        };
    }

    public static synchronized ActiveEventList getInstance() {
        if (_instance == null) {
            synchronized (ActiveEventList.class) {
                if (_instance == null)
                    _instance = new ActiveEventList();

            }

        }
        return _instance;
    }

    @Override
    public Event getNext() {
        return null;
    }

    @Override
    public Boolean hasNext() {
        return null;
    }

    @Override
    public void reset() {

    }
}
