package circusjunior.satansim.features.cataclysm.domain;

import java.util.ArrayList;

import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public interface CataclysmInterface {
        String createCataclysm(String type,String name,int slot); //return cataclysm id;
        boolean deleteCataclysm(String id);
        CataclysmModel getCataclysm(String id);
        boolean is_CataclysmActive(String id);
        boolean activeCataclytsm(String id);
        ArrayList<CataclysmModel> getAllCataclysmOfThisType(String type);
        ArrayList<CataclysmModel> getAllActiveCataclysmOfThisType(String type);

}
