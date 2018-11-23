package circusjunior.satansim.dataGlobal.Evnets;

public abstract class Event  {
    public abstract void activateEvent();
    public void deleteEvent(){
        ActiveEventList.getInstance().deleteElement(this);
    }
}
