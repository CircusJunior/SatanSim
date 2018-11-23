package circusjunior.satansim.features.cataclysm.domain.model.cataclysms.Rituals;

import circusjunior.satansim.dataGlobal.Evnets.Cataclysm.SacrificeEvent;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.cataclysms.CataclysmModel;

public class GreatDepression extends CataclysmModel {
    public GreatDepression(){
        super.id= CataclysmEnum.TYPE_RITUALS+'_'+CataclysmEnum.RITUALS_3;
        super.event=new SacrificeEvent(this);
    }
}
