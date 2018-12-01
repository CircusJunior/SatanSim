package circusjunior.satansim.dataGlobal.Localize;

import android.widget.Switch;

import circusjunior.satansim.R;

import static circusjunior.satansim.dataGlobal.economy.CataclysmEnum.*;

public abstract class Localisator {
    public static int getLocalziseName(String name){
        switch (name){
            //types
            case(TYPE_1):
               return R.string.TYPE_1;
            case(TYPE_2):
                return R.string.TYPE_2;
            case(TYPE_3):
                return R.string.TYPE_3;
            case(TYPE_4):
                return R.string.TYPE_4;
            case(TYPE_5):
                return R.string.TYPE_5;



            //1_type
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
            default: return R.string.ERROR;


        }
    }
}
