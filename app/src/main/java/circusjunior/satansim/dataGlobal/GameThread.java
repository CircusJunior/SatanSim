package circusjunior.satansim.dataGlobal;

public class GameThread implements Runnable {
    Thread economicalGameThread;

    GameThread(){
        economicalGameThread=new Thread(this,"Economical Game Thread");
        economicalGameThread.setDaemon(true);
        economicalGameThread.start();
    }

    @Override
    public void run() {

    }
}
