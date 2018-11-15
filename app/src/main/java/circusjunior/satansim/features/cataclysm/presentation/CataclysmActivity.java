package circusjunior.satansim.features.cataclysm.presentation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import circusjunior.satansim.R;


public class CataclysmActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private CataclysmPresenter cataclysmPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataclysm);

        Button testButton = (Button)findViewById(R.id.cataclism_catastrofe_1);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cataclysmPresenter = new CataclysmPresenter();
                cataclysmPresenter.testHard();
            }
        });
    }

}
