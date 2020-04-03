package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class PlayerDetail extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_BIO = "extra_bio";
    public static final String EXTRA_NUMBER = "extra_number";
    public static final String EXTRA_POS = "extra_pos";
    public static final String EXTRA_HEIGHT = "extra_height";
    public static final String EXTRA_WEIGHT = "extra_weight";
    public static final String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorDetail));


        TextView tvPlayerName = findViewById(R.id.player_name);
        TextView tvPlayerNumber = findViewById(R.id.number_player);
        TextView tvPlayerPosition = findViewById(R.id.player_position);
        TextView tvHeight = findViewById(R.id.playerHeight);
        TextView tvWeight = findViewById(R.id.playerWeight);
        TextView tvAge = findViewById(R.id.player_age);
        ImageView imgPlayer = findViewById(R.id.img_player);
        TextView tvBio = findViewById(R.id.player_bio);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String age = getIntent().getStringExtra(EXTRA_AGE);
        String bio = getIntent().getStringExtra(EXTRA_BIO);
        String height = getIntent().getStringExtra(EXTRA_HEIGHT);
        String pos = getIntent().getStringExtra(EXTRA_POS);
        String weight = getIntent().getStringExtra(EXTRA_WEIGHT);
        String number = getIntent().getStringExtra(EXTRA_NUMBER);
        int img = getIntent().getIntExtra(EXTRA_IMAGE,0);

        tvPlayerName.setText(name);
        tvAge.setText(age);
        tvBio.setText(bio);
        tvHeight.setText(height);
        tvWeight.setText(weight);
        tvPlayerNumber.setText(number);
        tvPlayerPosition.setText(pos);
        imgPlayer.setImageResource(img);
    }
}
