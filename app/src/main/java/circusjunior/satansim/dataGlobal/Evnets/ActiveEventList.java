package circusjunior.satansim.dataGlobal.Evnets;

import java.util.ArrayList;
import java.util.Iterator;

import circusjunior.satansim.dataGlobal.Interface.EventListInterface;

public class ActiveEventList implements EventListInterface {

    private ArrayList<Event> eventList;
    private static ActiveEventList _instance = null;

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
    public synchronized void addToEventList(Event e){
        eventList.add(e);
    }
    @Override
    public synchronized void clearList(){
        eventList.clear();
    }

    @Override
    public synchronized void deleteElement(Event event){
        eventList.remove(eventList.indexOf(event));
    }

    private Iterator<Event> getIteratorInstance(){
        return eventList.iterator();
    }

    public static Iterator<Event> getIterator(){
        return ActiveEventList.getInstance().getIteratorInstance();
    }

}
