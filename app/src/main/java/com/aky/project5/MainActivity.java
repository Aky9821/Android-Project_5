package com.aky.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean kiraVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kiraFunction(View v) {
        ImageView kira = findViewById(R.id.KiraImageView);
        ImageView l = findViewById(R.id.lImageView);
        if (kiraVisible) {
            kira.animate().alpha(0).setDuration(2000);
            l.animate().alpha(1).setDuration(2000);
            kiraVisible = false;
        } else {
            kira.animate().alpha(1).setDuration(2000);
            l.animate().alpha(0).setDuration(2000);
            kiraVisible = true;
        }
    }
}