package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.War;

import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals.RitualsCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.TypedCataclysmFabric;

public class WarCataclysmFactory extends TypedCataclysmFabric {

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
