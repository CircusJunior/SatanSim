package circusjunior.satansim.dataGlobal.Evnets;

public abstract class Event  {
    public abstract void activateEvent();
    public void deleteEvent(Event event){
        ActiveEventList.getInstance().deleteElement(event);
    }
}
