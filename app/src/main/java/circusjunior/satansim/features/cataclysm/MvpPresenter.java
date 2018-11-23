package circusjunior.satansim.features.cataclysm;

public class MvpPresenter<View> {

    protected View view;

    public void attachView(View view) {
        this.view = view;

    }

    public void detachView() {
        view = null;
    }

    protected void onViewReady() {
        // override if need
    }
}
