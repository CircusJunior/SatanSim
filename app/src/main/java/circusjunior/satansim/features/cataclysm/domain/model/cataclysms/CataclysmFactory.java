package circusjunior.satansim.features.cataclysm.domain.model.cataclysms;

import circusjunior.satansim.dataGlobal.Valuta.SoulValuta;
import circusjunior.satansim.dataGlobal.Valuta.Valuta;
import circusjunior.satansim.dataGlobal.economy.CataclysmCosts;
import circusjunior.satansim.dataGlobal.economy.CataclysmProfit;

public abstract class CataclysmFactory {

    public static CataclysmModel createCataclysm(String type, String name) {
        Valuta soul = SoulValuta.get_instance();
        soul.minusValuta(CataclysmCosts.getCost(name));
        System.out.println("buy Cataclysm with name: "+name);
        System.out.println("And cost: "+CataclysmCosts.getCost(name).getIntView());
        System.out.println("And profit: "+ CataclysmProfit.getProfit(name).getIntView());

        return new CataclysmModel(name,type);
    }
}
