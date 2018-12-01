package circusjunior.satansim.dataGlobal.economy;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public abstract class CataclysmProfit extends CataclysmEnum {
    public static final DifficultInt RITUALS_DEFAULT_PROFIT = new DifficultInt(0);
    public static final DifficultInt RITUALS_1_PROFIT = new DifficultInt(1);
    public static final DifficultInt RITUALS_2_PROFIT = new DifficultInt(2);
    public static final DifficultInt RITUALS_3_PROFIT = new DifficultInt(5);
    public static final DifficultInt RITUALS_4_PROFIT = new DifficultInt(10);
    public static final DifficultInt RITUALS_5_PROFIT = new DifficultInt(25);

    public static final DifficultInt getProfit(String name){
        switch(name){
            case (RITUALS_1):
                return RITUALS_1_PROFIT;
            case(RITUALS_2):
                return RITUALS_2_PROFIT;
            case(RITUALS_3):
                return RITUALS_3_PROFIT;
            case (RITUALS_4):
                return RITUALS_4_PROFIT;
            case(RITUALS_5):
                return RITUALS_5_PROFIT;
            default:
                return RITUALS_DEFAULT_PROFIT;
        }

    }
}
