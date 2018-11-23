package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Death;

import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals.Sacrifice;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.TypedCataclysmFabric;

public class DeathCataclysmFactory extends TypedCataclysmFabric {


    @Override
    public CataclysmModel createCataclysm(String name){
        return create(name);
    }
    private CataclysmModel create(String name){
        switch (name){
            default: return null;
        }
    }

}
