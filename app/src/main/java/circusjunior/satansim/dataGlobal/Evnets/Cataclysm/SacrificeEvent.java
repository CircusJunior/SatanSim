package circusjunior.satansim.dataGlobal.Evnets.Cataclysm;

import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;
import circusjunior.satansim.dataGlobal.Numeric.Discharge;
import circusjunior.satansim.dataGlobal.Numeric.PerSecondCounter;
import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.dataGlobal.Valuta.Valuta;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class SacrificeEvent extends CataclysmEvent  {
    private int timeRemaining =0;
    private final int timer=15;
    DifficultInt cost;

    public SacrificeEvent(CataclysmModel parent){
        this.parent = parent;
        cost = new DifficultInt();
        cost.addInt(Discharge.HUNDRED,100);
    }

    @Override
    public void activateEvent() {
        if(timeRemaining==0){
            Valuta soul = SoulValuta.get_instance();
            soul.addValuta(cost);
            soul.refreshViewValuta();
            PerSecondCounter.get_instance().add(cost);
            timeRemaining=timer;
        }else timeRemaining--;
    }
}
