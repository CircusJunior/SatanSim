package circusjunior.satansim.dataGlobal.Evnets;

import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;
import circusjunior.satansim.dataGlobal.Numeric.Discharge;
import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.dataGlobal.Valuta.Valuta;

public class TestEvent extends Event {
    private DifficultInt cost;

    public TestEvent(){
        cost = new DifficultInt();
        cost.addInt(Discharge.HUNDRED,100);
    }
    @Override
     public void activateEvent() {
        Valuta soul = SoulValuta.get_instance();
        soul.addValuta(cost);
        soul.refreshViewValuta();
        System.out.println("Test Event Activated: you have " + soul.getViewValue()+" souls");
    }

}
