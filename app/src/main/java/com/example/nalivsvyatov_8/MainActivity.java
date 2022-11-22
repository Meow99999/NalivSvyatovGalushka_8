package com.example.nalivsvyatov_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    private ImageSwitcher mImageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
    }

    public void onSwitcherClick(View view){
        mImageSwitcher.showNext();
    }
}