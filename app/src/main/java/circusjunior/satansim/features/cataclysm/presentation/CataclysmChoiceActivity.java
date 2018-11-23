package circusjunior.satansim.features.cataclysm.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.prefs.PreferenceChangeEvent;

import circusjunior.satansim.R;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.features.cataclysm.MvpView;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.domain.model.CataclysmManager;

public class CataclysmChoiceActivity extends BaseActivity implements ActivityView {

    private Button test;
    private CataclysmPresenter cataclysmPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_cataclysm);

        initView();
    }

    private void initView(){

        test = (Button) findViewById(R.id.test);
        test.setText(CataclysmEnum.RITUALS_1);

        Intent intent = getIntent();

        final int slot = intent.getIntExtra("Slot", 0);
        final String type = intent.getStringExtra("Type");


        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button button = (Button)view;
                cataclysmPresenter.goToCataclysmActivity(slot, cataclysmPresenter.createCataclysm(type, button.getText().toString(),slot));
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
    protected MvpPresenter<ActivityView> getPresenter() {
        cataclysmPresenter = new CataclysmPresenter();
        return cataclysmPresenter;
    }

    @Override
    protected ActivityView getMvpView() {
        return this;
    }

    @Override
    public void showView() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void hideActivity(String active, int slot) {
    }

    @Override
    public void hideActivity(String active, int slot, String name) {
        super.onStop();
        Intent intent = new Intent(CataclysmChoiceActivity.this, CataclysmActivity.class);
        intent.putExtra("Slot", slot);
        intent.putExtra("Name"+Integer.toString(slot), name);
        startActivity(intent);
    }

    @Override
    public void exitActivity() {

    }
}
