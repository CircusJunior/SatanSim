package circusjunior.satansim;


import circusjunior.satansim.dataGlobal.Evnets.ActiveEventList;
import circusjunior.satansim.dataGlobal.Evnets.Event;
import circusjunior.satansim.dataGlobal.GameThread;
import circusjunior.satansim.dataGlobal.Evnets.TestEvent;

public class GameThreadManager {
    private static int i=0;
    public static void GameTreadTest(){
        GameThread gameThread = GameThread.get_instance();
        ActiveEventList activeEventList = ActiveEventList.getInstance();
            Event event = new TestEvent();
            activeEventList.addToEventList(event);
    }
}