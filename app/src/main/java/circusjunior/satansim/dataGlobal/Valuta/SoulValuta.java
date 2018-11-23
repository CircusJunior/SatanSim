package circusjunior.satansim.dataGlobal.Valuta;

import circusjunior.satansim.dataGlobal.Numeric.DifficultInt;

public class SoulValuta extends Valuta {
    private static SoulValuta _instance =null;
    private SoulValuta(){
        super();
    }


    public static synchronized SoulValuta get_instance(){
        if(_instance==null){
            synchronized (SoulValuta.class){
                if(_instance==null)
                    _instance = new SoulValuta();
            }
        }
        return _instance;
    }



}
