package circusjunior.satansim.features.cataclysm.domain.model.cataclysms;

import circusjunior.satansim.dataGlobal.Evnets.ActiveEventList;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEvent;

public abstract class CataclysmModel {
    protected String id;
    protected CataclysmEvent event;
    protected boolean is_Active;

    public String getID(){
        return id;
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

    }
}
