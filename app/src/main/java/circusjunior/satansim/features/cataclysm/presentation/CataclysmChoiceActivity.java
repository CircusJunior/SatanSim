package circusjunior.satansim.features.cataclysm.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import circusjunior.satansim.R;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.features.cataclysm.MvpView;

public class CataclysmChoiceActivity extends BaseActivity implements ActivityView {

    private Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_cataclysm);

        initView();
    }

    private void initView(){

        test = (Button) findViewById(R.id.test);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        /*// создание LinearLayout
        LinearLayout linLayout = new LinearLayout(this);
        // установим вертикальную ориентацию
        linLayout.setOrientation(LinearLayout.VERTICAL);
        // создаем LayoutParams
        ViewGroup.LayoutParams linLayoutParam = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // устанавливаем linLayout как корневой элемент экрана
        setContentView(linLayout, linLayoutParam);*/

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
