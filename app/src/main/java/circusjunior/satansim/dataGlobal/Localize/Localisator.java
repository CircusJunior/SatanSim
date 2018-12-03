package circusjunior.satansim.dataGlobal.Localize;

import circusjunior.satansim.R;

import static circusjunior.satansim.dataGlobal.economy.CataclysmEnum.*;

public abstract class Localisator {
    public static int getLocalziseName(String name){
        switch (name){
            //types
            case(TYPE_RITUALS):
               return R.string.TYPE_RITUALS;
            case(TYPE_HUNGER):
                return R.string.TYPE_HUNGER;
            case(TYPE_PLAGUE):
                return R.string.TYPE_PLAGUE;
            case(TYPE_WAR):
                return R.string.TYPE_WAR;
            case(TYPE_DEATH):
                return R.string.TYPE_DEATH;

            //Rituals_type
            case(RITUALS_1):
                return R.string.RITUALS_1;
            case(RITUALS_2):
                return R.string.RITUALS_2;
            case(RITUALS_3):
                return R.string.RITUALS_3;
            case(RITUALS_4):
                return R.string.RITUALS_4;
            case(RITUALS_5):
                return R.string.RITUALS_5;
            case(RITUALS_6):
                return R.string.RITUALS_6;
            case(RITUALS_7):
                return R.string.RITUALS_7;
            case(RITUALS_8):
                return R.string.RITUALS_8;
            case(RITUALS_9):
                return R.string.RITUALS_9;
            case(RITUALS_10):
                return R.string.RITUALS_10;

            //Hunger_type
            case(HUNGER_1):
                return R.string.HUNGER_1;
            case(HUNGER_2):
                return R.string.HUNGER_2;
            case(HUNGER_3):
                return R.string.HUNGER_3;
            case(HUNGER_4):
                return R.string.HUNGER_4;
            case(HUNGER_5):
                return R.string.HUNGER_5;
            case(HUNGER_6):
                return R.string.HUNGER_6;
            case(HUNGER_7):
                return R.string.HUNGER_7;
            case(HUNGER_8):
                return R.string.HUNGER_8;
            case(HUNGER_9):
                return R.string.HUNGER_9;
            case(HUNGER_10):
                return R.string.HUNGER_10;
                
            //Plague_type
            case(PLAGUE_1):
                return R.string.PLAGUE_1;
            case(PLAGUE_2):
                return R.string.PLAGUE_2;
            case(PLAGUE_3):
                return R.string.PLAGUE_3;
            case(PLAGUE_4):
                return R.string.PLAGUE_4;
            case(PLAGUE_5):
                return R.string.PLAGUE_5;
            case(PLAGUE_6):
                return R.string.PLAGUE_6;
            case(PLAGUE_7):
                return R.string.PLAGUE_7;
            case(PLAGUE_8):
                return R.string.PLAGUE_8;
            case(PLAGUE_9):
                return R.string.PLAGUE_9;
            case(PLAGUE_10):
                return R.string.PLAGUE_10;
                
                //War_type
            case(WAR_1):
                return R.string.WAR_1;
            case(WAR_2):
                return R.string.WAR_2;
            case(WAR_3):
                return R.string.WAR_3;
            case(WAR_4):
                return R.string.WAR_4;
            case(WAR_5):
                return R.string.WAR_5;
            case(WAR_6):
                return R.string.WAR_6;
            case(WAR_7):
                return R.string.WAR_7;
            case(WAR_8):
                return R.string.WAR_8;
            case(WAR_9):
                return R.string.WAR_9;
            case(WAR_10):
                return R.string.WAR_10;
                
            //Death_type
            case(DEATH_1):
                return R.string.DEATH_1;
            case(DEATH_2):
                return R.string.DEATH_2;
            case(DEATH_3):
                return R.string.DEATH_3;
            case(DEATH_4):
                return R.string.DEATH_4;
            case(DEATH_5):
                return R.string.DEATH_5;
            case(DEATH_6):
                return R.string.DEATH_6;
            case(DEATH_7):
                return R.string.DEATH_7;
            case(DEATH_8):
                return R.string.DEATH_8;
            case(DEATH_9):
                return R.string.DEATH_9;
            case(DEATH_10):
                return R.string.DEATH_10;

            default: return R.string.ERROR;


        }
    }
}
