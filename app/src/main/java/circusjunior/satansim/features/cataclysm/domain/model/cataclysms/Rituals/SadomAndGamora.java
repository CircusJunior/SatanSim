package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals;

import circusjunior.satansim.dataGlobal.Evnets.Cataclysm.SacrificeEvent;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class SadomAndGamora extends CataclysmModel {
    public SadomAndGamora(){
        super.id= CataclysmEnum.TYPE_RITUALS+'_'+CataclysmEnum.RITUALS_2;
        super.event=new SacrificeEvent(this);
    }
}
