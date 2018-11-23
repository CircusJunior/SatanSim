package circusjunior.satansim.features.cataclysm.presentation;

import circusjunior.satansim.features.cataclysm.MvpView;

public interface ActivityView extends MvpView {

    void showView();

    void showError(String message);

    void hideActivity(String active, int slot);

    void hideActivity(String active, int slot, String name);

    void exitActivity();
}
