package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Death;

import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class Sacrifice extends CataclysmModel {

    public Sacrifice(){
        super.event=new SacrificeEvent();
        super.id=CataclysmEnum.TYPE_DEATH+'_'+CataclysmEnum.RITUALS_SACRIFICE;
    }

}
