package circusjunior.satansim.features.cataclysm.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import circusjunior.satansim.R;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.features.cataclysm.MvpView;

public class CataclysmChoiceActivity extends BaseActivity implements ActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_cataclysm);

        initView();
    }

    private void initView(){
        
    }

    @Override
    protected <T extends MvpView> MvpPresenter<T> getPresenter() {
        return null;
    }

    @Override
    protected ActivityView getMvpView() {
        return null;
    }

    @Override
    public void showView() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void hideActivity(String active) {

    }

    @Override
    public void exitActivity() {

    }
}
