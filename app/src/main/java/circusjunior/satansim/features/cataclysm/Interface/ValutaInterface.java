package circusjunior.satansim.features.cataclysm.Interface;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public interface ValutaInterface {
    String getViewValue();
    boolean isEnough(DifficultInt cost);
    void addValuta(DifficultInt difficultInt );
    void minusValuta(DifficultInt difficultInt);
}
