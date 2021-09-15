package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeview = (CakeView) findViewById(R.id.cakeview);
        CakeController control = new CakeController(cakeview);

        Button blowOut = (Button) findViewById(R.id.blowout);
        blowOut.setOnClickListener(control);

        Switch candleSwitch = (Switch) findViewById(R.id.candlesSwitch);
        candleSwitch.setOnCheckedChangeListener(control);

        SeekBar candleCountBar = (SeekBar) findViewById(R.id.candleNumber);
        candleCountBar.setOnSeekBarChangeListener(control);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
