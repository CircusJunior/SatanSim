package circusjunior.satansim.features.cataclysm.domain.model;

import java.util.ArrayList;

import circusjunior.satansim.features.cataclysm.domain.model.Interfaces.DavidStarInterface;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class DavidStar implements DavidStarInterface {
    private final int NUMBER_OF_CATACLYSM_IN_STAR = CataclysmEnum.NUMBER_OF_CATACLYSM_IN_STAR;
    private String type;
    private CataclysmModel[] cataclysms = new CataclysmModel[NUMBER_OF_CATACLYSM_IN_STAR];

    public DavidStar(String type) {
        this.type = type;
        for (int i = 0; i < NUMBER_OF_CATACLYSM_IN_STAR; i++) {
            cataclysms[i] = null;
        }
    }

    @Override
    public CataclysmModel getCataBySlot(int slot) {
        return cataclysms[slot];
    }

    @Override
    public CataclysmModel getCataByID(String id) {
        for (int i = 0; i < NUMBER_OF_CATACLYSM_IN_STAR; i++) {
            if (cataclysms[i] != null) {
                if (cataclysms[i].getID().equals(id)) {
                    return cataclysms[i];
                }
            }
        }
        return null;
    }

    @Override
    public int getSlotByCataID(String id) {
        for (int i = 0; i < NUMBER_OF_CATACLYSM_IN_STAR; i++) {
            if (cataclysms[i] != null) {
                if (cataclysms[i].getID().equals(id)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean is_slotEmpty(int slot) {
        return cataclysms[slot] == null;
    }

    @Override
    public void insertCata(CataclysmModel cata, int slot) {
        cataclysms[slot] = cata;
    }

    @Override
    public void deleteCata(int slot) {
        cataclysms[slot].deleteEvent();
        cataclysms[slot] = null;
    }


    @Override
    public ArrayList<CataclysmModel> getAllCataclysm() {
        ArrayList<CataclysmModel> array = new ArrayList<CataclysmModel>() {
            {
                for (int i = 0; i < NUMBER_OF_CATACLYSM_IN_STAR;i++){
                add(cataclysms[i]);
            }
            }
        };
        return array;
    }

}
