package circusjunior.satansim.features.cataclysm.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import circusjunior.satansim.R;
import circusjunior.satansim.dataGlobal.Localize.Localisator;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.dataGlobal.economy.CataclysmEnum;

public class CataclysmChoiceActivity extends BaseActivity implements ActivityView {

    private Button[] buttonCataclism;

    private CataclysmPresenter cataclysmPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_cataclysm);

        initView();
    }

    private void initView(){

        //Прогрммное создание View
        LinearLayout rootLinLayout = new LinearLayout(this);
        rootLinLayout.setOrientation(LinearLayout.VERTICAL);

        ViewGroup.LayoutParams linLayoutParam = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        setContentView(rootLinLayout, linLayoutParam);

        ViewGroup.LayoutParams lpView = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        initButton(rootLinLayout, lpView);

    }

    public void initButton(LinearLayout root, ViewGroup.LayoutParams properties){
        Intent intent = getIntent();
        final int slot = intent.getIntExtra("Slot", 0);
        final String type = intent.getStringExtra("Type");

        List<String> nameButton = CataclysmEnum.getCataclysmListByType(type);

        buttonCataclism = new Button[nameButton.size()];

        for(int i=0; i<nameButton.size(); i++) {
            buttonCataclism[i] = new Button(this);
            buttonCataclism[i].setGravity(Gravity.CENTER);
            root.addView(buttonCataclism[i], properties);
            buttonCataclism[i].setText(Localisator.getLocalziseName(nameButton.get(i)));

            final String name = nameButton.get(i);

            buttonCataclism[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cataclysmPresenter.fromCataclysmChoiceActivityGoToCataclysmActivity(slot, cataclysmPresenter.createCataclysm(type, name, slot));
                }
            });
        }
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
