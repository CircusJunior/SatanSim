package circusjunior.satansim.features.cataclysm.presentation.timers;

import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import circusjunior.satansim.features.cataclysm.presentation.CataclysmPresenter;

public class ValutaRefresh {
    private Timer mTimer;
    private TimerTask mTimerTask;

    public ValutaRefresh() {
        mTimer = new Timer();
    }

    public void soulRefresh(final TextView soulView, final CataclysmPresenter presenter) {
            mTimerTask = new TimerTask() {
            @Override
            public void run() {
                soulView.post(new Runnable() {
                    @Override
                    public void run() {
                        soulView.setText(presenter.getCurrencySoul());
                    }
                });
            }
            };
            mTimer.schedule(mTimerTask, 0, 1000);
        }

    public void stopRefresh() {
        mTimer.cancel();
    }
}