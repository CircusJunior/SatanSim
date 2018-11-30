package circusjunior.satansim.features.cataclysm.domain.model.cataclysms;

import circusjunior.satansim.dataGlobal.Evnets.ActiveEventList;
import circusjunior.satansim.dataGlobal.Evnets.Cataclysm.CataclysmEvent;

public class CataclysmModel {
    protected String name;
    private String type;
    protected CataclysmEvent event;
    protected boolean is_Active;


    public CataclysmModel(String name, String type){
        this.name=name;
        this.type = type;
        is_Active=true;
        event = new CataclysmEvent(this);
        activeCata();
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }

    public String getName(){
        return name;
    }

    public boolean is_Active(){
        return is_Active;
    }

    public void activeCata(){
        ActiveEventList activeEventList = ActiveEventList.getInstance();
        activeEventList.addToEventList(this.event);
        is_Active=true;
    }

    public void deleteEvent(){
        event.deleteEvent();
    }

    public int getTimeRemaining(){
        return event.getTimeRemaining();
    }
    public int getTime(){
        return event.getTimer();
    }
}
