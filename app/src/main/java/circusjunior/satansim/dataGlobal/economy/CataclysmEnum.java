package circusjunior.satansim.dataGlobal.economy;

import java.util.ArrayList;
import java.util.List;


public abstract class CataclysmEnum {
    //TODO: Write all cataclysm in this enum
    public static final int NUMBER_OF_CATACLYSM_IN_STAR = 5;
    //CataclysmTypes
    public static  final  int NUMBER_OF_TYPES = 5;
    public static final String TYPE_RITUALS = "RITUALS_TYPE";
    public static final String TYPE_HUNGER = "HUNGER_TYPE";
    public static final String TYPE_PLAGUE = "PLAGUE_TYPE";
    public static final String TYPE_WAR = "WAR_TYPE";
    public static final String TYPE_DEATH = "DEATH_TYPE";

    public static final List<String>  getTypesList = new ArrayList<String>(){
        {
            add(TYPE_RITUALS);
            add(TYPE_WAR);
            add(TYPE_PLAGUE);
            add(TYPE_HUNGER);
            add(TYPE_DEATH);
        }
    };

    //Rituals
    public static final  int NUMBER_OF_TYPE_RITUALS =10;
    public static final  String RITUALS_1 = "RITUALS_1";
    public static final  String RITUALS_2 ="RITUALS_2";
    public static final  String RITUALS_3 ="RITUALS_3";
    public static final  String RITUALS_4 = "RITUALS_4";
    public static final  String RITUALS_5 = "RITUALS_5";
    public static final  String RITUALS_6 = "RITUALS_6";
    public static final  String RITUALS_7 ="RITUALS_7";
    public static final  String RITUALS_8 ="RITUALS_8";
    public static final  String RITUALS_9 = "RITUALS_9";
    public static final  String RITUALS_10 = "RITUALS_10";





    public static final List<String> RITUALS_TYPE_LIST = new ArrayList<String>(){
        {
            add(RITUALS_1);
            add(RITUALS_2);
            add(RITUALS_3);
            add(RITUALS_4);
            add(RITUALS_5);
            add(RITUALS_6);
            add(RITUALS_7);
            add(RITUALS_8);
            add(RITUALS_9);
            add(RITUALS_10);
        }
    };

    //Hunger
    public static final  int NUMBER_OF_TYPE_HUNGER =10;
    public static final  String HUNGER_1 = "HUNGER_1";
    public static final  String HUNGER_2 ="HUNGER_2";
    public static final  String HUNGER_3 ="HUNGER_3";
    public static final  String HUNGER_4 = "HUNGER_4";
    public static final  String HUNGER_5 = "HUNGER_5";
    public static final  String HUNGER_6 = "HUNGER_6";
    public static final  String HUNGER_7 ="HUNGER_7";
    public static final  String HUNGER_8 ="HUNGER_8";
    public static final  String HUNGER_9 = "HUNGER_9";
    public static final  String HUNGER_10 = "HUNGER_10";


    public static final List<String> HUNGER_TYPE_LIST = new ArrayList<String>(){
        {
            add(HUNGER_1);
            add(HUNGER_2);
            add(HUNGER_3);
            add(HUNGER_4);
            add(HUNGER_5);
            add(HUNGER_6);
            add(HUNGER_7);
            add(HUNGER_8);
            add(HUNGER_9);
            add(HUNGER_10);
        }
    };

    //Plague
    public static final  int NUMBER_OF_TYPE_PLAGUE =10;
    public static final  String PLAGUE_1 = "PLAGUE_1";
    public static final  String PLAGUE_2 ="PLAGUE_2";
    public static final  String PLAGUE_3 ="PLAGUE_3";
    public static final  String PLAGUE_4 = "PLAGUE_4";
    public static final  String PLAGUE_5 = "PLAGUE_5";
    public static final  String PLAGUE_6 = "PLAGUE_6";
    public static final  String PLAGUE_7 ="PLAGUE_7";
    public static final  String PLAGUE_8 ="PLAGUE_8";
    public static final  String PLAGUE_9 = "PLAGUE_9";
    public static final  String PLAGUE_10 = "PLAGUE_10";
    public static final List<String> PLAGUE_TYPE_LIST = new ArrayList<String>(){
        {
            add(PLAGUE_1);
            add(PLAGUE_2);
            add(PLAGUE_3);
            add(PLAGUE_4);
            add(PLAGUE_5);
            add(PLAGUE_6);
            add(PLAGUE_7);
            add(PLAGUE_8);
            add(PLAGUE_9);
            add(PLAGUE_10);
        }
    };
    //War
    public static final  int NUMBER_OF_TYPE_WAR =10;
    public static final  String WAR_1 = "WAR_1";
    public static final  String WAR_2 ="WAR_2";
    public static final  String WAR_3 ="WAR_3";
    public static final  String WAR_4 = "WAR_4";
    public static final  String WAR_5 = "WAR_5";
    public static final  String WAR_6 = "WAR_6";
    public static final  String WAR_7 ="WAR_7";
    public static final  String WAR_8 ="WAR_8";
    public static final  String WAR_9 = "WAR_9";
    public static final  String WAR_10 = "WAR_10";
    public static final List<String> WAR_TYPE_LIST = new ArrayList<String>(){
        {
            add(WAR_1);
            add(WAR_2);
            add(WAR_3);
            add(WAR_4);
            add(WAR_5);
            add(WAR_6);
            add(WAR_7);
            add(WAR_8);
            add(WAR_9);
            add(WAR_10);
        }
    };
    //Death
    public static final  int NUMBER_OF_TYPE_DEATH =10;
    public static final  String DEATH_1 = "DEATH_1";
    public static final  String DEATH_2 ="DEATH_2";
    public static final  String DEATH_3 ="DEATH_3";
    public static final  String DEATH_4 = "DEATH_4";
    public static final  String DEATH_5 = "DEATH_5";
    public static final  String DEATH_6 = "DEATH_6";
    public static final  String DEATH_7 ="DEATH_7";
    public static final  String DEATH_8 ="DEATH_8";
    public static final  String DEATH_9 = "DEATH_9";
    public static final  String DEATH_10 = "DEATH_10";
    public static final List<String> DEATH_TYPE_LIST = new ArrayList<String>(){
        {
            add(DEATH_1);
            add(DEATH_2);
            add(DEATH_3);
            add(DEATH_4);
            add(DEATH_5);
            add(DEATH_6);
            add(DEATH_7);
            add(DEATH_8);
            add(DEATH_9);
            add(DEATH_10);

        }
    };

    //METHODS
    public static final List<String> getCataclysmListByType(String type){
        switch (type){
            case(TYPE_RITUALS):
                return RITUALS_TYPE_LIST;
            case(TYPE_HUNGER):
                return HUNGER_TYPE_LIST;
            case(TYPE_PLAGUE):
                return PLAGUE_TYPE_LIST;
            case(TYPE_WAR):
                return WAR_TYPE_LIST;
            case(TYPE_DEATH):
                return DEATH_TYPE_LIST;

                default:
                    return new ArrayList<String>();
            }
        }
    }

