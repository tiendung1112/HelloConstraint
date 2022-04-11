package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int mCount = 0;
    private TextView mShowCount;
    private View mEditZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mEditZero = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        if(mCount > 0 ) {
            mCount--;
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
            if (mCount == 0) {
                mEditZero.setBackgroundColor(Color.parseColor("#888888"));
            }
        }
    }

    public void countUp(View view) {
        view.setBackgroundColor(Color.parseColor("#01ff90"));
        mEditZero.setBackgroundColor(Color.parseColor("#c02dc0"));
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}