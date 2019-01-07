package com.lewis.eparser;

import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.lewis.eventparser.OnEventListener;
import com.lewis.eventparser.Orientation;

public class MainActivity extends AppCompatActivity implements OnEventListener {
    EventView viewTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewTest = findViewById(R.id.evview);
        viewTest.setOnEventListener(this);
    }


    @Override
    public void down(PointF pointF) {
//        Toast.makeText(this, "down pointFx=" + Math.round(pointF.x) + "pointFy=" +  Math.round(pointF.y), Toast.LENGTH_LONG).show();
    }

    @Override
    public void up(PointF pointF, Orientation orientation) {
//        Toast.makeText(this, "up pointFx=" +  Math.round(pointF.x) + "pointFy=" +
//                Math.round(pointF.y)+"orientation="+orientation.value(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void move(double v, float dy, float dx, double dir, Orientation orientation) {
        Toast.makeText(this, "move v=" +Math.round(v) + "dy=" +
                Math.round(dy)+ "dx=" +  Math.round(dx)+
                "dir=" + Math.round(dir)+"orientation="+orientation.value(), Toast.LENGTH_LONG).show();
    }
}
