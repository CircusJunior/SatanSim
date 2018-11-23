package circusjunior.satansim.features.cataclysm.domain;

import java.util.ArrayList;

import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public interface CataclysmManagerInterface {
        String createCataclysm(String type,String name,int slot); //return cataclysm id;
        void deleteCataclysm(String type,int slot);
        CataclysmModel getCataclysm(String type, int slot);
        boolean is_CataclysmActive(String type, int slot);
        void activeCataclytsm(String type,int slot);
        ArrayList<CataclysmModel> getAllCataclysmOfThisType(String type); //return all cataclysm on type acticity
        ArrayList<CataclysmModel> getAllActiveCataclysmOfThisType(String type);
}
