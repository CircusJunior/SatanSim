package circusjunior.satansim.dataGlobal.Valuta;

public class PrimeValuta {
        private static PrimeValuta _instance =null;
        private PrimeValuta(){
            super();
        }


        public static synchronized PrimeValuta get_instance(){
            if(_instance==null){
                synchronized (PrimeValuta.class){
                    if(_instance==null)
                        _instance = new PrimeValuta();
                }
            }
            return _instance;
        }
}


