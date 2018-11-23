package circusjunior.satansim.dataGlobal.Interface;

import circusjunior.satansim.dataGlobal.Evnets.Event;

public interface EventListInterface {
    void addToEventList(Event e);
    void clearList();
    void deleteElement(Event event);
}
