package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean doubleBackToExit =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onBackPressed(){
        if (doubleBackToExit){
            super.onBackPressed();
            return;
        }

        this.doubleBackToExit = true;
        Toast.makeText(this, "Press again to exit",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExit=false;
            }
        }, 2000);
    }

    public void goToSquad(View view) {
        Intent intent = new Intent(MainActivity.this, MenuPlayer.class);
        startActivity(intent);
    }

    public void goToSchedule(View view) {
        Toast.makeText(this, "Sedang dalam pengembangan", Toast.LENGTH_SHORT).show();
    }

    public void goToThophy(View view) {
        Intent intent = new Intent(MainActivity.this, PlayerDetail.class);
        startActivity(intent);
    }

    public void goToAbout(View view) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }

    public void goToPartners(View view){
        Intent intent = new Intent(MainActivity.this, MenuPartners.class);
        startActivity(intent);
    }
}
