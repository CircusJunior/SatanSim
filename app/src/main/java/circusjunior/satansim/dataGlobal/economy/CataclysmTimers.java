package circusjunior.satansim.dataGlobal.economy;

public class CataclysmTimers extends CataclysmEnum {
    //Rituals
    public static final int RITUALS_DEFAULT_TIMER=1;
    public static final int RITUALS_1_TIMER = 3;
    public static final int RITUALS_2_TIMER = 3;
    public static final int RITUALS_3_TIMER = 3;
    public static final int RITUALS_4_TIMER = 3;
    public static final int RITUALS_5_TIMER = 3;


    public static final int getTimer(String name){
        switch(name){
            case (RITUALS_1):
                return RITUALS_1_TIMER;
            case(RITUALS_2):
                return RITUALS_2_TIMER;
            case(RITUALS_3):
                return RITUALS_3_TIMER;
            case (RITUALS_4):
                return RITUALS_4_TIMER;
            case(RITUALS_5):
                return RITUALS_5_TIMER;
            default:
                return RITUALS_DEFAULT_TIMER;
        }

    }
}
