package circusjunior.satansim.features.cataclysm.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import circusjunior.satansim.R;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;
import circusjunior.satansim.dataGlobal.economy.CataclysmEnum;

public class CataclysmChoiceActivity extends BaseActivity implements ActivityView {

    private Button[] buttonCataclism;
    private int testQuantity = 5;
    private String[] testEnum = {CataclysmEnum.RITUALS_1, CataclysmEnum.RITUALS_2, CataclysmEnum.RITUALS_3, CataclysmEnum.RITUALS_4, CataclysmEnum.RITUALS_5};

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

        //!!!!!!!!!!!!!!!!! все нужно в цикле!!!!!!!!!!!!!!!!!!!

        buttonCataclism = new Button[testQuantity];

        Intent intent = getIntent();
        final int slot = intent.getIntExtra("Slot", 0);
        final String type = intent.getStringExtra("Type");

        for(int i=0; i<testQuantity; i++)
        {
            buttonCataclism[i] = new Button(this);
            buttonCataclism[i].setGravity(Gravity.CENTER);
            root.addView(buttonCataclism[i], properties);
            final String name = testEnum[i];

            buttonCataclism[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Button button = (Button)view;
                    cataclysmPresenter.fromCataclysmChoiceActivityGoToCataclysmActivity(slot, cataclysmPresenter.createCataclysm(type, name ,slot));
                }
            });
        }
        buttonCataclism[0].setText(R.string.RITUALS_1);
        buttonCataclism[1].setText(R.string.RITUALS_2);
        buttonCataclism[2].setText(R.string.RITUALS_3);
        buttonCataclism[3].setText(R.string.RITUALS_4);
        buttonCataclism[4].setText(R.string.RITUALS_5);

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
