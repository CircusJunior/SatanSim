package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Hunger;

import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Death.DeathCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.TypedCataclysmFabric;

public class HungerCataclysmFactory extends TypedCataclysmFabric {

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
