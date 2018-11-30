package circusjunior.satansim.features.cataclysm.presentation;

import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.features.cataclysm.Interface.CataclysmManagerInterface;
import circusjunior.satansim.features.cataclysm.Interface.ValutaInterface;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.dataGlobal.economy.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmManager;

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
                return CataclysmEnum.TYPE_1;
            case 1:
                return CataclysmEnum.TYPE_2;
            case 2:
                return CataclysmEnum.TYPE_3;
            case 3:
                return CataclysmEnum.TYPE_4;
            case 4:
                return CataclysmEnum.TYPE_5;
            default: return "ERROR";
        }
    }
}