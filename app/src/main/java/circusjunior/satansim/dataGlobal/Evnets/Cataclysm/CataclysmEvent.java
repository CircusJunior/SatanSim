package circusjunior.satansim.dataGlobal.Evnets.Cataclysm;

import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public abstract class CataclysmEvent extends Event {
    CataclysmModel parent;



    @Override
    public void deleteEvent(){
        parent.setIs_Active(false);
        super.deleteEvent();
    }
}
