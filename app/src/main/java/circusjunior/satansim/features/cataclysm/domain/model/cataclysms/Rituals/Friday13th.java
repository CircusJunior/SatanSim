package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals;

import circusjunior.satansim.dataGlobal.Evnets.Cataclysm.SacrificeEvent;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class Friday13th extends CataclysmModel {
    public Friday13th(){
        super.id= CataclysmEnum.TYPE_RITUALS+'_'+CataclysmEnum.RITUALS_4;
        super.event=new SacrificeEvent(this);
    }
}
