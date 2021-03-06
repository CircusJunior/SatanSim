package circusjunior.satansim.features.cataclysm.presentation;

import circusjunior.satansim.dataGlobal.Localize.Localisator;
import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.features.cataclysm.Interface.CataclysmManagerInterface;
import circusjunior.satansim.features.cataclysm.Interface.ValutaInterface;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.dataGlobal.economy.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmManager;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

import static circusjunior.satansim.dataGlobal.economy.CataclysmEnum.NUMBER_OF_CATACLYSM_IN_STAR;

public final class CataclysmPresenter extends MvpPresenter<ActivityView> {
    private CataclysmManagerInterface managerInterface = CataclysmManager.getInstance();
    private ValutaInterface soulValuta = SoulValuta.get_instance();

    public void fromCataclysmActivityGoToCataclysmChoiceActivity(int slot) {
        view.hideActivity("CataclysmActivity", slot);
    }

    public void fromCataclysmChoiceActivityGoToCataclysmActivity(int slot, String name) {
        view.hideActivity("CataclysmChoiceActivity", slot, name);
    }

    public String createCataclysm(String type, String name, int slot) {
        managerInterface.createCataclysm(type, name, slot);
        managerInterface.activeCataclytsm(type, slot);
        return name;
    }

    public String getCurrencySoul() {
        return soulValuta.getViewValue();
    }

    public String changeRider(int type) {
        //!!!!!!!!!!!!!!!!!!метод смены всадников!!!!!!!!!!!!!!!!!!
        switch (type) {
            case 0:
                return CataclysmEnum.TYPE_RITUALS;
            case 1:
                return CataclysmEnum.TYPE_HUNGER;
            case 2:
                return CataclysmEnum.TYPE_PLAGUE;
            case 3:
                return CataclysmEnum.TYPE_WAR;
            case 4:
                return CataclysmEnum.TYPE_DEATH;
            default: return "ERROR";
        }
    }

    public int[] refreshCataclysmActivity(String type){
        CataclysmModel[] activeCataclysm;
        activeCataclysm = managerInterface.getListCataclysmInSlots(type);
        int[] nameCataclysm = new int[NUMBER_OF_CATACLYSM_IN_STAR];
        for(int i=0; i<NUMBER_OF_CATACLYSM_IN_STAR; i++){
            if(activeCataclysm[i] != null)
                nameCataclysm[i] = Localisator.getLocalziseName(activeCataclysm[i].getName());
        }
        return nameCataclysm;
    }
}