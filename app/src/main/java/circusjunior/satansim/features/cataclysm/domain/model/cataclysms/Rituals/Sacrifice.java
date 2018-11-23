package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals;

import circusjunior.satansim.dataGlobal.Evnets.SacrificeEvent;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class Sacrifice extends CataclysmModel {

    public Sacrifice(){
        super.event=new SacrificeEvent();
        super.id=CataclysmEnum.TYPE_RITUALS+'_'+CataclysmEnum.RITUALS_SACRIFICE;
    }

}
