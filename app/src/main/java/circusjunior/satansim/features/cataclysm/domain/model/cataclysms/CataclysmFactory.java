package circusjunior.satansim.features.cataclysm.domain.model.cataclysms;

import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Death.DeathCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Hunger.HungerCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Plague.PlagueCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals.RitualsCataclysmFactory;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.War.WarCataclysmFactory;

public abstract class CataclysmFactory {

    public static CataclysmModel createCataclysm(String type, String name) {
        return getTypedFabric(type).createCataclysm(name);
    }
    private static TypedCataclysmFabric getTypedFabric(String type){
        switch (type){
            case CataclysmEnum.TYPE_DEATH:
                return new DeathCataclysmFactory();
            case CataclysmEnum.TYPE_HUNGER:
                return new HungerCataclysmFactory();
            case CataclysmEnum.TYPE_PLAGUE:
                return new PlagueCataclysmFactory();
            case CataclysmEnum.TYPE_RITUALS:
                return new RitualsCataclysmFactory();
            case CataclysmEnum.TYPE_WAR:
                return new WarCataclysmFactory();
            default:
                return null;
        }
    }
}
