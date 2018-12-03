package circusjunior.satansim.dataGlobal.economy;

import android.content.res.Resources;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public abstract class CataclysmTimers extends CataclysmEnum {
    //Rituals
    public static final int DEFAULT_TIMER=1;
    public static final int RITUALS_1_TIMER = 1;
    public static final int RITUALS_2_TIMER = 3;
    public static final int RITUALS_3_TIMER = 4;
    public static final int RITUALS_4_TIMER = 8;
    public static final int RITUALS_5_TIMER = 12;
    public static final int RITUALS_6_TIMER = 1;
    public static final int RITUALS_7_TIMER = 3;
    public static final int RITUALS_8_TIMER = 4;
    public static final int RITUALS_9_TIMER = 8;
    public static final int RITUALS_10_TIMER = 12;

    public static final int getRitualsTimer(String name){
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
            case (RITUALS_6):
                return RITUALS_6_TIMER;
            case(RITUALS_7):
                return RITUALS_7_TIMER;
            case(RITUALS_8):
                return RITUALS_8_TIMER;
            case (RITUALS_9):
                return RITUALS_9_TIMER;
            case(RITUALS_10):
                return RITUALS_10_TIMER;
            default: throw new Resources.NotFoundException();
        }

    }

    //Hunger
    public static final int HUNGER_1_TIMER = 0;
    public static final int HUNGER_2_TIMER = 15;
    public static final int HUNGER_3_TIMER = 30;
    public static final int HUNGER_4_TIMER = 100;
    public static final int HUNGER_5_TIMER = 250;
    public static final int HUNGER_6_TIMER = 0;
    public static final int HUNGER_7_TIMER = 0;
    public static final int HUNGER_8_TIMER = 0;
    public static final int HUNGER_9_TIMER = 0;
    public static final int HUNGER_10_TIMER = 0;

    private static final int getHungerTimer(String name){
        switch(name){
            case (HUNGER_1):
                return HUNGER_1_TIMER;
            case(HUNGER_2):
                return HUNGER_2_TIMER;
            case(HUNGER_3):
                return HUNGER_3_TIMER;
            case (HUNGER_4):
                return HUNGER_4_TIMER;
            case(HUNGER_5):
                return HUNGER_5_TIMER;
            case (HUNGER_6):
                return HUNGER_6_TIMER;
            case(HUNGER_7):
                return HUNGER_7_TIMER;
            case(HUNGER_8):
                return HUNGER_8_TIMER;
            case (HUNGER_9):
                return HUNGER_9_TIMER;
            case(HUNGER_10):
                return HUNGER_10_TIMER;
            default: throw new Resources.NotFoundException();
        }


    }

    //Plague
    public static final int PLAGUE_1_TIMER = 0;
    public static final int PLAGUE_2_TIMER = 15;
    public static final int PLAGUE_3_TIMER = 30;
    public static final int PLAGUE_4_TIMER = 100;
    public static final int PLAGUE_5_TIMER = 250;
    public static final int PLAGUE_6_TIMER = 0;
    public static final int PLAGUE_7_TIMER = 0;
    public static final int PLAGUE_8_TIMER = 0;
    public static final int PLAGUE_9_TIMER = 0;
    public static final int PLAGUE_10_TIMER = 0;


    private static final int getPlagueTimer(String name){
        switch(name){
            case (PLAGUE_1):
                return PLAGUE_1_TIMER;
            case(PLAGUE_2):
                return PLAGUE_2_TIMER;
            case(PLAGUE_3):
                return PLAGUE_3_TIMER;
            case (PLAGUE_4):
                return PLAGUE_4_TIMER;
            case(PLAGUE_5):
                return PLAGUE_5_TIMER;
            case (PLAGUE_6):
                return PLAGUE_6_TIMER;
            case(PLAGUE_7):
                return PLAGUE_7_TIMER;
            case(PLAGUE_8):
                return PLAGUE_8_TIMER;
            case (PLAGUE_9):
                return PLAGUE_9_TIMER;
            case(PLAGUE_10):
                return PLAGUE_10_TIMER;
            default: throw new Resources.NotFoundException();
        }


    }

    //War
    public static final int WAR_1_TIMER = 0;
    public static final int WAR_2_TIMER = 15;
    public static final int WAR_3_TIMER = 30;
    public static final int WAR_4_TIMER = 100;
    public static final int WAR_5_TIMER = 250;
    public static final int WAR_6_TIMER = 0;
    public static final int WAR_7_TIMER = 0;
    public static final int WAR_8_TIMER = 0;
    public static final int WAR_9_TIMER = 0;
    public static final int WAR_10_TIMER = 0;


    private static final int getWarTimer(String name){
        switch(name){
            case (WAR_1):
                return WAR_1_TIMER;
            case(WAR_2):
                return WAR_2_TIMER;
            case(WAR_3):
                return WAR_3_TIMER;
            case (WAR_4):
                return WAR_4_TIMER;
            case(WAR_5):
                return WAR_5_TIMER;
            case (WAR_6):
                return WAR_6_TIMER;
            case(WAR_7):
                return WAR_7_TIMER;
            case(WAR_8):
                return WAR_8_TIMER;
            case (WAR_9):
                return WAR_9_TIMER;
            case(WAR_10):
                return WAR_10_TIMER;
            default: throw new Resources.NotFoundException();
        }


    }

    //Death
    public static final int DEATH_1_TIMER = 0;
    public static final int DEATH_2_TIMER = 15;
    public static final int DEATH_3_TIMER = 30;
    public static final int DEATH_4_TIMER = 100;
    public static final int DEATH_5_TIMER = 250;
    public static final int DEATH_6_TIMER = 0;
    public static final int DEATH_7_TIMER = 0;
    public static final int DEATH_8_TIMER = 0;
    public static final int DEATH_9_TIMER = 0;
    public static final int DEATH_10_TIMER = 0;


    private static final int getDeathTimer(String name){
        switch(name){
            case (DEATH_1):
                return DEATH_1_TIMER;
            case(DEATH_2):
                return DEATH_2_TIMER;
            case(DEATH_3):
                return DEATH_3_TIMER;
            case (DEATH_4):
                return DEATH_4_TIMER;
            case(DEATH_5):
                return DEATH_5_TIMER;
            case (DEATH_6):
                return DEATH_6_TIMER;
            case(DEATH_7):
                return DEATH_7_TIMER;
            case(DEATH_8):
                return DEATH_8_TIMER;
            case (DEATH_9):
                return DEATH_9_TIMER;
            case(DEATH_10):
                return DEATH_10_TIMER;
            default: throw new Resources.NotFoundException();
        }


    }




    /**
     *
     * @param name name of Ritual
     * @return Timar of named Ritual
     * @deprecated
     * @throws android.content.res.Resources.NotFoundException
     */
    public static final int getTimer(String name){
        return getRitualsTimer(name);
    }

    /**
     *
     * @param name name of cataclysm
     * @param type type of cataclysm
     * @return 0 if not found. Timar of named Cataclysm of type
     */

    public static final int getTimer(String name,String type) {
        try {
            switch (type) {
                case (TYPE_RITUALS):
                    return getRitualsTimer(name);
                case (TYPE_HUNGER):
                    return getHungerTimer(name);
                case (TYPE_PLAGUE):
                    return getPlagueTimer(name);
                case (TYPE_WAR):
                    return getWarTimer(name);
                case (TYPE_DEATH):
                    return getDeathTimer(name);
                default:return DEFAULT_TIMER;
            }
        }catch(Resources.NotFoundException ex){
            return DEFAULT_TIMER;
        }
    }
}
