package circusjunior.satansim.features.cataclysm.presentation;


import java.util.ArrayList;

import circusjunior.satansim.GameThreadManager;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.features.cataclysm.domain.CataclysmManagerInterface;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public final class CataclysmPresenter extends MvpPresenter<ActivityView> implements CataclysmManagerInterface {
    private GameThreadManager gameTM;

    public void testHard() {
        gameTM.GameTreadTest();
    }

    public void goToCataclysmChoiceActivity() {
        view.hideActivity("Cataclysm");
    }

    @Override
    public String createCataclysm(String type, String name, int slot) {
        return null;
    }

    @Override
    public void deleteCataclysm(String type, int slot) {

    }

    @Override
    public CataclysmModel getCataclysm(String type, int slot) {
        return null;
    }

    @Override
    public boolean is_CataclysmActive(String type, int slot) {
        return false;
    }

    @Override
    public void activeCataclytsm(String type, int slot) {

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