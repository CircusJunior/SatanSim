package circusjunior.satansim.features.cataclysm.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import circusjunior.satansim.R;
import circusjunior.satansim.dataGlobal.GameThread;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;

import circusjunior.satansim.features.cataclysm.domain.model.CataclysmEnum;
import circusjunior.satansim.features.cataclysm.presentation.timers.ValutaRefresh;


public class CataclysmActivity extends BaseActivity implements ActivityView {

    private CataclysmPresenter cataclysmPresenter;

    private Button[] buttonCataclysm;
    private int[] buttonCataclysmId = {R.id.cataclism1_button, R.id.cataclism2_button, R.id.cataclism3_button, R.id.cataclism4_button, R.id.cataclism5_button};
    private int buttonCataclysmQuantity = 5;

    private TextView currencySoul;

    private String activeRiders;

    private ValutaRefresh mRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataclysm);

        GameThread.get_instance();

        initView();
    }

    private void initView(){

        currencySoul = (TextView) findViewById(R.id.currency_soul);
        initButton();

        refreshInfoActivity(currencySoul, cataclysmPresenter);

        showView();
    }

    public void refreshInfoActivity(TextView soulView, CataclysmPresenter presenter) {    //обновление информации
        mRefresh = new ValutaRefresh();
        mRefresh.soulRefresh(soulView, presenter);
    }

    public void initButton(){
        buttonCataclysm = new Button[buttonCataclysmQuantity];
        Intent intent = getIntent();

        for(int i=0; i<buttonCataclysmQuantity; i++)
        {
            final int slot = intent.getIntExtra("Slot", i);
            final String name = intent.getStringExtra("Name"+Integer.toString(i));

            buttonCataclysm[i] = (Button) findViewById(buttonCataclysmId[i]);
            buttonCataclysm[i].setText(name);

            final int finalI = i;
            buttonCataclysm[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cataclysmPresenter.fromCataclysmActivityGoToCataclysmChoiceActivity(finalI);
                }
            });
        }
    }

    @Override
    public void showView() {    //запрос состаяния активити на момент ее загрузки
        //currencySoul.setText();     //нужна функция вовращающая кол-во "soul" в формате string
    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void hideActivity(String active, int slot) {
        super.onStop();
        mRefresh.stopRefresh();
        Intent intent = new Intent(CataclysmActivity.this, CataclysmChoiceActivity.class);
        intent.putExtra("Slot", slot);
        intent.putExtra("Type", CataclysmEnum.TYPE_RITUALS);
        startActivity(intent);
    }

    @Override
    public void hideActivity(String active, int slot, String name) {

    }

    @Override
    public void exitActivity() {

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
}
