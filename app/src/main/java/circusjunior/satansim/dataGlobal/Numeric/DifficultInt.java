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
        for(;value>=Discharge.DIS_VALUE;){
            addInt(Discharge.getNext(discharge),1);
            value-=Discharge.DIS_VALUE;
        }
        number.put(discharge,value);
        refreshActualDischarge();
    }

    public void addInt(DifficultInt diffInt){
        for(String discharge : Discharge.DISCHARGE_LIST){
            addInt(discharge,diffInt.getDischarge(discharge));
            if(discharge.equals(diffInt.getActualDischarge())) break;
        }
        refreshActualDischarge();
    }

    public void minusInt(DifficultInt diffInt) {
        if (diffInt.compare(this) <=0) {
            for (String discharge : Discharge.DISCHARGE_LIST) {
                minusInt(discharge, diffInt.getDischarge(discharge));
                if(discharge.equals(diffInt.getActualDischarge())) break;
            }
            refreshActualDischarge();
        }
    }

    public void minusInt(String discharge, int decrement){
        int value = number.get(discharge);
        value-=decrement;
        if(value<0){
            minusInt(Discharge.getNext(discharge),1);
            value+=Discharge.DIS_VALUE-1;
        }
        number.put(discharge,value);
        refreshActualDischarge();
    }

    /**
     *
     * @param difficultInt
     * @return -1 if lower, 0 if equals and 1 if bigger;
     */
    public int compare(DifficultInt difficultInt){
        for(String dis: Discharge.DISCHARGE_LIST){
            if(difficultInt.getDischarge(dis)<this.getDischarge(dis)) return 1;
            else if(difficultInt.getDischarge(dis)>this.getDischarge(dis)) return -1;
            else if(dis.equals(Discharge.HUNDRED)) return 0;
        }
        return 0;
    }

    public void multiply(float f){
        DifficultInt diff;
        for(String dis: Discharge.DISCHARGE_LIST){
            float value = this.getDischarge(dis);
            this.minusInt(dis,Math.round(value));
            value=value*f;
            diff = toDifficltInt(value,dis);
            this.addInt(diff);
        }
    }

    public void divide(float f){
        DifficultInt diff;
        for(String dis: Discharge.DISCHARGE_LIST){
            float value = this.getDischarge(dis);
            this.minusInt(dis,Math.round(value));
            value=value/f;
            diff = toDifficltInt(value,dis);
            this.addInt(diff);
        }
    }

    public int getDischarge(String discharge){
        return number.get(discharge);
    }

    public String getActualDischarge(){
        return actualDischarge;
    }

    public DifficultInt toDifficltInt(float f, String discharge){
        DifficultInt diff = new DifficultInt();
        diff.addInt(discharge,(int)f);
        if(discharge!=Discharge.HUNDRED){
            if(f-(int)f>0){
                diff.addInt(toDifficltInt((f-(int)f)*Discharge.DIS_VALUE,Discharge.getPrev(discharge)));
            }
        }
        return diff;
    }

    public String getIntView(){
        String view;
        String actualDischarge = this.getActualDischarge();
        if(actualDischarge.equals(Discharge.HUNDRED)){
            view = this.getDischarge(actualDischarge) +" "+actualDischarge;
        }else{
            if(this.getDischarge(actualDischarge)<10){
                if((this.getDischarge(Discharge.getPrev(actualDischarge))/100)==0)
                    view = this.getDischarge(actualDischarge)+"."+"0"+(int)(this.getDischarge(Discharge.getPrev(actualDischarge))/10)+" "+actualDischarge;
                else
                    view = this.getDischarge(actualDischarge)+"."+(int)(this.getDischarge(Discharge.getPrev(actualDischarge))/10)+" "+actualDischarge;
            } else
                view = this.getDischarge(actualDischarge)+"."+ (int)(this.getDischarge(Discharge.getPrev(actualDischarge))/100)+" "+actualDischarge;
        }
        return view;
    }
}
