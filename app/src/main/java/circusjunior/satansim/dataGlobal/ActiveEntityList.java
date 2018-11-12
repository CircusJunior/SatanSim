package circusjunior.satansim.dataGlobal;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActiveEntityList implements EntityIterator {

    ArrayList<Entity> entityList;
    private static ActiveEntityList _instance = null;

    private ActiveEntityList(){
        entityList = new ArrayList<Entity>() {
        }
    }

    public static synchronized ActiveEntityList getInstance(){
        if(_instance == null){
            synchronized
                    if(_instance == null)
                        _instance = new ActiveEntityList();

        }
        return _instance;
    }

    @Override
    public Entity getNext() {
        return null;
    }

    @Override
    public Boolean hasNext() {
        return null;
    }

    @Override
    public void reset() {

    }
}
