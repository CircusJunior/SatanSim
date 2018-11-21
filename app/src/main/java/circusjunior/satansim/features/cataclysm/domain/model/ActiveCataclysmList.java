package circusjunior.satansim.features.cataclysm.domain.model;

public class ActiveCataclysmList {
    private static final ActiveCataclysmList ourInstance = new ActiveCataclysmList();

    public synchronized static ActiveCataclysmList getInstance() {
        return ourInstance;
    }

    private ActiveCataclysmList() {
    }
}
