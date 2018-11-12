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

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case circusjunior.satansim.R.id.navigation_cataclysm:
                    mTextMessage.setText(R.string.title_cataclysm);
                    return true;
                case R.id.navigation_temptation:
                    mTextMessage.setText(R.string.title_temptation);
                    return true;
                case R.id.navigation_apocalipsys:
                    mTextMessage.setText(R.string.title_apocalipsys);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataclysm);
        
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Button testButton = (Button)findViewById(R.id.test);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cataclysmPresenter = new CataclysmPresenter();
                cataclysmPresenter.testHard();
            }
        });
    }

}
