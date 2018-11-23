package circusjunior.satansim.dataGlobal.Evnets;

import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEvent;

public class SacrificeEvent extends CataclysmEvent {
    int i =0;
    @Override
    public void activateEvent() {
        System.out.println("SacraficeEventWasActivated");
        if(i==10){
            System.out.println("Sacrafice!!!!!");
            i=0;
        }else i++;
    }
}
