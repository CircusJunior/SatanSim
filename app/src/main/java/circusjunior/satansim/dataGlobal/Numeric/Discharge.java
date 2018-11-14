package circusjunior.satansim.dataGlobal.Numeric;

import java.util.ArrayList;
import java.util.List;

public class Discharge {
    public static final int DIS_VALUE = 1000;
    public static final String HUNDRED ="Soul";
    public static final String THOUSAND ="K";
    public static final String MILLION = "M";
    public static final String TRILLION = "T";
    public static final String BILLION ="B";
    public static final String QUADROLYON = "Q";

    public static final List<String> DISCHARGE_LIST = new ArrayList<String>(){
        {
            add(THOUSAND);
            add(MILLION);
            add(BILLION);
            add(TRILLION);
            add(QUADROLYON);
            add(HUNDRED);
        }
    };

    public static String getNext(String discharge){
        switch (discharge){
            case THOUSAND:
                return MILLION;
            case MILLION:
                return BILLION;
            case BILLION:
                return TRILLION;
            case TRILLION:
                return QUADROLYON;
            case HUNDRED:
                return THOUSAND;
        }
        return "";
    }
}
