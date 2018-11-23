package circusjunior.satansim.features.cataclysm.presentation;


import java.util.ArrayList;

import circusjunior.satansim.GameThreadManager;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.features.cataclysm.domain.CataclysmInterface;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public final class CataclysmPresenter extends MvpPresenter<ActivityView> implements CataclysmInterface {
    private GameThreadManager gameTM;
    public void testHard() {
        gameTM.GameTreadTest();
    }

    public void goToCataclysmChoiceActivity(){
        view.hideActivity("Cataclysm");
    }

    @Override
    public String createCataclysm(String type, String name, int slot) {
        return null;
    }

    @Override
    public boolean deleteCataclysm(String id) {
        return false;
    }

    @Override
    public CataclysmModel getCataclysm(String id) {
        return null;
    }

    @Override
    public boolean is_CataclysmActive(String id) {
        return false;
    }

    @Override
    public boolean activeCataclytsm(String id) {
        return false;
    }

    @Override
    public ArrayList<CataclysmModel> getAllCataclysmOfThisType(String type) {
        return null;
    }

    @Override
    public ArrayList<CataclysmModel> getAllActiveCataclysmOfThisType(String type) {
        return null;
    }
}
