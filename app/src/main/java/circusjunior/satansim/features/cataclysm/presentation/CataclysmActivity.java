package circusjunior.satansim.features.cataclysm.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;import android.widget.TextView;
import circusjunior.satansim.R;


public class CataclysmActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private CataclysmPresenter cataclysmPresenter;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataclysm);

       /* bCataclismCatastrofe[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cataclysmPresenter = new CataclysmPresenter();
                cataclysmPresenter.testHard();
            }
        });*/

    }

}
