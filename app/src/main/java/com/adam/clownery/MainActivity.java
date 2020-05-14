package com.adam.clownery;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer clownBiteMF = MediaPlayer.create(this, R.raw.clownbitef);

        final MediaPlayer heyClownMF = MediaPlayer.create(this, R.raw.heyclown);

        final MediaPlayer youKnowMF = MediaPlayer.create(this,R.raw.youknow);

        final MediaPlayer imAClownMF = MediaPlayer.create(this, R.raw.imaclown);


        Button clownBiteBtn = (Button) this.findViewById(R.id.clownBiteBtn);
        Button heyClownBtn = (Button) this.findViewById(R.id.heyClownBtn);
        Button youKnowBtn = (Button) this.findViewById(R.id.youKnowBtn);
        Button imAClownBtn = (Button) this.findViewById(R.id.imAClownBtn);

        clownBiteBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                clownBiteMF.start();
            }
        });

        heyClownBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                heyClownMF.start();
            }
        });

        youKnowBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                youKnowMF.start();
            }
        });

        imAClownBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                imAClownMF.start();
            }
        });




        }
    }


