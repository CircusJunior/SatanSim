package circusjunior.satansim.features.cataclysm.domain.model.Interfaces;

import java.util.ArrayList;

import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public interface DavidStarInterface {
    CataclysmModel getCataBySlot(int slot);
    CataclysmModel getCataByID(String id);
    int getSlotByCataID(String id);
    boolean is_slotEmpty(int slot);
    void insertCata(CataclysmModel cata,int slot);
    void deleteCata(int slot);
    ArrayList<CataclysmModel> getAllCataclysm();
}
