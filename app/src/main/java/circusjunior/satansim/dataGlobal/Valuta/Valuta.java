package circusjunior.satansim.dataGlobal.Valuta;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;
import circusjunior.satansim.dataGlobal.Numeric.Discharge;
import circusjunior.satansim.features.cataclysm.Interface.ValutaInterface;

public abstract class Valuta implements ValutaInterface {
    private String viewValue;
    private  DifficultInt valuteValue;

    public Valuta(){
        valuteValue = new DifficultInt();
        refreshViewValuta();
    }

    @Override
    public String getViewValue() {
        return viewValue;
    }

    public void refreshViewValuta(){
        viewValue = valuteValue.getIntView();
    }

    public synchronized void addValuta(DifficultInt difficultInt ){
        synchronized (DifficultInt.class) {
            valuteValue.addInt(difficultInt);
        }
    }

    public synchronized void minusValuta(DifficultInt difficultInt){
        synchronized (DifficultInt.class) {
        valuteValue.minusInt(difficultInt);
        }
    }

    public boolean isEnough(DifficultInt cost){
        if (cost.compare(valuteValue)<=0) return true;
        return false;
    };


}
