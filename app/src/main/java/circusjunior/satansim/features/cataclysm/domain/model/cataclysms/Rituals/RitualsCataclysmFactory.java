package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals;

import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.TypedCataclysmFabric;

public class RitualsCataclysmFactory extends TypedCataclysmFabric {

    @Override
    public CataclysmModel createCataclysm(String name){
        return create(name);
    }

    private CataclysmModel create(String name){
        switch (name){
            case CataclysmEnum.RITUALS_1:
                return new Sacrifice();
            case CataclysmEnum.RITUALS_2:
                return new SadomAndGamora();
            case CataclysmEnum.RITUALS_3:
                return new GreatDepression();
            case CataclysmEnum.RITUALS_4:
                return new Friday13th();
            case CataclysmEnum.RITUALS_5:
                return  new ValpuresNight();
        }
        return null;
    }
}
