package circusjunior.satansim.dataGlobal.economy;

import android.content.res.Resources;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public abstract class CataclysmSoulProfit extends CataclysmEnum {
    public static final DifficultInt DEFAULT_PROFIT = new DifficultInt(0);
    
    //rituals
    public static final DifficultInt RITUALS_1_PROFIT = new DifficultInt(1);
    public static final DifficultInt RITUALS_2_PROFIT = new DifficultInt(2);
    public static final DifficultInt RITUALS_3_PROFIT = new DifficultInt(5);
    public static final DifficultInt RITUALS_4_PROFIT = new DifficultInt(10);
    public static final DifficultInt RITUALS_5_PROFIT = new DifficultInt(25);
    public static final DifficultInt RITUALS_6_PROFIT = new DifficultInt(0);
    public static final DifficultInt RITUALS_7_PROFIT = new DifficultInt(0);
    public static final DifficultInt RITUALS_8_PROFIT = new DifficultInt(0);
    public static final DifficultInt RITUALS_9_PROFIT = new DifficultInt(0);
    public static final DifficultInt RITUALS_10_PROFIT = new DifficultInt(0);

    public static final DifficultInt getRitualsProfit(String name){
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
            case (RITUALS_6):
                return RITUALS_6_PROFIT;
            case(RITUALS_7):
                return RITUALS_7_PROFIT;
            case(RITUALS_8):
                return RITUALS_8_PROFIT;
            case (RITUALS_9):
                return RITUALS_9_PROFIT;
            case(RITUALS_10):
                return RITUALS_10_PROFIT;
            default: throw new Resources.NotFoundException();
        }

    }

    //Hunger
    public static final DifficultInt HUNGER_1_PROFIT = new DifficultInt(0);
    public static final DifficultInt HUNGER_2_PROFIT = new DifficultInt(15);
    public static final DifficultInt HUNGER_3_PROFIT = new DifficultInt(30);
    public static final DifficultInt HUNGER_4_PROFIT = new DifficultInt(100);
    public static final DifficultInt HUNGER_5_PROFIT = new DifficultInt(250);
    public static final DifficultInt HUNGER_6_PROFIT = new DifficultInt(0);
    public static final DifficultInt HUNGER_7_PROFIT = new DifficultInt(0);
    public static final DifficultInt HUNGER_8_PROFIT = new DifficultInt(0);
    public static final DifficultInt HUNGER_9_PROFIT = new DifficultInt(0);
    public static final DifficultInt HUNGER_10_PROFIT = new DifficultInt(0);

    private static final DifficultInt getHungerProfit(String name){
        switch(name){
            case (HUNGER_1):
                return HUNGER_1_PROFIT;
            case(HUNGER_2):
                return HUNGER_2_PROFIT;
            case(HUNGER_3):
                return HUNGER_3_PROFIT;
            case (HUNGER_4):
                return HUNGER_4_PROFIT;
            case(HUNGER_5):
                return HUNGER_5_PROFIT;
            case (HUNGER_6):
                return HUNGER_6_PROFIT;
            case(HUNGER_7):
                return HUNGER_7_PROFIT;
            case(HUNGER_8):
                return HUNGER_8_PROFIT;
            case (HUNGER_9):
                return HUNGER_9_PROFIT;
            case(HUNGER_10):
                return HUNGER_10_PROFIT;
            default: throw new Resources.NotFoundException();
        }


    }

    //Plague
    public static final DifficultInt PLAGUE_1_PROFIT = new DifficultInt(0);
    public static final DifficultInt PLAGUE_2_PROFIT = new DifficultInt(15);
    public static final DifficultInt PLAGUE_3_PROFIT = new DifficultInt(30);
    public static final DifficultInt PLAGUE_4_PROFIT = new DifficultInt(100);
    public static final DifficultInt PLAGUE_5_PROFIT = new DifficultInt(250);
    public static final DifficultInt PLAGUE_6_PROFIT = new DifficultInt(0);
    public static final DifficultInt PLAGUE_7_PROFIT = new DifficultInt(0);
    public static final DifficultInt PLAGUE_8_PROFIT = new DifficultInt(0);
    public static final DifficultInt PLAGUE_9_PROFIT = new DifficultInt(0);
    public static final DifficultInt PLAGUE_10_PROFIT = new DifficultInt(0);


    private static final DifficultInt getPlagueProfit(String name){
        switch(name){
            case (PLAGUE_1):
                return PLAGUE_1_PROFIT;
            case(PLAGUE_2):
                return PLAGUE_2_PROFIT;
            case(PLAGUE_3):
                return PLAGUE_3_PROFIT;
            case (PLAGUE_4):
                return PLAGUE_4_PROFIT;
            case(PLAGUE_5):
                return PLAGUE_5_PROFIT;
            case (PLAGUE_6):
                return PLAGUE_6_PROFIT;
            case(PLAGUE_7):
                return PLAGUE_7_PROFIT;
            case(PLAGUE_8):
                return PLAGUE_8_PROFIT;
            case (PLAGUE_9):
                return PLAGUE_9_PROFIT;
            case(PLAGUE_10):
                return PLAGUE_10_PROFIT;
            default: throw new Resources.NotFoundException();
        }


    }

    //War
    public static final DifficultInt WAR_1_PROFIT = new DifficultInt(0);
    public static final DifficultInt WAR_2_PROFIT = new DifficultInt(15);
    public static final DifficultInt WAR_3_PROFIT = new DifficultInt(30);
    public static final DifficultInt WAR_4_PROFIT = new DifficultInt(100);
    public static final DifficultInt WAR_5_PROFIT = new DifficultInt(250);
    public static final DifficultInt WAR_6_PROFIT = new DifficultInt(0);
    public static final DifficultInt WAR_7_PROFIT = new DifficultInt(0);
    public static final DifficultInt WAR_8_PROFIT = new DifficultInt(0);
    public static final DifficultInt WAR_9_PROFIT = new DifficultInt(0);
    public static final DifficultInt WAR_10_PROFIT = new DifficultInt(0);


    private static final DifficultInt getWarProfit (String name){
        switch(name){
            case (WAR_1):
                return WAR_1_PROFIT;
            case(WAR_2):
                return WAR_2_PROFIT;
            case(WAR_3):
                return WAR_3_PROFIT;
            case (WAR_4):
                return WAR_4_PROFIT;
            case(WAR_5):
                return WAR_5_PROFIT;
            case (WAR_6):
                return WAR_6_PROFIT;
            case(WAR_7):
                return WAR_7_PROFIT;
            case(WAR_8):
                return WAR_8_PROFIT;
            case (WAR_9):
                return WAR_9_PROFIT;
            case(WAR_10):
                return WAR_10_PROFIT;
            default: throw new Resources.NotFoundException();
        }


    }

    //Death
    public static final DifficultInt DEATH_1_PROFIT = new DifficultInt(0);
    public static final DifficultInt DEATH_2_PROFIT = new DifficultInt(15);
    public static final DifficultInt DEATH_3_PROFIT = new DifficultInt(30);
    public static final DifficultInt DEATH_4_PROFIT = new DifficultInt(100);
    public static final DifficultInt DEATH_5_PROFIT = new DifficultInt(250);
    public static final DifficultInt DEATH_6_PROFIT = new DifficultInt(0);
    public static final DifficultInt DEATH_7_PROFIT = new DifficultInt(0);
    public static final DifficultInt DEATH_8_PROFIT = new DifficultInt(0);
    public static final DifficultInt DEATH_9_PROFIT = new DifficultInt(0);
    public static final DifficultInt DEATH_10_PROFIT = new DifficultInt(0);


    private static final DifficultInt getDeathProfit(String name){
        switch(name){
            case (DEATH_1):
                return DEATH_1_PROFIT;
            case(DEATH_2):
                return DEATH_2_PROFIT;
            case(DEATH_3):
                return DEATH_3_PROFIT;
            case (DEATH_4):
                return DEATH_4_PROFIT;
            case(DEATH_5):
                return DEATH_5_PROFIT;
            case (DEATH_6):
                return DEATH_6_PROFIT;
            case(DEATH_7):
                return DEATH_7_PROFIT;
            case(DEATH_8):
                return DEATH_8_PROFIT;
            case (DEATH_9):
                return DEATH_9_PROFIT;
            case(DEATH_10):
                return DEATH_10_PROFIT;
            default: throw new Resources.NotFoundException();
        }


    }
    
    
    
    
    
    /**
     *
     * @param name name of Ritual
     * @return PROFIT of named Ritual
     * @deprecated
     * @throws android.content.res.Resources.NotFoundException
     */
    public static final DifficultInt getProfit(String name){
        return getRitualsProfit(name);
    }

    /**
     *
     * @param name name of cataclysm
     * @param type type of cataclysm
     * @return 0 if not found. PROFIT of named Cataclysm of type
     */

    public static final DifficultInt getProfit(String name, String type){
        try {
            switch (type) {
                case (TYPE_RITUALS):
                    return getRitualsProfit(name);
                case (TYPE_HUNGER):
                    return getHungerProfit(name);
                case (TYPE_PLAGUE):
                    return getPlagueProfit(name);
                case (TYPE_WAR):
                    return getWarProfit(name);
                case (TYPE_DEATH):
                    return getDeathProfit(name);
                default:return DEFAULT_PROFIT;
            }
        }catch(Resources.NotFoundException ex){
            return DEFAULT_PROFIT;
        }

    }
}
