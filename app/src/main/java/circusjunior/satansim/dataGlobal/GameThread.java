package circusjunior.satansim.dataGlobal;

import java.util.Iterator;

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
        try {
            for(Iterator<Event> eventIterator = ActiveEventList.getIterator(); eventIterator.hasNext();){
                Event event = eventIterator.next();
                event.activateEvent();
            }
        } catch (Exception e) {
            System.out.println("Game Thread interrupted" + e.getMessage());
        }
        System.out.println("Game Thread Finished");
    }
}

