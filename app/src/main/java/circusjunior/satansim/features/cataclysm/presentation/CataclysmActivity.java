package circusjunior.satansim.features.cataclysm.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import circusjunior.satansim.R;


public class CataclysmActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private CataclysmPresenter cataclysmPresenter;

    private int n = 5;

    private Button[] bCataclismCatastrofe;
    private int[] butonCataclismIds = {R.id.cataclism_catastrofe_1, R.id.cataclism_catastrofe_2,
            R.id.cataclism_catastrofe_3, R.id.cataclism_catastrofe_4, R.id.cataclism_catastrofe_5};

    private Button[] bCataclismCatastrofeUpdate;
    private int[] butonCataclismUpdateIds = {R.id.cataclism_catastrofeUpdate_1, R.id.cataclism_catastrofeUpdate_2,
            R.id.cataclism_catastrofeUpdate_3, R.id.cataclism_catastrofeUpdate_4, R.id.cataclism_catastrofeUpdate_5};


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataclysm);

        bCataclismCatastrofe = new Button[n];
        bCataclismCatastrofeUpdate = new Button[n];

        for(int i=0; i<n; i++) {
            bCataclismCatastrofe[i] = (Button) findViewById(butonCataclismIds[i]);
            bCataclismCatastrofeUpdate[i] =(Button) findViewById(butonCataclismUpdateIds[i]);
        }

        bCataclismCatastrofe[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cataclysmPresenter = new CataclysmPresenter();
                cataclysmPresenter.testHard();
            }
        });

    }

}
