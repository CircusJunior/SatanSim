package circusjunior.satansim.features.cataclysm.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import circusjunior.satansim.R;
import circusjunior.satansim.features.cataclysm.BaseActivity;
import circusjunior.satansim.features.cataclysm.MvpPresenter;


public class CataclysmActivity extends BaseActivity implements ActivityView {

    private CataclysmPresenter cataclysmPresenter;
    private Button[] buttonCataclysm;
    private int[] buttonCataclysmId = {R.id.cataclism1_button, R.id.cataclism2_button, R.id.cataclism3_button, R.id.cataclism4_button, R.id.cataclism5_button};

    private int buttonCataclysmQuantity = 5;

    private TextView currencySoul;

    private String activeRiders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataclysm);

        initView();
    }

    private void initView(){
        buttonCataclysm = new Button[buttonCataclysmQuantity];

        currencySoul = (TextView) findViewById(R.id.currency_soul);

        for(int i=0; i<buttonCataclysmQuantity; i++)
        {
            buttonCataclysm[i] = (Button) findViewById(buttonCataclysmId[i]);
            final int finalI = i;
            buttonCataclysm[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cataclysmPresenter.goToCataclysmChoiceActivity(finalI);
                }
            });
        }

        showView();
    }

    public void refreshInfoActivity() {    //обновление информации

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
        Intent intent = new Intent(CataclysmActivity.this, CataclysmChoiceActivity.class);
        intent.putExtra("Slot", slot);
        intent.putExtra("Type", slot);
        startActivity(intent);
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
