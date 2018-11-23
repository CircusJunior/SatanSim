package circusjunior.satansim;


import circusjunior.satansim.dataGlobal.Evnets.ActiveEventList;
import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.dataGlobal.GameThread;
import circusjunior.satansim.dataGlobal.Evnets.TestEvent;
import circusjunior.satansim.features.cataclysm.domain.CataclysmManagerInterface;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmManager;

public class GameThreadManager {
    public static void GameTreadTest() {
        GameThread.get_instance();
        CataclysmManagerInterface manager = CataclysmManager.getInstance();
        manager.createCataclysm(CataclysmEnum.TYPE_DEATH,CataclysmEnum.RITUALS_SACRIFICE,1);
        manager.activeCataclytsm(CataclysmEnum.TYPE_DEATH,1);
        manager.getCataclysm(CataclysmEnum.TYPE_DEATH,1).activeCata();
    }
}