package circusjunior.satansim.features.cataclysm.domain.model;

import java.util.ArrayList;
import java.util.HashMap;

import circusjunior.satansim.dataGlobal.economy.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.Interface.CataclysmManagerInterface;
import circusjunior.satansim.features.cataclysm.domain.model.Interfaces.DavidStarInterface;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;


public class CataclysmManager implements CataclysmManagerInterface {
    private final int NUMBER_OF_TYPES = CataclysmEnum.NUMBER_OF_TYPES;
    private static final CataclysmManager ourInstance = new CataclysmManager();
    private HashMap<String,DavidStar> starList = new HashMap<>();

    public synchronized static CataclysmManager getInstance() {
        return ourInstance;
    }

    private CataclysmManager() {
        for(String type : CataclysmEnum.getTypesList){
            DavidStar star = new DavidStar(type);
            starList.put(type,star);
        }
    }

    @Override
    public String createCataclysm(String type, String name, int slot) {
        DavidStarInterface star = starList.get(type);
        if(star.is_slotEmpty(slot)){
            CataclysmModel cata = CataclysmFactory.createCataclysm(type,name);
            star.insertCata(cata,slot);
            return cata.getName();
        }else{
            return star.getCataBySlot(slot).getName();
        }
    }

    @Override
    public void deleteCataclysm(String type,int slot) {
        DavidStarInterface star = starList.get(type);
        if(star.is_slotEmpty(slot)){
            //throw??
        }else{
            star.deleteCata(slot);
        }
    }

    @Override
    public CataclysmModel getCataclysm(String type, int slot) {
        DavidStarInterface star = starList.get(type);
        if(star.is_slotEmpty(slot)){
            //throw??
            return null;
        }else{
            return star.getCataBySlot(slot);
        }

    }

    @Override
    public boolean is_CataclysmActive(String type, int slot) {
        DavidStarInterface star = starList.get(type);
        if(star.is_slotEmpty(slot)){
            return false;
        }else{
            return star.getCataBySlot(slot).is_Active();
        }
    }

    @Override
    public void activeCataclytsm(String type, int slot) {
        DavidStarInterface star = starList.get(type);
        if(star.is_slotEmpty(slot)){
            //throw??
        }else{
            if(!star.getCataBySlot(slot).is_Active()){
                star.getCataBySlot(slot).activeCata();
            }
        }
    }


    @Override
    public ArrayList<CataclysmModel> getAllCataclysmOfThisType(String type) {
        DavidStarInterface star = starList.get(type);
        return star.getAllCataclysm();
    }

    @Override
    public ArrayList<CataclysmModel> getAllActiveCataclysmOfThisType(String type) {
        ArrayList<CataclysmModel> array = getAllCataclysmOfThisType(type);
        for(CataclysmModel cata : array){
            if(!cata.is_Active()){
                array.remove(cata);
            }
        }
        return array;
    }

    @Override
    public CataclysmModel[] getListCataclysmInSlots(String type) {
        return starList.get(type).getStarSlots();
    }

    public void DeactivateCata(String ID){

    }
}