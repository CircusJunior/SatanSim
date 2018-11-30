package circusjunior.satansim.dataGlobal.Numeric;

import java.util.HashMap;

public class DifficultInt {
    private HashMap<String,Integer> number;
    private String actualDischarge;
    public DifficultInt(){
        number=new HashMap<>();
        for(String key : Discharge.DISCHARGE_LIST){
            number.put(key,0);
        }
        actualDischarge =Discharge.HUNDRED;
    }

    /**
     *
     * @param args sequence of costs
     */
    public DifficultInt(int... args){
        this();
        int i=1;
            for (String dis : Discharge.DISCHARGE_LIST) {
                addInt(dis, args[args.length-i]);
                i++;
                if(i>args.length) break;
            }
    }



    private void refreshActualDischarge(){
        if(this.getDischarge(Discharge.getNext(actualDischarge))!=0){
            actualDischarge=Discharge.getNext(actualDischarge);
        }
    }
    public void addInt(String discharge, int increment){
        int value = number.get(discharge);
        value+=increment;
        for(;value>Discharge.DIS_VALUE;){
            addInt(Discharge.getNext(discharge),1);
            value-=Discharge.DIS_VALUE;
        }
        number.put(discharge,value);
        refreshActualDischarge();
    }

    public void addInt(DifficultInt diffInt){
        for(String discharge : Discharge.DISCHARGE_LIST){
            addInt(discharge,diffInt.getDischarge(discharge));
        }
        refreshActualDischarge();
    }
    public void minusInt(DifficultInt diffInt){
        for(String discharge : Discharge.DISCHARGE_LIST){
            minusInt(discharge,diffInt.getDischarge(discharge));
        }
        refreshActualDischarge();
    }

    public void minusInt(String discharge, int decrement){
        int value = number.get(discharge);
        value-=decrement;
        for(;value<0;){
            minusInt(Discharge.getNext(discharge),1);
            value+=Discharge.DIS_VALUE-1;
        }
        number.put(discharge,value);
        refreshActualDischarge();
    }

    public int getDischarge(String discharge){
        return number.get(discharge);
    }
    public String getActualDischarge(){
        return actualDischarge;
    }


}
