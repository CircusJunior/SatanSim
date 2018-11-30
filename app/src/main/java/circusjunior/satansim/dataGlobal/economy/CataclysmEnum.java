package circusjunior.satansim.dataGlobal.economy;

import java.util.ArrayList;
import java.util.List;


public class CataclysmEnum {
    //TODO: Write all cataclysm in this enum
    public static final int NUMBER_OF_CATACLYSM_IN_STAR = 5;
    //CataclysmTypes
    public static  final  int NUMBER_OF_TYPES = 5;
    public static final String TYPE_1 = "RITUALS_TYPE";
    public static final String TYPE_2 = "HUNGER_TYPE";
    public static final String TYPE_3 = "PLAGUE_TYPE";
    public static final String TYPE_4 = "WAR_TYPE";
    public static final String TYPE_5 = "DEATH_TYPE";

    public static final List<String>  getTypesList = new ArrayList<String>(){
        {
            add(TYPE_1);
            add(TYPE_4);
            add(TYPE_3);
            add(TYPE_2);
            add(TYPE_5);
        }
    };

    //Rituals
    public static final  int NUMBER_OF_TYPE_1 =5;
    public static final  String RITUALS_1 = "SACRIFICE";
    public static final  String RITUALS_2 ="SADOM AND GAMORA";
    public static final  String RITUALS_3 ="GREATE DEPRESSION";
    public static final  String RITUALS_4 = "FRIDAY 13'TH";
    public static final  String RITUALS_5 = "VALPURGES NIGHT";


    public static final List<String> getRitualsist = new ArrayList<String>(){
        {
            add(RITUALS_1);
            add(RITUALS_2);
            add(RITUALS_3);
            add(RITUALS_4);
            add(RITUALS_5);
        }
    };

    //Hunger
    //Plague
    //War
    //Death

    //METHODS


}
