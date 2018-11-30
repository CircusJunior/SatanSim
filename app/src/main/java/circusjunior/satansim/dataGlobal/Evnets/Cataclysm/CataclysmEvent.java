package circusjunior.satansim.dataGlobal.Evnets.Cataclysm;

import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;
import circusjunior.satansim.dataGlobal.Numeric.PerSecondCounter;
import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.dataGlobal.Valuta.Valuta;
import circusjunior.satansim.dataGlobal.economy.CataclysmProfit;
import circusjunior.satansim.dataGlobal.economy.CataclysmTimers;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class CataclysmEvent extends Event {
    protected CataclysmModel parent;
    protected int timeRemaining;
    protected final int timer;
    protected DifficultInt cost;
    protected String name;

    public CataclysmEvent(CataclysmModel parent){
        name = parent.getName();
        cost = new DifficultInt();
        this.parent=parent;
        timer = CataclysmTimers.getTimer(name);
        cost = CataclysmProfit.getCost(name);
        timeRemaining=timer;
    }

    @Override
    public void activateEvent() {
        if(timeRemaining==0){
            Valuta soul = SoulValuta.get_instance();
            soul.addValuta(cost);
            soul.refreshViewValuta();
            PerSecondCounter.get_instance().add(cost);
            timeRemaining=timer;
            this.deleteEvent();
        }else timeRemaining--;
    }

    public void deleteEvent(){
        parent.setIs_Active(false);
        super.deleteEvent(this);
    }
}
