package circusjunior.satansim.features.cataclysm.domain.model.cataclysms;

public abstract class CataclysmFactory {

    public static CataclysmModel createCataclysm(String type, String name) {
        return new CataclysmModel(name,type);
    }
}
