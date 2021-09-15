package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeview;
    private CakeModel cakemodel;

    public CakeController(CakeView cv){
        cakeview = cv;
        cakemodel = cv.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.i("button", "Clicked");
        cakemodel.lit = false;
        cakeview.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.i("button", "clickedBoi");
        cakemodel.hasCandles = !cakemodel.hasCandles;
        cakeview.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakemodel.candleCount = i;

        cakeview.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
