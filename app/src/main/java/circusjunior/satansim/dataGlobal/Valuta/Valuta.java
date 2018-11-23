package circusjunior.satansim.dataGlobal.Valuta;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;
import circusjunior.satansim.dataGlobal.Interface.ValutaInterface;

public abstract class Valuta implements ValutaInterface {
    private String viewValue;
    private DifficultInt valuteValue;

    public Valuta(){
        valuteValue = new DifficultInt();
        refreshViewValuta();
    }

    @Override
    public String getViewValue() {
        return viewValue;
    }

    public void refreshViewValuta(){
        String discharge = valuteValue.getActualDischarge();
        viewValue = Integer.toString(valuteValue.getDischarge(discharge))+discharge;
    }

    public synchronized void addValuta(DifficultInt difficultInt ){
        valuteValue.addInt(difficultInt);
    }

    public synchronized void minusValuta(DifficultInt difficultInt){
        valuteValue.minusInt(difficultInt);
    }

    public boolean isEnough(DifficultInt cost){
        return false;
    };


}
