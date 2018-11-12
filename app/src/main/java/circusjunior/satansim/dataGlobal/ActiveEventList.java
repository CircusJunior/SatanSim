package circusjunior.satansim.dataGlobal;

import java.util.ArrayList;
import java.util.Iterator;

public class ActiveEventList implements EventListInterface{

    private ArrayList<Event> eventList;
    private static ActiveEventList _instance = null;
    private int activeIndex = 0;

    private ActiveEventList(){
        eventList = new ArrayList<Event>() {
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

    //EventListInterface
    @Override
    public void addToEventList(Event e){
        eventList.add(e);
    }
    @Override
    public void clearList(){
        eventList.clear();
    }
    @Override
    public void deleteElement(int id){
        eventList.remove(id);
    }

    private Iterator<Event> getIteratorInstance(){
        return eventList.iterator();
    }

    public static Iterator<Event> getIterator(){
        return ActiveEventList.getInstance().getIteratorInstance();
    }

}
