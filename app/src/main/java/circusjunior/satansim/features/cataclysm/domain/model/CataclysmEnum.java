package circusjunior.satansim.features.cataclysm.domain.model;

import java.util.ArrayList;
import java.util.List;


public class CataclysmEnum {
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
    public static final  String RITUALS_1 = "SACRIFICE";
    public static final  String RITUALS_2 ="SADOM AND GAMORA";
    public static final  String RITUALS_3 ="GREATE DEPRESSION";
    public static final  String RITUALS_4 = "FRIDAY 13'TH";
    public static final  String RITUALS_5 = "VALPURGES NIGHT";
    //Hunger
    //Plague
    //War
    //Death

    //METHODS


}
