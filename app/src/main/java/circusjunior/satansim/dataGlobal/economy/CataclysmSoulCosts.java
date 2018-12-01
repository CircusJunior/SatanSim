package circusjunior.satansim.dataGlobal.economy;

import android.content.res.Resources;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public abstract class CataclysmSoulCosts extends CataclysmEnum{
    public static final DifficultInt DEFAULT_COST = new DifficultInt(0);

    //rituals
    public static final DifficultInt RITUALS_1_COST = new DifficultInt(0);
    public static final DifficultInt RITUALS_2_COST = new DifficultInt(15);
    public static final DifficultInt RITUALS_3_COST = new DifficultInt(30);
    public static final DifficultInt RITUALS_4_COST = new DifficultInt(100);
    public static final DifficultInt RITUALS_5_COST = new DifficultInt(250);
    public static final DifficultInt RITUALS_6_COST = new DifficultInt(0);
    public static final DifficultInt RITUALS_7_COST = new DifficultInt(0);
    public static final DifficultInt RITUALS_8_COST = new DifficultInt(0);
    public static final DifficultInt RITUALS_9_COST = new DifficultInt(0);
    public static final DifficultInt RITUALS_10_COST = new DifficultInt(0);


    private static final DifficultInt getRitualsCost(String name){
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
            case (RITUALS_6):
                return RITUALS_6_COST;
            case(RITUALS_7):
                return RITUALS_7_COST;
            case(RITUALS_8):
                return RITUALS_8_COST;
            case (RITUALS_9):
                return RITUALS_9_COST;
            case(RITUALS_10):
                return RITUALS_10_COST;
            default: throw new Resources.NotFoundException();
        }


    }

    //Hunger
    public static final DifficultInt HUNGER_1_COST = new DifficultInt(0);
    public static final DifficultInt HUNGER_2_COST = new DifficultInt(15);
    public static final DifficultInt HUNGER_3_COST = new DifficultInt(30);
    public static final DifficultInt HUNGER_4_COST = new DifficultInt(100);
    public static final DifficultInt HUNGER_5_COST = new DifficultInt(250);
    public static final DifficultInt HUNGER_6_COST = new DifficultInt(0);
    public static final DifficultInt HUNGER_7_COST = new DifficultInt(0);
    public static final DifficultInt HUNGER_8_COST = new DifficultInt(0);
    public static final DifficultInt HUNGER_9_COST = new DifficultInt(0);
    public static final DifficultInt HUNGER_10_COST = new DifficultInt(0);

    private static final DifficultInt getHungerCost(String name){
        switch(name){
            case (HUNGER_1):
                return HUNGER_1_COST;
            case(HUNGER_2):
                return HUNGER_2_COST;
            case(HUNGER_3):
                return HUNGER_3_COST;
            case (HUNGER_4):
                return HUNGER_4_COST;
            case(HUNGER_5):
                return HUNGER_5_COST;
            case (HUNGER_6):
                return HUNGER_6_COST;
            case(HUNGER_7):
                return HUNGER_7_COST;
            case(HUNGER_8):
                return HUNGER_8_COST;
            case (HUNGER_9):
                return HUNGER_9_COST;
            case(HUNGER_10):
                return HUNGER_10_COST;
            default: throw new Resources.NotFoundException();
        }


    }
    
    //Plague
    public static final DifficultInt PLAGUE_1_COST = new DifficultInt(0);
    public static final DifficultInt PLAGUE_2_COST = new DifficultInt(15);
    public static final DifficultInt PLAGUE_3_COST = new DifficultInt(30);
    public static final DifficultInt PLAGUE_4_COST = new DifficultInt(100);
    public static final DifficultInt PLAGUE_5_COST = new DifficultInt(250);
    public static final DifficultInt PLAGUE_6_COST = new DifficultInt(0);
    public static final DifficultInt PLAGUE_7_COST = new DifficultInt(0);
    public static final DifficultInt PLAGUE_8_COST = new DifficultInt(0);
    public static final DifficultInt PLAGUE_9_COST = new DifficultInt(0);
    public static final DifficultInt PLAGUE_10_COST = new DifficultInt(0);


    private static final DifficultInt getPlagueCost(String name){
        switch(name){
            case (PLAGUE_1):
                return PLAGUE_1_COST;
            case(PLAGUE_2):
                return PLAGUE_2_COST;
            case(PLAGUE_3):
                return PLAGUE_3_COST;
            case (PLAGUE_4):
                return PLAGUE_4_COST;
            case(PLAGUE_5):
                return PLAGUE_5_COST;
            case (PLAGUE_6):
                return PLAGUE_6_COST;
            case(PLAGUE_7):
                return PLAGUE_7_COST;
            case(PLAGUE_8):
                return PLAGUE_8_COST;
            case (PLAGUE_9):
                return PLAGUE_9_COST;
            case(PLAGUE_10):
                return PLAGUE_10_COST;
            default: throw new Resources.NotFoundException();
        }


    }
    
    //War
    public static final DifficultInt WAR_1_COST = new DifficultInt(0);
    public static final DifficultInt WAR_2_COST = new DifficultInt(15);
    public static final DifficultInt WAR_3_COST = new DifficultInt(30);
    public static final DifficultInt WAR_4_COST = new DifficultInt(100);
    public static final DifficultInt WAR_5_COST = new DifficultInt(250);
    public static final DifficultInt WAR_6_COST = new DifficultInt(0);
    public static final DifficultInt WAR_7_COST = new DifficultInt(0);
    public static final DifficultInt WAR_8_COST = new DifficultInt(0);
    public static final DifficultInt WAR_9_COST = new DifficultInt(0);
    public static final DifficultInt WAR_10_COST = new DifficultInt(0);


    private static final DifficultInt getWarCost(String name){
        switch(name){
            case (WAR_1):
                return WAR_1_COST;
            case(WAR_2):
                return WAR_2_COST;
            case(WAR_3):
                return WAR_3_COST;
            case (WAR_4):
                return WAR_4_COST;
            case(WAR_5):
                return WAR_5_COST;
            case (WAR_6):
                return WAR_6_COST;
            case(WAR_7):
                return WAR_7_COST;
            case(WAR_8):
                return WAR_8_COST;
            case (WAR_9):
                return WAR_9_COST;
            case(WAR_10):
                return WAR_10_COST;
            default: throw new Resources.NotFoundException();
        }


    }
    
    //Death
    public static final DifficultInt DEATH_1_COST = new DifficultInt(0);
    public static final DifficultInt DEATH_2_COST = new DifficultInt(15);
    public static final DifficultInt DEATH_3_COST = new DifficultInt(30);
    public static final DifficultInt DEATH_4_COST = new DifficultInt(100);
    public static final DifficultInt DEATH_5_COST = new DifficultInt(250);
    public static final DifficultInt DEATH_6_COST = new DifficultInt(0);
    public static final DifficultInt DEATH_7_COST = new DifficultInt(0);
    public static final DifficultInt DEATH_8_COST = new DifficultInt(0);
    public static final DifficultInt DEATH_9_COST = new DifficultInt(0);
    public static final DifficultInt DEATH_10_COST = new DifficultInt(0);


    private static final DifficultInt getDeathCost(String name){
        switch(name){
            case (DEATH_1):
                return DEATH_1_COST;
            case(DEATH_2):
                return DEATH_2_COST;
            case(DEATH_3):
                return DEATH_3_COST;
            case (DEATH_4):
                return DEATH_4_COST;
            case(DEATH_5):
                return DEATH_5_COST;
            case (DEATH_6):
                return DEATH_6_COST;
            case(DEATH_7):
                return DEATH_7_COST;
            case(DEATH_8):
                return DEATH_8_COST;
            case (DEATH_9):
                return DEATH_9_COST;
            case(DEATH_10):
                return DEATH_10_COST;
            default: throw new Resources.NotFoundException();
        }


    }
    
    
    
    
    /**
     *
     * @param name name of Ritual
     * @return Cost of named Ritual
     * @deprecated
     * @throws android.content.res.Resources.NotFoundException
     */
    public static final DifficultInt getCost(String name){
            return getRitualsCost(name);
    }

    /**
     *
     * @param name name of cataclysm
     * @param type type of cataclysm
     * @return 0 if not found. cost of named Cataclysm of type
     */

    public static final DifficultInt getCost(String name, String type){
        try {
            switch (type) {
                case (TYPE_RITUALS):
                    return getRitualsCost(name);
                case (TYPE_HUNGER):
                    return getHungerCost(name);
                case (TYPE_PLAGUE):
                    return getPlagueCost(name);
                case (TYPE_WAR):
                    return getWarCost(name);
                case (TYPE_DEATH):
                    return getDeathCost(name);
                default:return DEFAULT_COST;

            }
        }catch(Resources.NotFoundException ex){
            return DEFAULT_COST;
        }
    }
}

