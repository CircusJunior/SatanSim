package circusjunior.satansim.features.cataclysm.presentation;

import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.features.cataclysm.Interface.CataclysmManagerInterface;
import circusjunior.satansim.features.cataclysm.Interface.ValutaInterface;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmManager;

public final class CataclysmPresenter extends MvpPresenter<ActivityView>  {
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
        managerInterface.activeCataclytsm(type,slot);
        return name;
    }

    public String getCurrencySoul(){
        return soulValuta.getViewValue();
    }
}