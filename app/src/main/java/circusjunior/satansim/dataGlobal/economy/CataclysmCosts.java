package circusjunior.satansim.dataGlobal.economy;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public class CataclysmCosts extends CataclysmEnum{
    public static final DifficultInt RITUALS_DEFAULT_COST = new DifficultInt(0);
    public static final DifficultInt RITUALS_1_COST = new DifficultInt(7,825);
    public static final DifficultInt RITUALS_2_COST = new DifficultInt(1,000);
    public static final DifficultInt RITUALS_3_COST = new DifficultInt(2,750);
    public static final DifficultInt RITUALS_4_COST = new DifficultInt(4,025);
    public static final DifficultInt RITUALS_5_COST = new DifficultInt(7,825);

    public static final DifficultInt getCost(String name){
        switch(name){
            case (RITUALS_1):
                return RITUALS_1_COST;
            case(RITUALS_2):
                return RITUALS_2_COST;
            case(RITUALS_3):
                return RITUALS_3_COST;
            case (RITUALS_4):
                return RITUALS_4_COST;
            case(RITUALS_5):
                return RITUALS_5_COST;
            default:
                return RITUALS_DEFAULT_COST;
        }

    }
}

