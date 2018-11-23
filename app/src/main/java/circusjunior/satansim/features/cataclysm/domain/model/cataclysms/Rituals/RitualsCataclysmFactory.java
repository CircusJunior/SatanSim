package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals;

import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Plague.PlagueCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.TypedCataclysmFabric;

public class RitualsCataclysmFactory extends TypedCataclysmFabric {

    @Override
    public CataclysmModel createCataclysm(String name){
        return create(name);
    }

    private CataclysmModel create(String name){
        switch (name){
        }
        return null;
    }
}
