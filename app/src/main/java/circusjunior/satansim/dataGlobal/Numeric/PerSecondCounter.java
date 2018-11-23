package circusjunior.satansim.dataGlobal.Numeric;

public class PerSecondCounter {
    DifficultInt number;
    private static PerSecondCounter _instance = null;

    private PerSecondCounter(){
        number=new DifficultInt();
    }

    public static synchronized PerSecondCounter get_instance(){
        if(_instance==null){
            synchronized (PerSecondCounter.class){
                if(_instance==null)
                    _instance = new PerSecondCounter();
            }
        }
        return _instance;
    }

    public synchronized void add(DifficultInt increment){
        number.addInt(increment);
    }

    public synchronized void minus(DifficultInt increment){
        number.minusInt(increment);
    }

    public synchronized void reset(){
        number = new DifficultInt();
    }

    public String getActualValue(){
        String actualValue = number.getActualDischarge();
        actualValue = number.getDischarge(actualValue)+" " + actualValue ;
        return actualValue;
    }
}
