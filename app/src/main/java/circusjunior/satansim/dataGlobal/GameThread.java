package circusjunior.satansim.dataGlobal;

import java.util.Iterator;

import circusjunior.satansim.dataGlobal.Evnets.ActiveEventList;
import circusjunior.satansim.dataGlobal.Evnets.Event;

public class GameThread implements Runnable {
    private static Thread economicalGameThread = null;
    private static GameThread _instance = null;

    private GameThread(){
        economicalGameThread=new Thread(this,"Economical Game Thread");
        economicalGameThread.setDaemon(true);
        System.out.println("Game Thread Created");
        economicalGameThread.start();
    }

    public synchronized static GameThread get_instance(){
        if(_instance == null){
            _instance = new GameThread();
        }
        return _instance;
    }

    @Override
    public void run() {

        System.out.println("Game Thread Start");
        try {
            while(true){
                int i=0;
                for(Iterator<Event> eventIterator = ActiveEventList.getIterator(); eventIterator.hasNext();) {
                    Event event = eventIterator.next();
                    event.activateEvent();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Game Thread interrupted: " + e.toString()+'\n');
            e.printStackTrace();

            //it's a bad way to avoid java.util.ConcurrentModificationException
            //TODO: make distributed and synchronized access to ActiveEventList and his Iterator
            this.run();
        }
        System.out.println("Game Thread Finished");

    }
}

