package circusjunior.satansim.dataGlobal.Valuta;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public class LakeyValuta extends Valuta{
    private static LakeyValuta _instance =null;
    private LakeyValuta(){
        super();
    }


    public static synchronized LakeyValuta get_instance(){
        if(_instance==null){
            synchronized (LakeyValuta.class){
                if(_instance==null)
                    _instance = new LakeyValuta();
            }
        }
        return _instance;
    }
}
