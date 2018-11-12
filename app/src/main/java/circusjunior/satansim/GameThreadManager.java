package circusjunior.satansim;

import circusjunior.satansim.dataGlobal.ActiveEventList;
import circusjunior.satansim.dataGlobal.Event;
import circusjunior.satansim.dataGlobal.GameThread;
import circusjunior.satansim.dataGlobal.TestEvent;

public class GameThreadManager {

    public static void GameTreadTest(){
        GameThread gameThread = GameThread.get_instance();
        ActiveEventList activeEventList = ActiveEventList.getInstance();
        Event event = new TestEvent();
        activeEventList.addToEventList(event);
        gameThread.run();
    }
}
